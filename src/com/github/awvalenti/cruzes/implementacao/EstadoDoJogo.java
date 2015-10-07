package com.github.awvalenti.cruzes.implementacao;

import com.github.awvalenti.cruzes.api.enums.Time;
import com.github.awvalenti.cruzes.api.interfaces.EstadoJogo;

public class EstadoDoJogo implements EstadoJogo {
	private boolean isFinalizado;
	private Time timeVencedor;

	public EstadoDoJogo(boolean terminou, Time timeVencedor) {
		this.timeVencedor = timeVencedor;
		this.isFinalizado = terminou;
	}

	@Override
	public boolean isFinalizado() {
		return isFinalizado;
	}

	@Override
	public Time getTimeVencedor() {
		// TODO Auto-generated method stub
		return timeVencedor;
	}

}
