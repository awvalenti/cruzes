package com.github.awvalenti.cruzes.test.mock;

import com.github.awvalenti.cruzes.api.interfaces.EstadoJogo;
import com.github.awvalenti.cruzes.implementacao.AnalisadorDoTabuleiro;

public class Main {

	public static void main(String[] args) {
		TabuleiroLeituraImpl tab = new TabuleiroLeituraImpl();
		tab.xisDuasPecasFechadas();
		AnalisadorDoTabuleiro analisador = new AnalisadorDoTabuleiro();
		
		EstadoJogo estado = analisador.determinarEstado(tab);
		
		System.out.println("Esta finalizado: "+estado.isFinalizado());
		System.out.println("Vencedor: "+estado.getTimeVencedor());

	}

}
