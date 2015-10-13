package com.github.awvalenti.cruzes.api.classesabstratas;

import com.github.awvalenti.cruzes.api.interfaces.AnalisadorTabuleiro;
import com.github.awvalenti.cruzes.api.interfaces.FabricaTabuleiro;
import com.github.awvalenti.cruzes.api.interfaces.Jogador;
import com.github.awvalenti.cruzes.api.interfaces.VisualizacaoTabuleiro;

public abstract class Partida {

	protected final Jogador jogador1;
	protected final Jogador jogador2;
	protected final FabricaTabuleiro fabrica;
	protected final AnalisadorTabuleiro analisador;
	protected final VisualizacaoTabuleiro visualizacaoTabuleiro;
	

	public Partida(final Jogador jogador1, final Jogador jogador2, final FabricaTabuleiro fabrica, final AnalisadorTabuleiro analisador,
			final VisualizacaoTabuleiro visualizacaoTabuleiro) {
		this.jogador1 = jogador1;
		this.jogador2 = jogador2;
		this.fabrica = fabrica;
		this.analisador = analisador;
		this.visualizacaoTabuleiro = visualizacaoTabuleiro;
	}


	public abstract void iniciar();

}
