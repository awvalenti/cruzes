package com.github.awvalenti.cruzes.api.interfaces;

import java.io.DataInputStream;

public interface Jogador {

	Movimento obterMovimentoDesejado(DataInputStream linhaOrigem, DataInputStream colunaOrigem, DataInputStream linhaDestino, DataInputStream colunaDestino) throws Exception;

}
