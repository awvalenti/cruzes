package com.github.awvalenti.cruzes.implementacao;

import static com.github.awvalenti.cruzes.implementacao.RecortePeca.*;

public class TabuleiroTeste {

	public int TAMANHO_DO_TABULEIRO;
	Casa[][] casas;	
	Casa[][] cinco = new Casa[][] {
			
			{ new Casa(new Peca(XIS,"XIS")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(XIS,"XIS")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(XIS,"XIS"))},
			{ new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO"))},
			{ new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO"))},
			{ new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO"))},
			{ new Casa(new Peca(MAIS,"MAIS")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(MAIS,"MAIS")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(MAIS,"MAIS"))}
	};
	Casa[][] sete = new Casa[][] {
			
			{ new Casa(new Peca(XIS,"XIS")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(XIS,"XIS")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(XIS,"XIS")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(XIS,"XIS"))},
			{ new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO"))},
			{ new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO"))},
			{ new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO"))},
			{ new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO"))},			
			{ new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO"))},
			{ new Casa(new Peca(MAIS,"MAIS")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(MAIS,"MAIS")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(MAIS,"MAIS")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(MAIS,"MAIS"))}
	};
	Casa[][] nove = new Casa[][] {
		
		{ new Casa(new Peca(XIS,"XIS")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(XIS,"XIS")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(XIS,"XIS")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(XIS,"XIS")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(XIS,"XIS"))},
		{ new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO"))},
		{ new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO"))},
		{ new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO"))},
		{ new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO"))},
		{ new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO"))},		
		{ new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO"))},
		{ new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO"))},
		{ new Casa(new Peca(MAIS,"MAIS")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(MAIS,"MAIS")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(MAIS,"MAIS")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(MAIS,"MAIS")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(MAIS,"MAIS"))}
	};
	public TabuleiroTeste(int LARGURA) {

		switch(LARGURA) {		
				case 5: casas = cinco; TAMANHO_DO_TABULEIRO = LARGURA; break;
				case 7: casas = sete; TAMANHO_DO_TABULEIRO = LARGURA; break;
				case 9: casas = nove; TAMANHO_DO_TABULEIRO = LARGURA; break;
			}		
	}
	public Peca getPeca (int linha, int coluna)
	{
		return casas[linha][coluna].getPeca();
	}
}
