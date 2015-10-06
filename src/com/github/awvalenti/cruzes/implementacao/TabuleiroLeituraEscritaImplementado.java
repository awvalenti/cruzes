package com.github.awvalenti.cruzes.implementacao;

import com.github.awvalenti.cruzes.api.enums.ConteudoCasa;
import com.github.awvalenti.cruzes.api.enums.CorCasa;
import com.github.awvalenti.cruzes.api.enums.Time;
import com.github.awvalenti.cruzes.api.excecoes.MovimentoInvalidoException;
import com.github.awvalenti.cruzes.api.excecoes.PosicaoInvalidaException;
import com.github.awvalenti.cruzes.api.interfaces.Movimento;
import com.github.awvalenti.cruzes.api.interfaces.Posicao;
import com.github.awvalenti.cruzes.api.interfaces.TabuleiroLeituraEscrita;

public class TabuleiroLeituraEscritaImplementado implements TabuleiroLeituraEscrita {

	private final int dimensao;
	private CasaImplementada[][] tabuleiro;

	public TabuleiroLeituraEscritaImplementado(final int dimensao) {
		this.dimensao = dimensao;
	}

	@Override
	public int getNumeroLinhas() {
		return dimensao;
	}

	@Override
	public int getNumeroColunas() {
		return dimensao;
	}

	@Override
	public CorCasa getCorDaCasa(final Posicao p) throws PosicaoInvalidaException {

		return null;
	}

	@Override
	public ConteudoCasa getConteudoDaCasa(final Posicao p) throws PosicaoInvalidaException {

		return null;
	}

	@Override
	public Time getVezDeQuem() {

		return null;
	}

	@Override
	public void fazerMovimento(final Movimento m) throws PosicaoInvalidaException, MovimentoInvalidoException {
	}

}
