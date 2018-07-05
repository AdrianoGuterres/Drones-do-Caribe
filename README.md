# Drones-do-Caribe
This is an exercise proposed by Aceleradora de Metodologias Ágeis.

                                               ===================================
                                                        Drones do Caribe
  Um grupo de drones está prestes a desembarcar em uma ilha desconhecida. Esta
ilha, a qual é curiosamente retangular, deve ser explorada por estes drones para que suas
câmeras on-board possam mapear a vista do terreno que os envolve e enviar as imagens
de volta à base.  
  A posição do drone e sua localização é representada pela combinação de
coordenadas X e Y e de uma letra representando uma das quatro posições cardeais. A
ilha é dividida em uma matriz para facilitar a navegação. Um exemplo de posição poderia
ser 0, 0, N, o que significa que o drone está no canto inferior esquerdo, virado para o
Norte.
  Como forma de controlar o drone, a base envia uma simples String de letras. As
letras possíveis são ‘E’, ‘D’ e ‘M’. As letras ‘E’ e ‘D’ fazem o drone girar 90° para a
esquerda ou para a direita, respectivamente, sem movê-lo de sua posição atual. ‘M’
significa que o drone deve se mover uma posição para frente mantendo a mesma direção
original.
  Assuma que o Norte da matriz de (x, y) é (x, y+1).
  
ENTRADA:
  A primeira linha da entrada é o lado superior direito da ilha, o lado inferior esquerdo
é (0, 0).
O resto dos dados de entrada referem-se aos drones que já estão preparados nas
suas respectivas ilhas. Cada drone recebe duas linhas de entrada. A primeira linha revela
a posição e a segunda linha é uma série de instruções que informa como o drone deve
explorar a ilha.
  A posição consiste de dois números inteiros e de uma letra, separados por espaços
em branco, correspondendo às coordenadas X e Y e a orientação do drone.
Cada drone explorador finalizará a tarefa de forma sequencial, ou seja, o segundo
drone só irá se mover após o primeiro já ter completado sua tarefa.

SAÍDA ESPERADA
  A saída para cada drone deve ser sua coordenada final e a orientação para onde
está apontado.

ENTRADA E SAÍDA

      ● Teste de entrada:
        5 5
        1 2 N
        EMEMEMEMM
        3 3 E
        MMDMMDMDDM
        
      ● Saída Esperada:
        1 3 N
        5 1 E

