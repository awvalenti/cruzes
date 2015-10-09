package com.github.awvalenti.cruzes.implementacao;

import com.github.awvalenti.cruzes.api.classesabstratas.Partida;
import com.github.awvalenti.cruzes.api.interfaces.AnalisadorTabuleiro;
import com.github.awvalenti.cruzes.api.interfaces.FabricaTabuleiro;
import com.github.awvalenti.cruzes.api.interfaces.Jogador;
import com.github.awvalenti.cruzes.api.interfaces.VisualizacaoTabuleiro;

public class Match extends Partida {

	public Match(Jogador jogador1, Jogador jogador2, FabricaTabuleiro fabrica,
			AnalisadorTabuleiro analisador,
			VisualizacaoTabuleiro visualizacaoTabuleiro) {
		super(jogador1, jogador2, fabrica, analisador, visualizacaoTabuleiro);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void iniciar() {
		// TODO Auto-generated method stub

	}

}
