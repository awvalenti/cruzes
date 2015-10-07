package com.github.awvalenti.cruzes.implementacao;

import java.util.Scanner;

import com.github.awvalenti.cruzes.api.interfaces.FabricaMovimento;
import com.github.awvalenti.cruzes.api.interfaces.Jogador;
import com.github.awvalenti.cruzes.api.interfaces.Movimento;

public class JogadorHumanoScanner implements Jogador{

	private FabricaMovimento fabricaMovimento;
	
	public JogadorHumanoScanner(FabricaMovimento fabrica){
		this.fabricaMovimento=fabrica;
	}
	@Override
	public Movimento obterMovimentoDesejado() {
		
		int linhaOrigem=0, colunaOrigem=0, linhaDestino=0, colunaDestino=0;
		
		Scanner ler= new Scanner(System.in);
		
		fabricaMovimento.criar(linhaOrigem, colunaOrigem, linhaDestino, colunaDestino);
		
		System.out.println("Valor linha Origem:\n");
		linhaDestino= ler.nextInt();
		
		System.out.println("Valor coluna Origem:\n");
		colunaDestino=ler.nextInt();
		
		System.out.println("Valor linha Destino");
		linhaDestino=ler.nextInt();
		
		System.out.println("Valor coluna Destino");
		colunaDestino=ler.nextInt();
		
		
		
		
		
		return obterMovimentoDesejado();
	}

}
