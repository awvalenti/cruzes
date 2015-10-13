package com.github.awvalenti.cruzes.implementacao;
import java.awt.image.BufferedImage;

public class SpriteSheet {

	public BufferedImage spriteSheet;

	public SpriteSheet(BufferedImage sptsht) {
		
		this.spriteSheet = sptsht;
	}

	public BufferedImage recortarImagem(int x, int y, int largura, int altura){

		BufferedImage sprite = spriteSheet.getSubimage(x, y, largura, altura);
		
		return sprite;
	}

}
