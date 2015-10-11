package com.github.awvalenti.cruzes.implementacao;

import static com.github.awvalenti.cruzes.implementacao.RecortePeca.*;


public class TabuleiroTeste {

	Casa[][] casas;

	public TabuleiroTeste() {

		casas = new Casa[][] {
				
				{ new Casa(new Peca(XIS,1)), new Casa(new Peca(NULO,0)), new Casa(new Peca(XIS,1)), new Casa(new Peca(NULO,0)), new Casa(new Peca(XIS,1))},
				{ new Casa(new Peca(NULO,0)), new Casa(new Peca(NULO,0)), new Casa(new Peca(NULO,0)), new Casa(new Peca(NULO,0)), new Casa(new Peca(NULO,0))},
				{ new Casa(new Peca(NULO,0)), new Casa(new Peca(NULO,0)), new Casa(new Peca(NULO,0)), new Casa(new Peca(NULO,0)), new Casa(new Peca(NULO,0))},
				{ new Casa(new Peca(NULO,0)), new Casa(new Peca(NULO,0)), new Casa(new Peca(NULO,0)), new Casa(new Peca(NULO,0)), new Casa(new Peca(NULO,0))},
				{ new Casa(new Peca(MAIS,2)), new Casa(new Peca(NULO,0)), new Casa(new Peca(MAIS,2)), new Casa(new Peca(NULO,0)), new Casa(new Peca(MAIS,2))}
		};	
	}

	public Peca getPeca (int linha, int coluna)
	{
		return casas[linha][coluna].getPeca();
	}
}
