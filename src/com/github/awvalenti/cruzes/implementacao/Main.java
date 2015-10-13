package com.github.awvalenti.cruzes.implementacao;

import java.awt.event.MouseAdapter;

import javax.swing.JFrame;

import com.github.awvalenti.cruzes.api.interfaces.VisualizacaoTabuleiro;


public class Main {

	public static void main(String[] args) {

		JFrame janela = VisualizacaoTabuleiro.criarJanela();
		TabuleiroTeste virtualTeste = new TabuleiroTeste();
		MouseAdapter tratadorCliques = new VisualizacaoTabuleiro.TratadorCliques(); 
		VisualizacaoTabuleiro.preencherJanelaComCasas(virtualTeste, janela, tratadorCliques);
		VisualizacaoTabuleiro.exibirJanela(janela);
	}
}
