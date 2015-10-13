package com.github.awvalenti.cruzes.implementacao;

import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JFrame;

import com.github.awvalenti.cruzes.api.interfaces.VisualizacaoTabuleiro;


public class Main {

<<<<<<< HEAD
	static int LARGURA;
	static List<Integer> LargurasDisp = new ArrayList<Integer>();

	static boolean Disp = false;
	
	static void SetLargura() {
		Scanner scan = new Scanner(System.in);
		do{
			System.out.print("Escolha uma LARGURA para o tabuleiro: ");
			LARGURA = scan.nextInt();
				if(LargurasDisp.contains((Integer) LARGURA)) {
					Disp = true;
				} else {
					System.out.println("LARGURA de tabuleiro indisponível (escolha 5,7 ou 9) ");
				}
		}while(Disp != true);
		scan.close();
	}
	
	public static void main(String[] args) {

		LargurasDisp.add(5);LargurasDisp.add(7);LargurasDisp.add(9);
		SetLargura();
		JFrame janela = VisualizacaoTabuleiro.criarJanela(LARGURA);
		TabuleiroTeste virtualTeste = new TabuleiroTeste(LARGURA);
=======
	public static void main(String[] args) {

		JFrame janela = VisualizacaoTabuleiro.criarJanela();
		TabuleiroTeste virtualTeste = new TabuleiroTeste();
>>>>>>> 6de08ad29043dd308aad7f9bebad17f9d68d4923
		MouseAdapter tratadorCliques = new VisualizacaoTabuleiro.TratadorCliques(); 
		VisualizacaoTabuleiro.preencherJanelaComCasas(virtualTeste, janela, tratadorCliques);
		VisualizacaoTabuleiro.exibirJanela(janela);
	}
}
