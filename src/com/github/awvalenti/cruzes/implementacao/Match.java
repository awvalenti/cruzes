package com.github.awvalenti.cruzes.implementacao;

import com.github.awvalenti.cruzes.api.classesabstratas.Partida;
import com.github.awvalenti.cruzes.api.enums.Time;
import com.github.awvalenti.cruzes.api.excecoes.MovimentoInvalidoException;
import com.github.awvalenti.cruzes.api.excecoes.PosicaoInvalidaException;
import com.github.awvalenti.cruzes.api.excecoes.TamanhoInvalidoException;
import com.github.awvalenti.cruzes.api.interfaces.AnalisadorTabuleiro;
import com.github.awvalenti.cruzes.api.interfaces.FabricaTabuleiro;
import com.github.awvalenti.cruzes.api.interfaces.Jogador;
import com.github.awvalenti.cruzes.api.interfaces.Movimento;
import com.github.awvalenti.cruzes.api.interfaces.TabuleiroLeituraEscrita;
import com.github.awvalenti.cruzes.api.interfaces.VisualizacaoTabuleiro;

public class Match extends Partida {

	private TabuleiroLeituraEscrita tabuleiro;
	private Movimento movimentoAtual;
	private Time timeAtual;
	private int numeroLinhasTabuleiro;
	private int numeroColunasTabuleiro;
	private static final boolean DEBUG = false;

	// Por padrão assume tabuleiro 5x5
	public Match(Jogador jogador1, Jogador jogador2, FabricaTabuleiro fabrica, AnalisadorTabuleiro analisador,
			VisualizacaoTabuleiro visualizacaoTabuleiro) {
		super(jogador1, jogador2, fabrica, analisador, visualizacaoTabuleiro);
		// TODO Auto-generated constructor stub
		numeroLinhasTabuleiro = 5;
		numeroColunasTabuleiro = 5;
	}

	// Construtor para tabuleiros de tamanho qualquer
	public Match(Jogador jogador1, Jogador jogador2, FabricaTabuleiro fabrica, AnalisadorTabuleiro analisador,
			VisualizacaoTabuleiro visualizacaoTabuleiro, int numeroLinhasTabuleiro, int numeroColunasTabuleiro) {
		super(jogador1, jogador2, fabrica, analisador, visualizacaoTabuleiro);
		this.numeroLinhasTabuleiro = numeroLinhasTabuleiro;
		this.numeroColunasTabuleiro = numeroColunasTabuleiro;
	}

	@Override
	public void iniciar() {
		// TODO Auto-generated method stub


		if (DEBUG) {
			System.out.println("Criando tabuleiro");
		}

		try {
			tabuleiro = fabrica.criarTabuleiro(numeroLinhasTabuleiro, numeroColunasTabuleiro);
		} catch (TamanhoInvalidoException e) {
			System.out.println("O tamanho para criação do tabuleiro não é válido!");
			return;
		}

		if (DEBUG) {
			System.out.println("Desenhando tabuleiro");
		}

		visualizacaoTabuleiro.desenhar(tabuleiro);

		while (!analisador.determinarEstado(tabuleiro).isFinalizado()) {

			timeAtual = tabuleiro.getVezDeQuem();

			if (DEBUG) {
				System.out.println("Iterou - Vez: " + timeAtual.getCaractere());
			}

			switch (timeAtual) {
			case MAIS:
				movimentoAtual = jogador1.obterMovimentoDesejado();
				break;
			case XIS:
				movimentoAtual = jogador2.obterMovimentoDesejado();
				break;
			default:
				throw new RuntimeException();
			}

			if (DEBUG) {
				System.out.println("Recebeu Movimento");
			}

			try {
				tabuleiro.fazerMovimento(movimentoAtual);
			} catch (PosicaoInvalidaException e) {
				System.out.println("Posição Inválida!");
			} catch (MovimentoInvalidoException e) {
				System.out.println("Movimento Inválido!");
			}

		} // fim iteração while
		
		System.out.println("Fim de Jogo! Ganhador: " + analisador.determinarEstado(tabuleiro).getTimeVencedor().toString());
		
	}

}
