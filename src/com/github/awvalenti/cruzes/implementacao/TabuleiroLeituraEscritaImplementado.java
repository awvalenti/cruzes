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
import com.github.awvalenti.cruzes.api.interfaces.Movimento;
import com.github.awvalenti.cruzes.api.interfaces.Posicao;
import com.github.awvalenti.cruzes.api.interfaces.TabuleiroLeituraEscrita;

public class TabuleiroLeituraEscritaImplementado implements TabuleiroLeituraEscrita {

	private final int dimensao;

	private final CasaImplementada[][] tabuleiro;

	private Time vez;

	public TabuleiroLeituraEscritaImplementado(final int dimensao) {
		// Tamanho
		this.dimensao = dimensao;

		// Turnos
		this.vez = Time.XIS;

		// Tabuleiro
		this.tabuleiro = new CasaImplementada[this.dimensao][this.dimensao];
		for (int x = 0; x < tabuleiro.length; x++) {
			for (int y = 0; y < tabuleiro[x].length; y++) {
				this.tabuleiro[x][y] = new CasaImplementada(escolherCor(x + y), escolherConteudo(y));
			}
		}
	}

	private ConteudoCasa escolherConteudo(final int y) {
		if (y == 0) {
			return XIS;
		}

		if (y + 1 == this.dimensao) {
			return MAIS;
		}

		return NADA;
	}

	private CorCasa escolherCor(final int un) {
		return ((un % 2) > 0) ? BRANCA : PRETA;
	}

	@Override
	public int getNumeroLinhas() {
		return dimensao;
	}

	@Override
	public int getNumeroColunas() {
		return dimensao;
	}

	@Override
	public CorCasa getCorDaCasa(final Posicao p) throws PosicaoInvalidaException {
		return getCasa(p).getCor();
	}

	@Override
	public ConteudoCasa getConteudoDaCasa(final Posicao p) throws PosicaoInvalidaException {
		return getCasa(p).getConteudo();
	}

	private CasaImplementada getCasa(final Posicao p) throws PosicaoInvalidaException {
		validatePosition(p);
		return this.tabuleiro[p.getLinha()][p.getColuna()];
	}

	private void validatePosition(final Posicao p) throws PosicaoInvalidaException {
		if (!isPositionValid(p)) {
			throw new PosicaoInvalidaException();
		}
	}

	private boolean isPositionValid(final Posicao p) {
		if (p == null) {
			return false;
		}

		final int position = p.getLinha() * p.getColuna();
		if (position == 0 || position > this.dimensao * this.dimensao) {
			return false;
		}

		return true;
	}

	@Override
	public Time getVezDeQuem() {
		return this.vez;
	}

	@Override
	public void fazerMovimento(final Movimento m) throws PosicaoInvalidaException, MovimentoInvalidoException {
		fazerMovimento(m.getOrigem(), m.getDestino());

		this.vez = this.vez.equals(Time.XIS) ? Time.MAIS : Time.XIS;
	}

	private void fazerMovimento(final Posicao origem, final Posicao destino) throws PosicaoInvalidaException, MovimentoInvalidoException {
		validateMovimento(origem, destino);

		final CasaImplementada casaOrigem = this.getCasa(origem);
		final CasaImplementada casaDestino = this.getCasa(destino);

		casaDestino.setConteudo(casaOrigem.getConteudo());
		casaOrigem.setConteudo(NADA);
	}

	private void validateMovimento(final Posicao origem, final Posicao destino) throws PosicaoInvalidaException, MovimentoInvalidoException {
		if (this.getConteudoDaCasa(origem).equals(NADA) || !this.getConteudoDaCasa(destino).equals(NADA)) {
			throw new MovimentoInvalidoException();
		}
	}

}
