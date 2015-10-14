package com.github.awvalenti.cruzes.implementacao;

import com.github.awvalenti.cruzes.api.enums.ConteudoCasa;
import com.github.awvalenti.cruzes.api.enums.Time;
import com.github.awvalenti.cruzes.api.excecoes.PosicaoInvalidaException;
import com.github.awvalenti.cruzes.api.interfaces.AnalisadorTabuleiro;
import com.github.awvalenti.cruzes.api.interfaces.EstadoJogo;
import com.github.awvalenti.cruzes.api.interfaces.TabuleiroLeitura;
import com.github.awvalenti.cruzes.test.mock.Posicao;

public class AnalisadorDoTabuleiro implements AnalisadorTabuleiro {

	@Override
	public EstadoJogo determinarEstado(final TabuleiroLeitura tabuleiro) {
		boolean terminou = false;
		Time timeVencedor = null;

		int qtdXis, qtdMais;
		qtdMais = qtdXis = 0;
		for (int i = 0; i < tabuleiro.getNumeroColunas(); i++) {
			for (int j = 0; j < tabuleiro.getNumeroLinhas(); j++) {

				ConteudoCasa conteudoCasa = null;
				try {
					conteudoCasa = tabuleiro
							.getConteudoDaCasa(new Posicao(i, j));
					switch (conteudoCasa) {
					case MAIS:
						qtdMais++;
						break;
					case XIS:
						qtdXis++;
						break;
					default:
						// não faz nada...

					}
				} catch (final PosicaoInvalidaException e) {
					// Deu ruim...
				}
			}
		}

		for (int i = 0; i < tabuleiro.getNumeroColunas(); i++) {
			for (int j = 0; j < tabuleiro.getNumeroLinhas(); j++) {

				if (qtdXis == 0) {
					terminou = true;
					timeVencedor = Time.MAIS;

					return new EstadoDoJogo(terminou, timeVencedor);
				}

				if (qtdMais == 0) {
					terminou = true;
					timeVencedor = Time.XIS;

					return new EstadoDoJogo(terminou, timeVencedor);
				}

				if (estahTravado(tabuleiro, ConteudoCasa.XIS)) {
					terminou = true;
					timeVencedor = Time.MAIS;

					return new EstadoDoJogo(terminou, timeVencedor);
				}

				if (estahTravado(tabuleiro, ConteudoCasa.MAIS)) {
					terminou = true;
					timeVencedor = Time.XIS;

					return new EstadoDoJogo(terminou, timeVencedor);
				}

			}
		}
		final EstadoJogo estado = new EstadoDoJogo(terminou, timeVencedor);
		return estado;
	}

	private boolean estahTravado(final TabuleiroLeitura tabuleiro,
			final ConteudoCasa conteudo) {
		boolean estahTravado = true;
		for (int i = 0; i < tabuleiro.getNumeroColunas(); i++) {
			for (int j = 0; j < tabuleiro.getNumeroLinhas(); j++) {
				try {
					if (tabuleiro.getConteudoDaCasa(new Posicao(i, j)).equals(
							conteudo)) {
						if (temMovimentoPossivel(tabuleiro, conteudo,
								new Posicao(i, j))) {
							estahTravado = false;
						}
					}
				} catch (final PosicaoInvalidaException e) {
					// Deu ruim...
				}
			}
		}

		return estahTravado;
	}

	private boolean temMovimentoPossivel(final TabuleiroLeitura tabuleiro,
			final ConteudoCasa conteudo, final Posicao posicao) {
		final int linha = posicao.getLinha();
		final int coluna = posicao.getColuna();

		if (conteudo == ConteudoCasa.XIS) {
			return verificaSeXTemCasasVaziasAoRedor(tabuleiro, linha, coluna);
		}
		if (conteudo == ConteudoCasa.MAIS) {

			return verificaSeMaisTemCasaVaziaAoRedor(tabuleiro, linha, coluna);
		}

		return false;

	}

	private boolean verificaSeMaisTemCasaVaziaAoRedor(
			final TabuleiroLeitura tabuleiro, final int linha, final int coluna) {
		try {
			if (tabuleiro.getConteudoDaCasa(new Posicao(linha + 1, coluna)) == ConteudoCasa.NADA) {
				return true;
			}
		} catch (final PosicaoInvalidaException e) {
			// Não existe...
		}

		try {
			if (tabuleiro.getConteudoDaCasa(new Posicao(linha - 1, coluna)) == ConteudoCasa.NADA) {
				return true;
			}
		} catch (final PosicaoInvalidaException e) {
			// Não existe...
		}

		try {
			if (tabuleiro.getConteudoDaCasa(new Posicao(linha, coluna + 1)) == ConteudoCasa.NADA) {
				return true;
			}
		} catch (final PosicaoInvalidaException e) {
			// Não existe...
		}

		try {
			if (tabuleiro.getConteudoDaCasa(new Posicao(linha, coluna - 1)) == ConteudoCasa.NADA) {
				return true;
			}
		} catch (final PosicaoInvalidaException e) {
			// Não existe...
		}

		return false;
	}

	private boolean verificaSeXTemCasasVaziasAoRedor(
			final TabuleiroLeitura tabuleiro, final int linha, final int coluna) {
		try {
			if (tabuleiro.getConteudoDaCasa(new Posicao(linha + 1, coluna + 1)) == ConteudoCasa.NADA) {
				return true;
			}
		} catch (final PosicaoInvalidaException e) {
			// Não existe
		}
		try {
			if (tabuleiro.getConteudoDaCasa(new Posicao(linha + 1, coluna - 1)) == ConteudoCasa.NADA) {
				return true;
			}
		} catch (final PosicaoInvalidaException e) {
			// Não existe
		}

		try {
			if (tabuleiro.getConteudoDaCasa(new Posicao(linha - 1, coluna + 1)) == ConteudoCasa.NADA) {
				return true;
			}
		} catch (final PosicaoInvalidaException e) {
			// Não existe
		}

		try {
			if (tabuleiro.getConteudoDaCasa(new Posicao(linha - 1, coluna - 1)) == ConteudoCasa.NADA) {
				return true;
			}
		} catch (final PosicaoInvalidaException e) {
			// Não existe
		}

		return false;
	}

}
