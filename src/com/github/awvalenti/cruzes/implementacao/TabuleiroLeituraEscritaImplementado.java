package com.github.awvalenti.cruzes.implementacao;

import static com.github.awvalenti.cruzes.api.enums.ConteudoCasa.MAIS;
import static com.github.awvalenti.cruzes.api.enums.ConteudoCasa.NADA;
import static com.github.awvalenti.cruzes.api.enums.ConteudoCasa.XIS;
import static com.github.awvalenti.cruzes.api.enums.CorCasa.BRANCA;
import static com.github.awvalenti.cruzes.api.enums.CorCasa.PRETA;

import com.github.awvalenti.cruzes.api.enums.ConteudoCasa;
import com.github.awvalenti.cruzes.api.enums.CorCasa;
import com.github.awvalenti.cruzes.api.enums.Time;
import com.github.awvalenti.cruzes.api.excecoes.MovimentoInvalidoException;
import com.github.awvalenti.cruzes.api.excecoes.PosicaoInvalidaException;
import com.github.awvalenti.cruzes.api.interfaces.Casa;
import com.github.awvalenti.cruzes.api.interfaces.Movimento;
import com.github.awvalenti.cruzes.api.interfaces.Posicao;
import com.github.awvalenti.cruzes.api.interfaces.TabuleiroLeituraEscrita;

public class TabuleiroLeituraEscritaImplementado implements
		TabuleiroLeituraEscrita {

	private static final int MAX_MOVIMENTO = 1;
	private final int tamanho;
	private final CasaImplementada[][] tabuleiro;
	private Time vez;

	public TabuleiroLeituraEscritaImplementado(final int tamanho) {
		// Tamanho
		this.tamanho = tamanho;

		// Turnos
		this.vez = Time.XIS;

		// Tabuleiro
		this.tabuleiro = new CasaImplementada[this.tamanho][this.tamanho];
		for (int x = 0; x < tabuleiro.length; x++) {
			for (int y = 0; y < tabuleiro[x].length; y++) {
				this.tabuleiro[x][y] = new CasaImplementada(escolherCor(x + y),
						escolherConteudo(y, x));
			}
		}
	}

	private ConteudoCasa escolherConteudo(final int coluna, final int linha) {
		if (coluna % 2 == 0 && linha == 0) {
			return XIS;
		}

		if (coluna % 2 == 0 && linha + 1 == this.tamanho) {
			return MAIS;
		}

		return NADA;
	}

	private CorCasa escolherCor(final int un) {
		return un % 2 > 0 ? BRANCA : PRETA;
	}

	@Override
	public int getNumeroLinhas() {
		return tamanho;
	}

	@Override
	public int getNumeroColunas() {
		return tamanho;
	}

	@Override
	public CorCasa getCorDaCasa(final Posicao p)
			throws PosicaoInvalidaException {
		return getCasa(p).getCor();
	}

	@Override
	public ConteudoCasa getConteudoDaCasa(final Posicao p)
			throws PosicaoInvalidaException {
		return getCasa(p).getConteudo();
	}

	private CasaImplementada getCasa(final Posicao p)
			throws PosicaoInvalidaException {
		validatePosition(p);
		return this.tabuleiro[p.getLinha()][p.getColuna()];

	}

	private void validatePosition(final Posicao p)
			throws PosicaoInvalidaException {
		if (!isPositionValid(p)) {
			throw new PosicaoInvalidaException();
		}
	}

	private boolean isPositionValid(final Posicao p) {
		if (p == null) {
			return false;
		}

		if (!isDimensionValid(p.getLinha()) || !isDimensionValid(p.getColuna())) {
			return false;
		}

		return true;
	}

	private boolean isDimensionValid(final int dimensao) {
		return dimensao < this.tamanho && dimensao >= 0;
	}

	@Override
	public Time getVezDeQuem() {
		return this.vez;
	}

	@Override
	public void fazerMovimento(final Movimento m)
			throws PosicaoInvalidaException, MovimentoInvalidoException {
		if (m == null) {
			throw new NullPointerException("Movimento não pode ser nulo.");
		}

		fazerMovimento(m.getOrigem(), m.getDestino());

		this.vez = this.vez.equals(Time.XIS) ? Time.MAIS : Time.XIS;
	}

	private void fazerMovimento(final Posicao origem, final Posicao destino)
			throws PosicaoInvalidaException, MovimentoInvalidoException {
		validateMovimento(origem, destino);

		final CasaImplementada casaOrigem = this.getCasa(origem);
		final CasaImplementada casaDestino = this.getCasa(destino);

		casaDestino.setConteudo(casaOrigem.getConteudo());
		casaOrigem.setConteudo(NADA);

		atualizarCasas(casaDestino, destino);
	}

	private void atualizarCasas(final Casa casaDestino, final Posicao destino) {
		// Achar casas adjacentes

		if (casaDestino.getConteudo().equals(ConteudoCasa.MAIS)) {

		}

		final Casa[] adjacentes = new Casa[0];

		for (final Casa casa : adjacentes) {

			if (!casa.getConteudo().equals(NADA)) {
				casa.setConteudo(casaDestino.getConteudo());
			}
		}

	}

	@SuppressWarnings("incomplete-switch")
	private void validateMovimento(final Posicao origem, final Posicao destino)
			throws PosicaoInvalidaException, MovimentoInvalidoException {
		final ConteudoCasa conteudoOrigem = this.getConteudoDaCasa(origem);
		final ConteudoCasa conteudoDestino = this.getConteudoDaCasa(destino);

		// Validacao de conteudo
		if (conteudoOrigem.equals(NADA) || !conteudoDestino.equals(NADA)) {
			throw new MovimentoInvalidoException();
		}

		// Validacao de distancia de movimento
		final int movimentoColuna = Math.abs(origem.getColuna()
				- destino.getColuna());
		final int movimentoLinha = Math.abs(origem.getLinha()
				- destino.getLinha());
		if (movimentoColuna > MAX_MOVIMENTO || movimentoLinha > MAX_MOVIMENTO) {
			System.out
					.println("TabuleiroLeituraEscritaImplementado.validateMovimento()");

			throw new MovimentoInvalidoException();

		}

		// Validacao de direcao de movimento
		switch (conteudoOrigem) {
		case MAIS:
			// Vertical/Horizontal
			if (movimentoColuna != 0 && movimentoLinha != 0) {
				throw new MovimentoInvalidoException();
			}
			break;
		case XIS:
			// Diagonal
			if (movimentoColuna != movimentoLinha) {
				throw new MovimentoInvalidoException();
			}
			break;
		}

	}

}
