package com.github.awvalenti.cruzes.implementacao;

import javax.swing.ImageIcon;

public class Peca {
	
	private RecortePeca recortePeca;
	public String nomePeca;

	public Peca(RecortePeca tipoDePeca, String tipo) {
		super();
		this.recortePeca = tipoDePeca;
		this.nomePeca = tipo;
	}
	
	public ImageIcon getPeca() {
		return new ImageIcon(recortePeca.getBufferedImage());
	}
}