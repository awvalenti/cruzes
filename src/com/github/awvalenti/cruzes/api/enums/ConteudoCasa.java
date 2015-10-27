package com.github.awvalenti.cruzes.api.enums;

public enum ConteudoCasa {
	MAIS("+"), XIS("x"), NADA("_");

	private String conteudo;

	ConteudoCasa(final String conteudo) {
		this.conteudo = conteudo;

	}

	@Override
	public String toString() {

		return this.conteudo;
	}
}
