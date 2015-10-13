package com.github.awvalenti.cruzes.implementacao;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

public class CarregadorImagem {

	public BufferedImage carregarImagem(String caminhoImagem) throws IOException {
		URL url = getClass().getResource(caminhoImagem);
		BufferedImage imagem = ImageIO.read(url);
		return imagem;
	}
}
