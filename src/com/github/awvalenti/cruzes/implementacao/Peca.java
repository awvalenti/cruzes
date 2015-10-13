package com.github.awvalenti.cruzes.implementacao;

import javax.swing.ImageIcon;

public class Peca {
	
	private RecortePeca recortePeca;
<<<<<<< HEAD
	public String nomePeca;
=======
	public String tipoDePeca;
>>>>>>> 6de08ad29043dd308aad7f9bebad17f9d68d4923

	public Peca(RecortePeca tipoDePeca, String tipo) {
		super();
		this.recortePeca = tipoDePeca;
		this.nomePeca = tipo;
	}
	
	public ImageIcon getPeca() {
		return new ImageIcon(recortePeca.getBufferedImage());
	}
}
