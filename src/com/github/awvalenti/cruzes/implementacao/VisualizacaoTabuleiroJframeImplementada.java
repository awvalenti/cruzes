package com.github.awvalenti.cruzes.implementacao;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

import com.github.awvalenti.cruzes.api.interfaces.TabuleiroLeitura;
import com.github.awvalenti.cruzes.api.interfaces.VisualizacaoTabuleiro;

public class VisualizacaoTabuleiroJframeImplementada implements
VisualizacaoTabuleiro {

	static final Color COR_CASA_SELECIONADA = new Color(79, 123, 215);
	static final Color COR_CASA_NAO_SELECIONADA_1 = new Color(180, 147, 100);
	static final Color COR_CASA_NAO_SELECIONADA_2 = new Color(149, 95, 33);

	static JFrame criarJanela(final int LARGURA) {

		final JFrame janela = new JFrame("cruzes");
		janela.setLayout(new GridLayout(LARGURA, LARGURA));
		janela.setSize(LARGURA * 80, LARGURA * 80);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		return janela;
	}

	static void preencherJanelaComCasas(final TabuleiroTeste tabuleiro,
			final JFrame janela, final MouseAdapter tratadorCliques) {

		for (int i = 0; i < tabuleiro.TAMANHO_DO_TABULEIRO; ++i) {
			for (int j = 0; j < tabuleiro.TAMANHO_DO_TABULEIRO; ++j) {

				final Peca peca = tabuleiro.getPeca(i, j);
				final JLabel label = new JLabel(peca.getPeca());
				label.setHorizontalAlignment(JLabel.CENTER);
				label.setVerticalAlignment(JLabel.CENTER);
				label.setBackground((i + j) % 2 == 0 ? COR_CASA_NAO_SELECIONADA_1
						: COR_CASA_NAO_SELECIONADA_2);
				label.setOpaque(true);
				label.addMouseListener(tratadorCliques);
				label.setName(peca.nomePeca);
				janela.add(label);
			}
		}
	}

	static void exibirJanela(final JFrame janela) {

		janela.setLocationRelativeTo(null);
		janela.setVisible(true);
		janela.getFocusableWindowState();
	}

	@Override
	public void desenhar(final TabuleiroLeitura tabuleiro) {

	}

	static class TratadorCliques extends MouseAdapter {

		private JLabel casaSelecionada;
		private Color EX_COR_CASA_SELECIONADA;

		@Override
		public void mousePressed(final MouseEvent e) {

			final JLabel casaClicada = (JLabel) e.getSource();
			final boolean clicouCasaVazia = casaClicada.getName().compareTo(
					"NULO") == 0;
			if (nenhumaCasaSelecionada() && clicouCasaVazia) {
				return;
			}
			if (nenhumaCasaSelecionada()) {
				selecionarCasa(casaClicada);
			} else {
				moverPeca(casaClicada);
			}
		}

		private boolean nenhumaCasaSelecionada() {
			return casaSelecionada == null;
		}

		private void selecionarCasa(final JLabel casaClicada) {
			EX_COR_CASA_SELECIONADA = casaClicada.getBackground();
			casaClicada.setBackground(COR_CASA_SELECIONADA);
			casaSelecionada = casaClicada;
		}

		private void moverPeca(final JLabel casaClicada) {
			if (casaClicada == casaSelecionada) {
				casaClicada.setBackground(EX_COR_CASA_SELECIONADA);
				casaSelecionada = null;
				return;
			} else {
				// if(casaClicada.getName().compareTo("NULO") == 0) {

				if (casaClicada.getName().compareTo("NULO") == 0) {
					// if(casaSelecionada.getName().compareTo("XIS") == 0) {
					// if(casaSelecionada.getY() != casaClicada.getY() &&
					// casaSelecionada.getX() != casaClicada.getX())
					casaClicada.setIcon(casaSelecionada.getIcon());
					casaClicada.setName(casaSelecionada.getName());
					casaSelecionada.setBackground(EX_COR_CASA_SELECIONADA);
					casaSelecionada.setIcon(null);
					casaSelecionada.setName("NULO");
					casaSelecionada = null;
					// }
					// }
					// if(casaSelecionada.getName().compareTo("XIS") == 0) {
					// if(casaSelecionada.getY() != casaClicada.getY() &&
					// casaSelecionada.getX() != casaClicada.getX())
					// casaClicada.setIcon((ImageIcon)
					// casaSelecionada.getIcon());
					// casaClicada.setName(casaSelecionada.getName());
					// casaSelecionada.setIcon(null);
					// casaSelecionada.setName("NULO");
					// casaSelecionada = null;
					// }
					// }
				}
			}
		}
	}

}
