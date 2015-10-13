package com.github.awvalenti.cruzes.implementacao;

import com.github.awvalenti.cruzes.api.enums.ConteudoCasa;
import com.github.awvalenti.cruzes.api.enums.Time;
import com.github.awvalenti.cruzes.api.excecoes.PosicaoInvalidaException;
import com.github.awvalenti.cruzes.api.interfaces.AnalisadorTabuleiro;
import com.github.awvalenti.cruzes.api.interfaces.EstadoJogo;
import com.github.awvalenti.cruzes.api.interfaces.TabuleiroLeitura;

public class AnalisadorDoTabuleiro implements AnalisadorTabuleiro {

	@Override
	public EstadoJogo determinarEstado(TabuleiroLeitura tabuleiro) {
		boolean terminou = false;
		Time timeVencedor = null;

		int qtdXis, qtdMais;
		qtdMais = qtdXis = 0;
		for (int i = 0; i < tabuleiro.getNumeroColunas(); i++) {
			for (int j = 0; j < tabuleiro.getNumeroLinhas(); j++) {

				ConteudoCasa conteudoCasa = null;
				try {
					conteudoCasa = tabuleiro.getConteudoDaCasa(new Posicao(i, j));
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
				} catch (PosicaoInvalidaException e) {
					// Deu ruim...
				}
			}
		}

		for (int i = 0; i < tabuleiro.getNumeroColunas(); i++) {
			for (int j = 0; j < tabuleiro.getNumeroLinhas(); j++) {

				System.out.println("Mais: " + qtdMais + "\nXis:" + qtdXis);

				if (qtdXis == 0) {
					terminou = true;
					timeVencedor = Time.MAIS;

					System.out.println("Xis perdeu por falta de peças");

					return new EstadoDoJogo(terminou, timeVencedor);
				}

				if (qtdMais == 0) {
					terminou = true;
					timeVencedor = Time.XIS;

					System.out.println("Mais perdeu por falta de peças");

					return new EstadoDoJogo(terminou, timeVencedor);
				}

				if (estahTravado(tabuleiro, ConteudoCasa.XIS)) {
					terminou = true;
					timeVencedor = Time.MAIS;

					System.out.println("Xis perdeu por estar travado");

					return new EstadoDoJogo(terminou, timeVencedor);
				}

				if (estahTravado(tabuleiro, ConteudoCasa.MAIS)) {
					terminou = true;
					timeVencedor = Time.XIS;

					System.out.println("Mais perdeu por estar travado");

					return new EstadoDoJogo(terminou, timeVencedor);
				}

			}
		}
		EstadoJogo estado = new EstadoDoJogo(terminou, timeVencedor);
		return estado;
	}

	private boolean estahTravado(TabuleiroLeitura tabuleiro, ConteudoCasa conteudo) {
		boolean estahTravado = false;
		for (int i = 0; i < tabuleiro.getNumeroColunas(); i++) {
			for (int j = 0; j < tabuleiro.getNumeroLinhas(); j++) {
				try {
					if (tabuleiro.getConteudoDaCasa(new Posicao(i, j)).equals(conteudo)) {
						if (!temMovimentoPossivel(tabuleiro, conteudo, new Posicao(i, j))) {
							estahTravado = true;
						}
					}
				} catch (PosicaoInvalidaException e) {
					// Deu ruim...
				}
			}
		}

		return estahTravado;
	}

	private boolean temMovimentoPossivel(TabuleiroLeitura tabuleiro, ConteudoCasa conteudo, Posicao posicao) {
		int linha = posicao.getLinha();
		int coluna = posicao.getColuna();

		if (conteudo == ConteudoCasa.XIS) {
			System.out.println("XIS: "+verificaSeXTemCasasVaziasAoRedor(tabuleiro, linha, coluna));
			return verificaSeXTemCasasVaziasAoRedor(tabuleiro, linha, coluna);
		}
		if (conteudo == ConteudoCasa.MAIS) {
			System.out.println("Mais: "+ verificaSeXTemCasasVaziasAoRedor(tabuleiro, linha, coluna));
			return verificaSeMaisTemCasaVaziaAoRedor(tabuleiro, linha, coluna);
		}

		return false;

	}

	private boolean verificaSeMaisTemCasaVaziaAoRedor(TabuleiroLeitura tabuleiro, int linha, int coluna) {
		try {
			if (tabuleiro.getConteudoDaCasa(new Posicao(linha + 1, coluna)) == ConteudoCasa.NADA)
				return true;
		} catch (PosicaoInvalidaException e) {
			// Não existe...
		}

		try {
			if (tabuleiro.getConteudoDaCasa(new Posicao(linha - 1, coluna)) == ConteudoCasa.NADA)
				return true;
		} catch (PosicaoInvalidaException e) {
			// Não existe...
		}

		try {
			if (tabuleiro.getConteudoDaCasa(new Posicao(linha, coluna + 1)) == ConteudoCasa.NADA)
				return true;
		} catch (PosicaoInvalidaException e) {
			// Não existe...
		}

		try {
			if (tabuleiro.getConteudoDaCasa(new Posicao(linha, coluna - 1)) == ConteudoCasa.NADA)
				return true;
		} catch (PosicaoInvalidaException e) {
			// Não existe...
		}

		return false;
	}

	private boolean verificaSeXTemCasasVaziasAoRedor(TabuleiroLeitura tabuleiro, int linha, int coluna) {
		try {
			if (tabuleiro.getConteudoDaCasa(new Posicao(linha + 1, coluna + 1)) == ConteudoCasa.NADA)
				return true;
		} catch (PosicaoInvalidaException e) {
			// Não existe
		}
		try{
			if (tabuleiro.getConteudoDaCasa(new Posicao(linha + 1, coluna - 1)) == ConteudoCasa.NADA)
				return true;
		} catch (PosicaoInvalidaException e) {
			// Não existe
		}
		
		try{
			if (tabuleiro.getConteudoDaCasa(new Posicao(linha - 1, coluna + 1)) == ConteudoCasa.NADA)
				return true;
		}catch (PosicaoInvalidaException e) {
			// Não existe
		}
		
		try{
			if (tabuleiro.getConteudoDaCasa(new Posicao(linha - 1, coluna - 1)) == ConteudoCasa.NADA)
				return true;			
		} catch (PosicaoInvalidaException e) {
			// Não existe
		}

		return false;
	}

}
