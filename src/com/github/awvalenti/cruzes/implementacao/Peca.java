package com.github.awvalenti.cruzes.implementacao;

import javax.swing.ImageIcon;

public class Peca {
	
	private RecortePeca recortePeca;
	public int tipoDePeca;

	public Peca(RecortePeca tipoDePeca, int tipo) {
		super();
		this.recortePeca = tipoDePeca;
		this.tipoDePeca = tipo;
	}
	
	public ImageIcon getPeca() {
		return new ImageIcon(recortePeca.getBufferedImage());
	}
}
