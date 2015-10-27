package com.github.awvalenti.cruzes.implementacao;

import static com.github.awvalenti.cruzes.implementacao.RecortePeca.*;

public class TabuleiroTeste {

	public int TAMANHO_DO_TABULEIRO;
	CasaTeste[][] casas;	

	CasaTeste[][] cinco = new CasaTeste[][] {
			
			{ new CasaTeste(new Peca(XIS,"XIS")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(XIS,"XIS")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(XIS,"XIS"))},
			{ new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO"))},
			{ new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO"))},
			{ new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO"))},
			{ new CasaTeste(new Peca(MAIS,"MAIS")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(MAIS,"MAIS")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(MAIS,"MAIS"))}

	};
	CasaTeste[][] sete = new CasaTeste[][] {
			
			{ new CasaTeste(new Peca(XIS,"XIS")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(XIS,"XIS")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(XIS,"XIS")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(XIS,"XIS"))},
			{ new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO"))},
			{ new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO"))},
			{ new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO"))},
			{ new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO"))},			
			{ new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO"))},
			{ new CasaTeste(new Peca(MAIS,"MAIS")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(MAIS,"MAIS")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(MAIS,"MAIS")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(MAIS,"MAIS"))}
	};
	CasaTeste[][] nove = new CasaTeste[][] {
		
		{ new CasaTeste(new Peca(XIS,"XIS")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(XIS,"XIS")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(XIS,"XIS")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(XIS,"XIS")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(XIS,"XIS"))},
		{ new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO"))},
		{ new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO"))},
		{ new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO"))},
		{ new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO"))},
		{ new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO"))},		
		{ new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO"))},
		{ new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(NULO,"NULO"))},
		{ new CasaTeste(new Peca(MAIS,"MAIS")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(MAIS,"MAIS")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(MAIS,"MAIS")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(MAIS,"MAIS")), new CasaTeste(new Peca(NULO,"NULO")), new CasaTeste(new Peca(MAIS,"MAIS"))}
	};
	public TabuleiroTeste(int LARGURA) {
	
		switch(LARGURA) {		
				case 5: casas = cinco; TAMANHO_DO_TABULEIRO = LARGURA; break;
				case 7: casas = sete; TAMANHO_DO_TABULEIRO = LARGURA; break;
				case 9: casas = nove; TAMANHO_DO_TABULEIRO = LARGURA; break;
		}
	};	
	public Peca getPeca (int linha, int coluna)
	{
		return casas[linha][coluna].getPeca();
	}
}
