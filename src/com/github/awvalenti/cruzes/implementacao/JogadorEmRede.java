package com.github.awvalenti.cruzes.implementacao;

import com.github.awvalenti.cruzes.api.interfaces.Jogador;
import com.github.awvalenti.cruzes.api.interfaces.Movimento;
import com.github.awvalenti.cruzes.api.interfaces.Posicao;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class JogadorEmRede implements Jogador {

	Movimento MovimentoDesejado;
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
	
	
	@Override
	public Movimento obterMovimentoDesejado() {
//		this.MovimentoDesejado = socketInput.getInputStream();
//		socketInput.close();
		return this.MovimentoDesejado;
	}

	
	
}
