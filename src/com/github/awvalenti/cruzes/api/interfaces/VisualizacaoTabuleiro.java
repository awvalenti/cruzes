package com.github.awvalenti.cruzes.api.interfaces;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.github.awvalenti.cruzes.implementacao.Peca;
import com.github.awvalenti.cruzes.implementacao.TabuleiroTeste;

public interface VisualizacaoTabuleiro {

	static final Color COR_CASA_SELECIONADA = new Color(79,123,215);
	static final Color COR_CASA_NAO_SELECIONADA_1 = new Color(180,147,100);
	static final Color COR_CASA_NAO_SELECIONADA_2 = new Color(149,95,33);
	static final String CASA_VAZIA = " ";
	static final int TAMANHO_DO_TABULEIRO = 5;
	static final int LATERAL_EM_PIXELS = 400;
	
	TabuleiroTeste tabuleiroBase = new TabuleiroTeste();
	
	static JFrame criarJanela() {
		
		JFrame janela = new JFrame("cruzes");
		janela.setLayout(new GridLayout(TAMANHO_DO_TABULEIRO, TAMANHO_DO_TABULEIRO));
		janela.setSize(LATERAL_EM_PIXELS, LATERAL_EM_PIXELS);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		return janela;
	}
	
	static void preencherJanelaComCasas(TabuleiroTeste tabuleiro, JFrame janela, MouseAdapter tratadorCliques) {
		
		for (int i = 0; i < TAMANHO_DO_TABULEIRO; ++i) {
			for (int j = 0; j < TAMANHO_DO_TABULEIRO; ++j) {
				
				Peca peca = tabuleiro.getPeca(i,j);
				JLabel label = new JLabel(peca.getPeca());
				label.setHorizontalAlignment(JLabel.CENTER);
				label.setVerticalAlignment(JLabel.CENTER);
				label.setBackground((i+j)%2 == 0 ? COR_CASA_NAO_SELECIONADA_1 : COR_CASA_NAO_SELECIONADA_2);
				label.setOpaque(true);
				label.addMouseListener(tratadorCliques);
				janela.add(label);
				}
		}
	}
	
	static void exibirJanela(JFrame janela) {
		
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);
	}
	static class TratadorCliques extends MouseAdapter {
		
		private JLabel casaSelecionada;
		
		@Override
		public void mousePressed(MouseEvent e) {
			
			JLabel casaClicada = (JLabel) e.getSource();		
			boolean clicouCasaVazia = false; //pecasEcasas.LABEL_VAZIA.contains(casaClicada);
			if (nenhumaCasaSelecionada() && clicouCasaVazia) return;		
			if (nenhumaCasaSelecionada()) selecionarCasa(casaClicada);		
			else moverPeca(casaClicada);
		}

		private boolean nenhumaCasaSelecionada() {			
			return casaSelecionada == null;
		}

		private void selecionarCasa(JLabel casaClicada) {			
			casaClicada.setBackground(COR_CASA_SELECIONADA);		
			casaSelecionada = casaClicada;
		}

		private void moverPeca(JLabel casaClicada) {
			
			if(casaClicada.getIcon() == null) {
				
				casaClicada.setIcon((ImageIcon) casaSelecionada.getIcon()); 
				casaSelecionada.setIcon(null);
				casaSelecionada = null;
				//if(casaSelecionada.getIcon()  .getText().equals("x")) {
						//if(casaSelecionada.getY() != casaClicada.getY() && casaSelecionada.getX() != casaClicada.getX()) 
						//casaClicada.setIcon((ImageIcon) casaSelecionada.getIcon()); 
						//casaSelecionada.setIcon(null);
						//casaSelecionada = null;
						//}
				//}
				//if(casaSelecionada.getText().equals("+")) {
						//if(casaSelecionada.getY() == casaClicada.getY() || casaSelecionada.getX() == casaClicada.getX()) {
							//casaClicada.setIcon(casaSelecionada.getIcon()); 
							//casaSelecionada.setIcon(null);
							//casaSelecionada = null;
						//}
				}
			}
		}
}
