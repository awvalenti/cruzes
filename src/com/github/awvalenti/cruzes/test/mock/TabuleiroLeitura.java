package com.github.awvalenti.cruzes.test.mock;

import com.github.awvalenti.cruzes.api.enums.ConteudoCasa;
import com.github.awvalenti.cruzes.api.enums.CorCasa;
import com.github.awvalenti.cruzes.api.enums.Time;
import com.github.awvalenti.cruzes.api.excecoes.PosicaoInvalidaException;
import com.github.awvalenti.cruzes.api.interfaces.Posicao;

public class TabuleiroLeitura implements com.github.awvalenti.cruzes.api.interfaces.TabuleiroLeitura {

	private TabuleiroLeituraImpl tabuleiro = new TabuleiroLeituraImpl();
	

	
	@Override
	public int getNumeroLinhas() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public int getNumeroColunas() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public CorCasa getCorDaCasa(Posicao p) throws PosicaoInvalidaException {
		return tabuleiro.getCorDaCasa(p);
	}

	@Override
	public ConteudoCasa getConteudoDaCasa(Posicao p) throws PosicaoInvalidaException {
		return tabuleiro.getConteudoDaCasa(p);
	}

	@Override
	public Time getVezDeQuem() {
		// TODO Auto-generated method stub
		return null;
	}

}
