package com.github.awvalenti.cruzes.implementacao;

import com.github.awvalenti.cruzes.api.enums.ConteudoCasa;
import com.github.awvalenti.cruzes.api.enums.CorCasa;
import com.github.awvalenti.cruzes.api.interfaces.Casa;

public class CasaImplementada implements Casa {

	private ConteudoCasa conteudo;
	private final CorCasa cor;

	public CasaImplementada(final CorCasa cor) {
		this(cor, ConteudoCasa.NADA);
	}

	public CasaImplementada(final CorCasa cor, final ConteudoCasa conteudo) {
		this.cor = cor;
		this.conteudo = conteudo;
	}

	@Override
	public CorCasa getCor() {
		return cor;
	}

	@Override
	public ConteudoCasa getConteudo() {
		return conteudo;
	}

	@Override
	public void setConteudo(final ConteudoCasa conteudo) {
		this.conteudo = conteudo;
	}

}
