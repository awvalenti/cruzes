package com.github.awvalenti.cruzes.implementacao;

import java.util.Random;

import com.github.awvalenti.cruzes.api.interfaces.FabricaMovimento;
import com.github.awvalenti.cruzes.api.interfaces.Jogador;
import com.github.awvalenti.cruzes.api.interfaces.Movimento;

public class JogadorIA implements Jogador{
	
	private FabricaMovimento fabrica;
	
	public JogadorIA(FabricaMovimento fabrica){
		this.fabrica=fabrica;
		
	}

	@Override
	public Movimento obterMovimentoDesejado() {
		Random gerador = new Random();
		
		int linhaOrigem,colunaOrigem,linhaDestino,colunaDestino;
		
		linhaOrigem=gerador.nextInt(4);
		colunaOrigem=gerador.nextInt(4);
		linhaDestino=gerador.nextInt(4);
		colunaDestino=gerador.nextInt(4);
		
		fabrica.criar(linhaOrigem, colunaOrigem, linhaDestino, colunaDestino);
		
		return fabrica.criar(linhaOrigem, colunaOrigem, linhaDestino, colunaDestino);
	}
	
	

}
