package com.github.awvalenti.cruzes.implementacao;

import com.github.awvalenti.cruzes.api.excecoes.TamanhoInvalidoException;
import com.github.awvalenti.cruzes.api.interfaces.FabricaTabuleiro;
import com.github.awvalenti.cruzes.api.interfaces.TabuleiroLeituraEscrita;

public class FabricaTabuleiroImplementada implements FabricaTabuleiro {

	private static final int MIN_SIZE = 5;

	@Override
	public TabuleiroLeituraEscrita criarTabuleiro(final int numeroLinhas, final int numeroColunas) throws TamanhoInvalidoException {
		if (!isInputValid(numeroLinhas, numeroColunas)) {
			throw new TamanhoInvalidoException();
		}

		return new TabuleiroLeituraEscritaImplementado(numeroLinhas);
	}

	private boolean isInputValid(final int numeroLinhas, final int numeroColunas) {
		// Não é quadrado
		if (numeroLinhas != numeroColunas) {
			return false;
		}

		// Não é maior que 5
		if (numeroLinhas < MIN_SIZE) {
			return false;
		}

		// Não é impar
		if (numeroLinhas % 2 == 0) {
			return false;
		}

		return true;
	}

}
