package com.github.awvalenti.cruzes.implementacao;

import java.awt.Robot;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerJogador {

	public static void main(String[] args){
		
		try{
			String clientLine;
			@SuppressWarnings("resource")
			ServerSocket serverSocket = new ServerSocket(12345);
			
			System.out.println("Server Started .. ");
			
			Robot optimus = new Robot();
			
			while(true){
				
				System.out.println("waiting connections .. .. ");
				
				Socket connectionSocket = serverSocket.accept();
				
				BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
				
				clientLine = inFromClient.readLine();
				
				optimus.keyPress(Integer.parseInt(clientLine));
			}
		}
		catch(Exception e){
			System.out.println("Ocorreu um erro no sistema. Poderosos Autobots estão trabalhando"
					+ "para resolvê-lo o mais rápido possível! (:");			
			e.printStackTrace();
		}
	}

	
}
