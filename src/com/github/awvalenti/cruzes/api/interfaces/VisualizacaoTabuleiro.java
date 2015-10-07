package com.github.awvalenti.cruzes.api.interfaces;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

import com.github.awvalenti.cruzes.implementacao.TabuleiroBasesEmChar;

public interface VisualizacaoTabuleiro {

	static final Color COR_CASA_SELECIONADA = Color.CYAN;
	static final Color COR_CASA_NAO_SELECIONADA = new Color(238, 238, 238);
	static final String CASA_VAZIA = "_";
	static final int TAMANHO_DO_TABULEIRO = 5;
	static final int LATERAL_EM_PIXELS = 160;

	TabuleiroBasesEmChar tabuleiroBase = new TabuleiroBasesEmChar(TAMANHO_DO_TABULEIRO);
	
	void desenhar(TabuleiroLeitura tabuleiro);

	static String converterDePecaParaTexto(char peca) {
		
		return String.valueOf(peca);
	}

	static JFrame criarJanela() {
		
		JFrame janela = new JFrame("Xadrez");
		janela.setLayout(new GridLayout(TAMANHO_DO_TABULEIRO, TAMANHO_DO_TABULEIRO));
		janela.setSize(LATERAL_EM_PIXELS, LATERAL_EM_PIXELS);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		return janela;
	}
	
	static void preencherJanelaComCasas(char[][] tabuleiro, JFrame janela, MouseAdapter tratadorCliques) {
		
		for (int i = 0; i < TAMANHO_DO_TABULEIRO; ++i) {
			for (int j = 0; j < TAMANHO_DO_TABULEIRO; ++j) {
				
				JLabel label = new JLabel(converterDePecaParaTexto(tabuleiro[i][j]));
				label.setHorizontalAlignment(JLabel.CENTER);
				label.setVerticalAlignment(JLabel.CENTER);
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
			
			boolean clicouCasaVazia = casaClicada.getText().equals(CASA_VAZIA);
			
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
			
			if(casaClicada.getText().equals(CASA_VAZIA)) {
			
				if(casaSelecionada.getText().equals("x")) {
				
					if(casaSelecionada.getY() != casaClicada.getY() && casaSelecionada.getX() != casaClicada.getX()) {
					
						casaClicada.setText(casaSelecionada.getText());
						casaSelecionada.setText(CASA_VAZIA);
						casaSelecionada.setBackground(COR_CASA_NAO_SELECIONADA);
						casaSelecionada = null;
					}
				}
				if(casaSelecionada.getText().equals("+")) {
					
					if(casaSelecionada.getY() == casaClicada.getY() || casaSelecionada.getX() == casaClicada.getX()) {
					
						casaClicada.setText(casaSelecionada.getText());
						casaSelecionada.setText(CASA_VAZIA);
						casaSelecionada.setBackground(COR_CASA_NAO_SELECIONADA);
						casaSelecionada = null;
					}
				}
			}
		}
	}
}
