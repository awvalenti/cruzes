package com.github.awvalenti.cruzes.api.enums;

public enum Time {
	MAIS('+'), XIS('x');

	private final char caractere;

	private Time(final char caractere) {
		this.caractere = caractere;
	}

	public char getCaractere() {
		return caractere;
	}

}
