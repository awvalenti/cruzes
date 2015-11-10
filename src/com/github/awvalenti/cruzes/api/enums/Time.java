package com.github.awvalenti.cruzes.api.enums;

import com.github.awvalenti.cruzes.api.interfaces.Casa;

public enum Time {
	MAIS('+'), XIS('x');

	private final char caractere;

	private Time(final char caractere) {
		this.caractere = caractere;
	}

	public char getCaractere() {
		return caractere;
	}

	void obterCasasAdjacentes(final Casa casaDestino) {

		switch (casaDestino.getConteudo()) {
		case MAIS:
			break;
		case NADA:
			break;
		case XIS:
			break;
		default:
			break;
		}
	}

}
