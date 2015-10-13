package com.github.awvalenti.cruzes.implementacao;

import com.github.awvalenti.cruzes.api.excecoes.TamanhoInvalidoException;
import com.github.awvalenti.cruzes.api.interfaces.FabricaTabuleiro;
import com.github.awvalenti.cruzes.api.interfaces.TabuleiroLeituraEscrita;

public class FabricaTabuleiroImplementada implements FabricaTabuleiro {

	private static final int MIN_SIZE = 5;

	@Override
	public TabuleiroLeituraEscrita criarTabuleiro(final int numeroLinhas, final int numeroColunas) throws TamanhoInvalidoException {
		if (!entraEhValida(numeroLinhas, numeroColunas)) {
			throw new TamanhoInvalidoException();
		}

		return new TabuleiroLeituraEscritaImplementado(numeroLinhas);
	}

	private boolean entraEhValida(final int numeroLinhas, final int numeroColunas) {
		if (numeroLinhas != numeroColunas) {
			// Não é quadrado
			return false;
		}

		if (numeroLinhas < MIN_SIZE) {
			// É menor que 5
			return false;
		}

		if (ehPar(numeroLinhas)) {
			// É par
			return false;
		}

		return true;
	}

	private boolean ehPar(final int numeroLinhas) {
		return numeroLinhas % 2 == 0;
	}

}
