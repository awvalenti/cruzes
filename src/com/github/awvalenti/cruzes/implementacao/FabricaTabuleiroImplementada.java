package com.github.awvalenti.cruzes.implementacao;

import com.github.awvalenti.cruzes.api.excecoes.TamanhoInvalidoException;
import com.github.awvalenti.cruzes.api.interfaces.FabricaTabuleiro;
import com.github.awvalenti.cruzes.api.interfaces.TabuleiroLeituraEscrita;

public class FabricaTabuleiroImplementada implements FabricaTabuleiro {

	@Override
	public TabuleiroLeituraEscrita criarTabuleiro(final int numeroLinhas, final int numeroColunas) throws TamanhoInvalidoException {
		return null;
	}

}
