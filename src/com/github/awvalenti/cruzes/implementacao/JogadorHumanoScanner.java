package com.github.awvalenti.cruzes.implementacao;

import java.util.Scanner;

import com.github.awvalenti.cruzes.api.interfaces.FabricaMovimento;
import com.github.awvalenti.cruzes.api.interfaces.Jogador;
import com.github.awvalenti.cruzes.api.interfaces.Movimento;
import com.github.awvalenti.cruzes.api.interfaces.Posicao;

public class JogadorHumanoScanner implements Jogador {

	private final FabricaMovimento fabricaMovimento;

	public JogadorHumanoScanner(final FabricaMovimento fabrica) {
		this.fabricaMovimento = fabrica;
	}

	@Override
	public Movimento obterMovimentoDesejado() {

		int linhaOrigem = 0, colunaOrigem = 0, linhaDestino = 0, colunaDestino = 0;

		final Scanner ler = new Scanner(System.in);

		System.out.println("Valor linha Origem:\n");
		linhaOrigem = ler.nextInt();

		System.out.println("Valor coluna Origem:\n");
		colunaOrigem = ler.nextInt();

		System.out.println("Valor linha Destino");
		linhaDestino = ler.nextInt();

		System.out.println("Valor coluna Destino");
		colunaDestino = ler.nextInt();

		return fabricaMovimento.criar(linhaOrigem, colunaOrigem, linhaDestino,
				colunaDestino);
	}

	public static void main(final String[] args) {
		final JogadorHumanoScanner j1 = new JogadorHumanoScanner(
				new FabricaMovimento() {

					@Override
					public Movimento criar(final int linhaOrigem,
							final int colunaOrigem, final int linhaDestino,
							final int colunaDestino) {
						// TODO Auto-generated method stub
						return new Movimento() {

							@Override
							public Posicao getOrigem() {
								// TODO Auto-generated method stub
								return new Posicao() {

									@Override
									public int getLinha() {
										// TODO Auto-generated method stub
										return linhaOrigem;
									}

									@Override
									public int getColuna() {
										// TODO Auto-generated method stub
										return colunaOrigem;
									}
								};
							}

							@Override
							public Posicao getDestino() {
								// TODO Auto-generated method stub
								return new Posicao() {

									@Override
									public int getLinha() {
										// TODO Auto-generated method stub
										return linhaDestino;
									}

									@Override
									public int getColuna() {
										// TODO Auto-generated method stub
										return colunaDestino;
									}
								};
							}
						};

					}
				});

		j1.obterMovimentoDesejado();
	}

}
