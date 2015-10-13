package com.github.awvalenti.cruzes.implementacao;

import static com.github.awvalenti.cruzes.implementacao.RecortePeca.*;

import java.util.Scanner;

public class TabuleiroTeste {

<<<<<<< HEAD
	public int TAMANHO_DO_TABULEIRO;
	Casa[][] casas;	
=======
	Casa[][] casas;
>>>>>>> 6de08ad29043dd308aad7f9bebad17f9d68d4923
	Casa[][] cinco = new Casa[][] {
			
			{ new Casa(new Peca(XIS,"XIS")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(XIS,"XIS")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(XIS,"XIS"))},
			{ new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO"))},
			{ new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO"))},
			{ new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO"))},
			{ new Casa(new Peca(MAIS,"MAIS")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(MAIS,"MAIS")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(MAIS,"MAIS"))}
<<<<<<< HEAD
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
=======
	};	
	public TabuleiroTeste() {

		int LARGURA;
		boolean Disp = false;
		do{
			int[] LargurasDisp = {5};
			System.out.println("Escolha uma LARGURA para o tabuleiro: ");
			Scanner scan = new Scanner(System.in);
			LARGURA = scan.nextInt();
			scan.close();
			for(int n : LargurasDisp) {
				if(LARGURA == n) {
					Disp = true;
				}
			}
		}while(Disp != true);
		switch(LARGURA) {		
				case 5: casas = cinco;
>>>>>>> 6de08ad29043dd308aad7f9bebad17f9d68d4923
			}		
	}
	public Peca getPeca (int linha, int coluna)
	{
		return casas[linha][coluna].getPeca();
	}
}
