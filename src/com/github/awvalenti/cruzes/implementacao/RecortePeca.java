package com.github.awvalenti.cruzes.implementacao;

import java.awt.image.BufferedImage;
import java.io.IOException;

enum RecortePeca {
	
	XIS(60,18,60,60), MAIS(1,18,60,60), NULO(1,1,1,1);

	private BufferedImage figuraPeca;
	private String caminhoImagemLocal = "imagemPecas.png";

	public BufferedImage getBufferedImage() {
		return figuraPeca;
	}

	private RecortePeca(int x, int y, int largura, int altura) {
		
		CarregadorImagem loader = new CarregadorImagem();
		BufferedImage spriteSheet = null;
		try {
			spriteSheet = loader.carregarImagem(caminhoImagemLocal);
		} catch (IOException e) {
			e.printStackTrace();
		}

		SpriteSheet ss = new SpriteSheet(spriteSheet);

		this.figuraPeca = ss.recortarImagem(x, y, largura, altura);
	}
}
