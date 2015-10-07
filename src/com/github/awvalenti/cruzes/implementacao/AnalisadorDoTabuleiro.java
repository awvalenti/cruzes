package com.github.awvalenti.cruzes.implementacao;

import com.github.awvalenti.cruzes.api.enums.ConteudoCasa;
import com.github.awvalenti.cruzes.api.enums.Time;
import com.github.awvalenti.cruzes.api.excecoes.PosicaoInvalidaException;
import com.github.awvalenti.cruzes.api.interfaces.AnalisadorTabuleiro;
import com.github.awvalenti.cruzes.api.interfaces.EstadoJogo;
import com.github.awvalenti.cruzes.api.interfaces.TabuleiroLeitura;

public class AnalisadorDoTabuleiro implements AnalisadorTabuleiro {

	@Override
	public EstadoJogo determinarEstado(TabuleiroLeitura tabuleiro) {
		boolean terminou = false;
		Time timeVencedor = null;
		
		for(int i = 0;i<tabuleiro.getNumeroColunas();i++){
			for(int j = 0;j<tabuleiro.getNumeroLinhas();j++){
				int qtdXis, qtdMais;
				qtdMais = qtdXis  = 0;
				
				ConteudoCasa conteudoCasa = null;
				try {
					conteudoCasa = tabuleiro.getConteudoDaCasa(new Posicao(i, j));
				} catch (PosicaoInvalidaException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				switch (conteudoCasa) {
				case MAIS:
					qtdMais++;
					break;
				case XIS:
					qtdXis++;
					break;
				}
				
				if(qtdXis==0){
					terminou = true;
					timeVencedor = Time.MAIS;
					
					return new EstadoDoJogo(terminou, timeVencedor);
				}
				
				if(qtdMais==0){
					terminou = true;
					timeVencedor = Time.XIS;
					return new EstadoDoJogo(terminou, timeVencedor);
				}
			
				
				
					if(temMovimentoPossivel(tabuleiro,ConteudoCasa.XIS)){
						terminou = true;
						timeVencedor = Time.MAIS;
						return new EstadoDoJogo(terminou, timeVencedor);
					}
					

					if(temMovimentoPossivel(tabuleiro,ConteudoCasa.MAIS)){
						terminou = true;
						timeVencedor = Time.MAIS;
						return new EstadoDoJogo(terminou, timeVencedor);
					}
				
			}
		}
		EstadoJogo estado = new EstadoDoJogo(terminou, timeVencedor);
		return estado;
	}

	private boolean temMovimentoPossivel(TabuleiroLeitura tabuleiro,ConteudoCasa conteudo) {
		boolean estahTravado = true;
		for(int i = 0;i<tabuleiro.getNumeroColunas();i++){
			for(int j = 0;j<tabuleiro.getNumeroLinhas();j++){
				try {
					if(tabuleiro.getConteudoDaCasa(new Posicao(i, j)).equals(conteudo)){
						if(temMovimentoPossivel(tabuleiro, conteudo, new Posicao(i, j))){
							estahTravado = true;
						}
					}
				} catch (PosicaoInvalidaException e) {
					//Deu ruim...
				}
				
			}
		}
		
		return estahTravado;
	}
	private boolean temMovimentoPossivel(TabuleiroLeitura tabuleiro,ConteudoCasa conteudo ,Posicao posicao){
		int linha = posicao.getLinha();
		int coluna = posicao.getColuna();
		
		try {
			if(conteudo  == ConteudoCasa.XIS){
				if(tabuleiro.getConteudoDaCasa(new Posicao(linha + 1,coluna +1)) == ConteudoCasa.NADA)
					return true;
				if(tabuleiro.getConteudoDaCasa(new Posicao(linha + 1,coluna -1)) == ConteudoCasa.NADA)
					return true;
				if(tabuleiro.getConteudoDaCasa(new Posicao(linha - 1,coluna +1)) == ConteudoCasa.NADA)
					return true;
				if(tabuleiro.getConteudoDaCasa(new Posicao(linha - 1,coluna -1)) == ConteudoCasa.NADA)
					return true;
			}
			if(conteudo == ConteudoCasa.MAIS){
				if(tabuleiro.getConteudoDaCasa(new Posicao(linha + 1,coluna)) == ConteudoCasa.NADA)
					return true;
				if(tabuleiro.getConteudoDaCasa(new Posicao(linha - 1,coluna)) == ConteudoCasa.NADA)
					return true;
				if(tabuleiro.getConteudoDaCasa(new Posicao(linha,coluna +1)) == ConteudoCasa.NADA)
					return true;
				if(tabuleiro.getConteudoDaCasa(new Posicao(linha,coluna -1)) == ConteudoCasa.NADA)
					return true;
			}
		} catch (PosicaoInvalidaException e) {
			//Deu ruim...
		}
		return false;
		
	}
}
