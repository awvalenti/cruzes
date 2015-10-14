package com.github.awvalenti.cruzes.implementacao;

import com.github.awvalenti.cruzes.api.excecoes.PosicaoInvalidaException;
import com.github.awvalenti.cruzes.api.interfaces.Posicao;
import com.github.awvalenti.cruzes.api.interfaces.TabuleiroLeitura;
import com.github.awvalenti.cruzes.api.interfaces.VisualizacaoTabuleiro;

public class VisualizacaoTabuleiroConsole implements VisualizacaoTabuleiro {

	@Override
	public void desenhar(TabuleiroLeitura tabuleiro) {
		StringBuilder builder = new StringBuilder();
		//builder.append("");

		for (int i = 0; i < tabuleiro.getNumeroLinhas(); i++) {
			builder.append(" ");
		}

		System.out.println(builder.toString());

		for (int i = 0; i < tabuleiro.getNumeroLinhas(); i++) {

			builder.setLength(0);
			builder.append("");
			for (int j = 0; j < tabuleiro.getNumeroColunas(); j++) {
				final int linha = i, coluna = j;
				try {
					builder.append(" ").append(tabuleiro.getConteudoDaCasa(new Posicao() {
						@Override
						public int getLinha() {
							return linha;
						}

						@Override
						public int getColuna() {
							return coluna;
						}
					})).append(" ");
				} catch (PosicaoInvalidaException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			System.out.println(builder);
		}

	}
	public static void main(String[] args) {
		Tabuleiro tab= new Tabuleiro();
		VisualizacaoTabuleiro visual=new VisualizacaoTabuleiroConsole();
		visual.desenhar(tab);
		
	}
}
