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
		  ServerSocket socket = new ServerSocket(porta);
		  this.socketInput = socket.accept();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	
	//DataInputStream
	//DataOutputStream
	@Override
	//passando um DataInputStream por linha/coluna porque nao sei
	//como passar o objeto completo, ja que nao tem um read expecifico pra ele
	//talvez trabalhar com bytes resolva isso mas nao sei
	public Movimento obterMovimentoDesejado(DataInputStream linhaOrigem, DataInputStream colunaOrigem, 
							DataInputStream linhaDestino, DataInputStream colunaDestino) throws IOException {
		
		//recebe os datainput como parametro, extrai o valor inteiro de cada um e instancia posicoes
		Posicao posicaoOrigem = new PosicaoConcreta(linhaOrigem.readInt(), colunaOrigem.readInt());
		Posicao posicaoDestino = new PosicaoConcreta(linhaDestino.readInt(), colunaDestino.readInt());
		
		//constroi movimento a partir das posicoes extraidas
		movimentoDesejado = new MovimentoConcreto(posicaoOrigem, posicaoDestino);
		
		socketInput.close();
		
		return movimentoDesejado;
		
	}

	
	
}
