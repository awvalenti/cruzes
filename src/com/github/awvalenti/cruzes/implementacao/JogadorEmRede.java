package com.github.awvalenti.cruzes.implementacao;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import com.github.awvalenti.cruzes.api.interfaces.Jogador;
import com.github.awvalenti.cruzes.api.interfaces.Movimento;
import com.github.awvalenti.cruzes.api.interfaces.Posicao;

public class JogadorEmRede implements Jogador {

	Movimento movimentoDesejado;
	Socket socketInput;
	DataInputStream linhaOrigem;
	DataInputStream colunaOrigem;
	DataInputStream linhaDestino;
	DataInputStream colunaDestino;

	public JogadorEmRede(final int porta, final DataInputStream linhaOrigem,
			final DataInputStream colunaOrigem,
			final DataInputStream linhaDestino,
			final DataInputStream colunaDestino) {

		try {

			@SuppressWarnings("resource")
			final ServerSocket socket = new ServerSocket(porta);
			this.socketInput = socket.accept();
		}

		catch (final IOException e) {
			e.printStackTrace();
		}
	}

	// passando um DataInputStream por linha/coluna porque não sei
	// como passar o objeto completo, já que não tem um read especifico pra ele

	@Override
	public Movimento obterMovimentoDesejado() {

		// recebe os datainput como parametro, extrai o valor inteiro de cada um
		// e instancia posicoes

		Posicao posicaoOrigem = null;
		try {
			posicaoOrigem = new PosicaoConcreta(linhaOrigem.readInt(),
					colunaOrigem.readInt());
		} catch (final IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Posicao posicaoDestino = null;
		try {
			posicaoDestino = new PosicaoConcreta(linhaDestino.readInt(),
					colunaDestino.readInt());
		} catch (final IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// constrói movimento a partir das posições extraídas

		movimentoDesejado = new MovimentoConcreto(posicaoOrigem, posicaoDestino);

		try {
			socketInput.close();
		} catch (final IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return movimentoDesejado;

	}

}
