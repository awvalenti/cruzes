package com.github.awvalenti.cruzes.api.enums;

import com.github.awvalenti.cruzes.api.interfaces.Posicao;

public enum ConteudoCasa {
	MAIS("+"), XIS("x"), NADA("_");

	private String conteudo;
	private Posicao posicao;
	
	ConteudoCasa(final String conteudo) {
		this.conteudo = conteudo;

	}

	@Override
	public String toString() {

		return this.conteudo;
	}

	public Posicao getPosicao() {
		return posicao;
	}

	public void setPosicao(Posicao posicao) {
		this.posicao = posicao;
	}
}

