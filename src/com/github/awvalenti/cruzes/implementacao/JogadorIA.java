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
		// TODO Auto-generated method stub
		
		
		return null;
	}
	
	

}
