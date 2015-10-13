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
	ConteudoCasa[][] casa;
	final int TAMANHO = 5;
	
	public TabuleiroLeituraImpl(){
		 
	}
	
	public void preencherTabuleiroCenario1(){
		casa = new ConteudoCasa[][]  {{ConteudoCasa.MAIS},{ConteudoCasa.NADA},{ConteudoCasa.MAIS},
			{ConteudoCasa.NADA}, {ConteudoCasa.NADA}, {ConteudoCasa.NADA},
			{ConteudoCasa.XIS},{ConteudoCasa.NADA},{ConteudoCasa.XIS}
			};
	}
	
	public void preencherTabuleiroCenario2(){
		casa = new ConteudoCasa[TAMANHO][TAMANHO];
		casa[0][0] = ConteudoCasa.MAIS;
		casa[0][2] = ConteudoCasa.MAIS;
		casa[0][4] = ConteudoCasa.MAIS;
		
		casa[4][0] = ConteudoCasa.XIS;
		casa[4][2] = ConteudoCasa.XIS;
		casa[4][4] = ConteudoCasa.XIS;
		
		for(int i=0;i<TAMANHO;i++){
			for(int j=0;j<TAMANHO;j++){
				if(casa[i][j]==null){
					casa[i][j]= ConteudoCasa.NADA;
				}
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
		int soma = p.getColuna()+p.getLinha();
		return soma%2==0?CorCasa.BRANCA:CorCasa.PRETA;
		
	}

	@Override
	public ConteudoCasa getConteudoDaCasa(Posicao p) throws PosicaoInvalidaException {
		try{
			return casa[p.getLinha()][p.getColuna()];
		}catch(IndexOutOfBoundsException e){
			throw new PosicaoInvalidaException();
		}
		
	}

	@Override
	public Time getVezDeQuem() {
		// TODO Auto-generated method stub
		return null;
	}

}
