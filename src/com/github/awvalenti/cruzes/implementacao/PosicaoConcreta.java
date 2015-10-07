package com.github.awvalenti.cruzes.implementacao;

import com.github.awvalenti.cruzes.api.interfaces.Posicao;

public class PosicaoConcreta implements Posicao {

	private int linha;
	private int coluna;
	
	@Override
	public int getLinha() {
		return linha;
	}

	@Override
	public int getColuna() {
		return coluna;
	}

	public PosicaoConcreta(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
	}

}
