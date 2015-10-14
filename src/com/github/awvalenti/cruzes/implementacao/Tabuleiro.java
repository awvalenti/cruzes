package com.github.awvalenti.cruzes.implementacao;

import com.github.awvalenti.cruzes.api.enums.ConteudoCasa;
import com.github.awvalenti.cruzes.api.enums.CorCasa;
import com.github.awvalenti.cruzes.api.enums.Time;
import com.github.awvalenti.cruzes.api.excecoes.PosicaoInvalidaException;
import com.github.awvalenti.cruzes.api.interfaces.Posicao;
import com.github.awvalenti.cruzes.api.interfaces.TabuleiroLeitura;
import com.github.awvalenti.cruzes.api.interfaces.VisualizacaoTabuleiro;

public class Tabuleiro implements TabuleiroLeitura{
	public char[][] criarCelula;
	public static final int TAMANHO = 5;

	public Tabuleiro() {
		criarCelula = new char[TAMANHO][TAMANHO];
		for (int i = 0; i < TAMANHO; i++) {
			for (int j = 0; j < TAMANHO; j++) {
				criarCelula[i][j] = '-';
			}
		}
	}

	

	@Override
	public int getNumeroLinhas() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public int getNumeroColunas() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public CorCasa getCorDaCasa(Posicao p) throws PosicaoInvalidaException {
		// TODO Auto-generated method stub
		return CorCasa.BRANCA;
	}

	@Override
	public ConteudoCasa getConteudoDaCasa(Posicao p) throws PosicaoInvalidaException {
		// TODO Auto-generated method stub
		return ConteudoCasa.MAIS;
	}

	@Override
	public Time getVezDeQuem() {
		// TODO Auto-generated method stub
		return Time.MAIS;
	}

}
