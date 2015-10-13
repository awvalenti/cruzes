package com.github.awvalenti.cruzes.implementacao;

import com.github.awvalenti.cruzes.api.interfaces.EstadoJogo;

public class Main {

	public static void main(String[] args) {
		TabuleiroLeituraImpl tab = new TabuleiroLeituraImpl();
		tab.preencherTabuleiroCenario2();
		AnalisadorDoTabuleiro analisador = new AnalisadorDoTabuleiro();
		
		EstadoJogo estado = analisador.determinarEstado(tab);
		
		System.out.println("Esta finalizado: "+estado.isFinalizado());
		System.out.println("Vencedor: "+estado.getTimeVencedor());

	}

}
