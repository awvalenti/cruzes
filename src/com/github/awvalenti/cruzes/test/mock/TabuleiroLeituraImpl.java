package com.github.awvalenti.cruzes.test.mock;

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
	
	public void imprimirTabuleiroEmChar() {
		System.out.println();
		for(int i = 0; i < TAMANHO; i++) {
			for(int j = 0; j < TAMANHO; j++) {
				System.out.print(casa[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void xisEstahComTodasPecasFechadas(){
		casa = new ConteudoCasa[TAMANHO][TAMANHO];
		for(int i=0;i<TAMANHO;i++){
			for(int j=0;j<TAMANHO;j++){
				if(casa[i][j]==null){
					casa[i][j]= ConteudoCasa.NADA;
				}
			}
		}
		casa[0][0] = ConteudoCasa.XIS;
		casa[1][1] = ConteudoCasa.MAIS;
		casa[0][4] = ConteudoCasa.MAIS;
		
		casa[4][0] = ConteudoCasa.MAIS;
		casa[4][2] = ConteudoCasa.MAIS;
		casa[4][4] = ConteudoCasa.MAIS;
	}
	
	public void inicioDoJogoTodasAsPecasNaPosicaoInicial(){
		casa = new ConteudoCasa[TAMANHO][TAMANHO];
		for(int i=0;i<TAMANHO;i++){
			for(int j=0;j<TAMANHO;j++){
				if(casa[i][j]==null){
					casa[i][j]= ConteudoCasa.NADA;
				}
			}
		}
		casa[0][0] = ConteudoCasa.MAIS;
		casa[0][2] = ConteudoCasa.MAIS;
		casa[0][4] = ConteudoCasa.MAIS;
		
		casa[4][0] = ConteudoCasa.XIS;
		casa[4][2] = ConteudoCasa.XIS;
		casa[4][4] = ConteudoCasa.XIS;
		
	}
	
	public void cenarioEmQueOMaisEstahFechado(){
		casa = new ConteudoCasa[TAMANHO][TAMANHO];
		for(int i=0;i<TAMANHO;i++){
			for(int j=0;j<TAMANHO;j++){
				if(casa[i][j]==null){
					casa[i][j]= ConteudoCasa.NADA;
				}
			}
		}
		casa[0][0] = ConteudoCasa.MAIS;
		casa[0][1] = ConteudoCasa.XIS;
		casa[1][0] = ConteudoCasa.XIS;
		
		casa[4][0] = ConteudoCasa.XIS;
		casa[4][2] = ConteudoCasa.XIS;
		casa[4][4] = ConteudoCasa.XIS;
	}
	
	public void cenarioEmQueOMaisTemUmaPecaFechadaEOutraNao(){
		casa = new ConteudoCasa[TAMANHO][TAMANHO];
		for(int i=0;i<TAMANHO;i++){
			for(int j=0;j<TAMANHO;j++){
				if(casa[i][j]==null){
					casa[i][j]= ConteudoCasa.NADA;
				}
			}
		}
		casa[0][0] = ConteudoCasa.MAIS;
		casa[0][1] = ConteudoCasa.XIS;
		casa[1][0] = ConteudoCasa.XIS;
		
		casa[4][0] = ConteudoCasa.XIS;
		casa[4][2] = ConteudoCasa.XIS;
		casa[4][4] = ConteudoCasa.MAIS;
	}
	
	public void maisPerdeuPorFaltaDePecas(){
		casa = new ConteudoCasa[TAMANHO][TAMANHO];
		for(int i=0;i<TAMANHO;i++){
			for(int j=0;j<TAMANHO;j++){
				if(casa[i][j]==null){
					casa[i][j]= ConteudoCasa.NADA;
				}
			}
		}
		casa[0][0] = ConteudoCasa.XIS;
		casa[0][1] = ConteudoCasa.XIS;
		casa[1][0] = ConteudoCasa.XIS;
		
		casa[4][0] = ConteudoCasa.XIS;
		casa[4][2] = ConteudoCasa.XIS;
		casa[4][4] = ConteudoCasa.XIS;
	}
	
	public void xisDuasPecasFechadas(){
		casa = new ConteudoCasa[TAMANHO][TAMANHO];
		for(int i=0;i<TAMANHO;i++){
			for(int j=0;j<TAMANHO;j++){
				if(casa[i][j]==null){
					casa[i][j]= ConteudoCasa.NADA;
				}
			}
		}
		casa[3][1] = ConteudoCasa.MAIS;
		casa[1][1] = ConteudoCasa.MAIS;
		
		casa[2][2] = ConteudoCasa.XIS;
		casa[3][2] = ConteudoCasa.MAIS;
		
		casa[3][3] = ConteudoCasa.MAIS;	
		casa[1][3] = ConteudoCasa.MAIS;
		casa[4][4] = ConteudoCasa.XIS;
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
