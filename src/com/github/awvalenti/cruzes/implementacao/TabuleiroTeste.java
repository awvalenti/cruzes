package com.github.awvalenti.cruzes.implementacao;

import static com.github.awvalenti.cruzes.implementacao.RecortePeca.*;

import java.util.Scanner;

public class TabuleiroTeste {

	Casa[][] casas;
	Casa[][] cinco = new Casa[][] {
			
			{ new Casa(new Peca(XIS,"XIS")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(XIS,"XIS")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(XIS,"XIS"))},
			{ new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO"))},
			{ new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO"))},
			{ new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(NULO,"NULO"))},
			{ new Casa(new Peca(MAIS,"MAIS")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(MAIS,"MAIS")), new Casa(new Peca(NULO,"NULO")), new Casa(new Peca(MAIS,"MAIS"))}
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
			}		
	}
	public Peca getPeca (int linha, int coluna)
	{
		return casas[linha][coluna].getPeca();
	}
}
