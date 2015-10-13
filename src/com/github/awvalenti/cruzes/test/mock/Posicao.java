package com.github.awvalenti.cruzes.test.mock;

public class Posicao implements com.github.awvalenti.cruzes.api.interfaces.Posicao {
	
	int x,y;
	
	public Posicao(int i, int j) {
		// TODO Auto-generated constructor stub
		this.x = i;
		this.y = j;
	}

	@Override
	public int getLinha() {		
		return x;
	}

	@Override
	public int getColuna() {
		
		return y;
	}
	

}
