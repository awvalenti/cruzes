package com.github.awvalenti.cruzes.implementacao;

import java.util.ArrayList;
import java.util.List;

import com.github.awvalenti.cruzes.api.enums.ConteudoCasa;
import com.github.awvalenti.cruzes.api.enums.CorCasa;
import com.github.awvalenti.cruzes.api.enums.Time;
import com.github.awvalenti.cruzes.api.excecoes.PosicaoInvalidaException;
import com.github.awvalenti.cruzes.api.interfaces.Posicao;
import com.github.awvalenti.cruzes.api.interfaces.TabuleiroLeitura;

public class TabuleiroLeituraImpl implements TabuleiroLeitura{
	ConteudoCasa[][] casa = new ConteudoCasa[][]  {{ConteudoCasa.MAIS},{ConteudoCasa.NADA},{ConteudoCasa.MAIS},
													{ConteudoCasa.NADA}, {ConteudoCasa.NADA}, {ConteudoCasa.NADA},
													{ConteudoCasa.XIS},{ConteudoCasa.NADA},{ConteudoCasa.XIS}
													};
	
	public TabuleiroLeituraImpl(){
		 
	}
	
	public void preencherTabuleiroCenario1(){
		tabuleiro.add(new com.github.awvalenti.cruzes.implementacao.Posicao(1, 2));
	}
	@Override
	public int getNumeroLinhas() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getNumeroColunas() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public CorCasa getCorDaCasa(Posicao p) throws PosicaoInvalidaException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConteudoCasa getConteudoDaCasa(Posicao p) throws PosicaoInvalidaException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Time getVezDeQuem() {
		// TODO Auto-generated method stub
		return null;
	}

}
