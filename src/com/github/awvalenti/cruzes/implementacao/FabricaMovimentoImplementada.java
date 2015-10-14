package com.github.awvalenti.cruzes.implementacao;

import com.github.awvalenti.cruzes.api.interfaces.FabricaMovimento;
import com.github.awvalenti.cruzes.api.interfaces.Movimento;

public class FabricaMovimentoImplementada implements FabricaMovimento {

	@Override
	public Movimento criar(final int linhaOrigem, final int colunaOrigem,
			final int linhaDestino, final int colunaDestino) {

		return new MovimentoConcreto(new PosicaoConcreta(linhaOrigem,
				colunaOrigem), new PosicaoConcreta(linhaDestino, colunaDestino));
	}

}
