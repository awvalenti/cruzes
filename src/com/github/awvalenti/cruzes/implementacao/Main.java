package com.github.awvalenti.cruzes.implementacao;

import com.github.awvalenti.cruzes.api.classesabstratas.Partida;
import com.github.awvalenti.cruzes.api.interfaces.FabricaMovimento;

public class Main {

	public static void main(final String[] args) {
		final FabricaMovimento fabricaMovimento = new FabricaMovimentoImplementada();
		final Partida partida = new Match(new JogadorHumanoScanner(
				fabricaMovimento), new JogadorIA(fabricaMovimento),
				new FabricaTabuleiroImplementada(),
				new AnalisadorDoTabuleiro(), new VisualizacaoTabuleiroConsole());
		partida.iniciar();

	}
}
