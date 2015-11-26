# Cruzes

Jogo de tabauleiro inventado para a disciplina de Programação Orientada a Objetos.

O código foi inicialmente escrito pelo professor e posteriormente incrementado
pelos alunos. A versão atual não está finalizada e contém várias pontas soltas.

## Regulamento do jogo

Veja os vídeos demonstrativos:

1. https://youtu.be/Oo-yM7k32WA
1. https://youtu.be/6sZnZQAGUp4

Cruzes é um jogo contemporâneo de dois jogadores. Um jogador joga com o time da
cruz mais (+), o outro joga com o time da cruz xis (x). O time a começar o jogo
é definido por sorteio.

O tabuleiro é quadrado e composto de casas quadradas, similar ao de damas,
com casas pretas e brancas alternadas. As casas dos quatro cantos são pretas.
O tamanho do lado deve ser um número ímpar. Normalmente, adota-se 5x5, mas
qualquer tamanho ímpar maior que ou igual a 5x5 é válido.

As peças são colocadas na primeira fileira de cada lado, sempre nas casas
pretas. O número de peças para cada jogador é (n + 1) / 2, sendo n o tamanho do
lado do tabuleiro.

Na vez de cada jogador, ele deve movimentar uma de suas peças, para frente ou
para trás. O movimento do time mais deve ser na horizontal ou vertical; e o
movimento do time xis deve ser na diagonal. O movimento deve sempre pegar uma
peça e levar a uma casa vazia; não é possível movimentar uma peça para uma casa
já ocupada.

As casas adjacentes a uma peça são as casas de influência daquela peça.
A adjacência do time mais ocorre na horizontal e na vertical; a influência do
time xis é na diagonal. Basta seguir a direção indicada pela cruz.
Assim que uma peça é movida, se ela influenciar
uma peça do oponente, esta última é convertida para o time da primeira.
O time xis converte peças mais em xis; o time mais converte peças xis em mais.

A conversão só acontece imediatamente após o movimento. Mover uma peça para uma
casa influenciada não tem nenhum efeito.

O objetivo do jogo é converter todas as peças do oponente. O jogo termina
quando atinge uma das seguintes situações:
  * Um jogador converteu todas as peças do outro
  * Um jogador não tem movimento válido para fazer. Nesse caso, quem tiver mais peças ganha.

## Trabalho

A versão atual do projeto conta com um pacote chamado api. Nele, estão diversas interfaces, alguns enums,
algumas exceções e uma classe abstrata. O trabalho de cada grupo será implementar algumas das interfaces ou
classe abstrata. As interfaces/classe a serem implementadas devem seguir as instruções informadas.

As classes concretas devem ser criadas no pacote implementacao, onde há uma classe de exemplo chamada
ColoqueSuasClassesAqui.

Cada grupo deverá bifurcar este repositório, implementar as novas funcionalidades e,
quando terminar a implementação, abrir um Pull Request pelo GitHub. Isso solicitará ao professor
a integração das funcionalidades implementadas no repositório original.

## Divisão de tarefas

Cada grupo deverá escolher para fazer uma das tarefas a seguir:

1. Partida (classe que coordena a interação entre as outras)

1. VisualizacaoTabuleiro (em modo console); Jogador (humano, que leia os movimentos desejados usando Scanner); Jogador (IA extremamente simples, que tente fazer movimentos aleatórios). Caso uma ou mais das classes que você fizer precisar de uma instância de FabricaMovimento, faça a classe receber essa instância no construtor.

1. VisualizacaoTabuleiro (em modo interface gráfica); Jogador (humano, que leia os movimentos desejados usando JOptionPane). Caso uma ou mais das classes que você fizer precisar de uma instância de FabricaMovimento, faça a classe receber essa instância no construtor.

1. Casa; FabricaTabuleiro; TabuleiroLeituraEscrita. As exceções indicadas nas interfaces devem ser disparadas caso ocorram aqueles erros.

1. AnalisadorTabuleiro; EstadoJogo

1. Movimento; Posicao; Jogador (humano, que leia os movimentos desejados a partir da rede, usando um Socket)
