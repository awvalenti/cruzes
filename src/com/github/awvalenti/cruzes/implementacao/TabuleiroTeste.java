package com.github.awvalenti.cruzes.implementacao;

import static com.github.awvalenti.cruzes.implementacao.RecortePeca.*;


public class TabuleiroTeste {

	Casa[][] casas;

	public TabuleiroTeste() {

		casas = new Casa[][] {
				
				{ new Casa(new Peca(XIS,"XIS")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(XIS,"XIS")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(XIS,"XIS"))},
				{ new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO"))},
				{ new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO"))},
				{ new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO"))},
				{ new Casa(new Peca(MAIS,"MAIS")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(MAIS,"MAIS")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(MAIS,"MAIS"))}
		};	
	}

	public Peca getPeca (int linha, int coluna)
	{
		return casas[linha][coluna].getPeca();
	}
}
