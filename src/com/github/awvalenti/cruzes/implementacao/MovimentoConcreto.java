package com.github.awvalenti.cruzes.implementacao;

import com.github.awvalenti.cruzes.api.interfaces.Movimento;
import com.github.awvalenti.cruzes.api.interfaces.Posicao;

public class MovimentoConcreto implements Movimento {

	private Posicao origem;
	private Posicao destino;
	
	public MovimentoConcreto(Posicao origem, Posicao destino) {
		this.origem = origem;
		this.destino = destino;
	}
	
	
	@Override
	public Posicao getOrigem() {
		// TODO Auto-generated method stub
		return origem;
	}

	@Override
	public Posicao getDestino() {
		// TODO Auto-generated method stub
		return destino;
	}

}
