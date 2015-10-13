package com.github.awvalenti.cruzes.implementacao;

import com.github.awvalenti.cruzes.api.interfaces.Jogador;
import com.github.awvalenti.cruzes.api.interfaces.Movimento;
import com.github.awvalenti.cruzes.api.interfaces.Posicao;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import java.io.DataInputStream; 

public class JogadorEmRede implements Jogador {

	Movimento movimentoDesejado;
	Socket    socketInput;
	
	public JogadorEmRede(int porta){
		
		try{
		
		@SuppressWarnings("resource")
		ServerSocket socket = new ServerSocket(porta);
		this.socketInput = socket.accept();
		}
		
		catch(IOException e){
			e.printStackTrace();
		}
	}
	
	
	//passando um DataInputStream por linha/coluna porque não sei
	//como passar o objeto completo, já que não tem um read especifico pra ele
	
	@Override
	public Movimento obterMovimentoDesejado(DataInputStream linhaOrigem, DataInputStream colunaOrigem, 
							DataInputStream linhaDestino, DataInputStream colunaDestino) throws IOException {
		
		//recebe os datainput como parametro, extrai o valor inteiro de cada um e instancia posicoes
		
		Posicao posicaoOrigem = new PosicaoConcreta(linhaOrigem.readInt(), colunaOrigem.readInt());
		Posicao posicaoDestino = new PosicaoConcreta(linhaDestino.readInt(), colunaDestino.readInt());
		
		//constrói movimento a partir das posições extraídas
		
		movimentoDesejado = new MovimentoConcreto(posicaoOrigem, posicaoDestino);
		
		socketInput.close();
		
		return movimentoDesejado;
		
	}

	
	
}
