package drone.aceleradora.processo.seletivo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner keypad = new Scanner(System.in);
		System.out.println("\n");
		System.out.println("                 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("                 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("                 @@@@                                    Bem vindos ao Drones do Caribe!                                     @@@@");
		System.out.println("                 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("                 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("                 @                                                                                                              @");
		System.out.println("                 @               ###### Vamos explorar a ilha! Por�m as seguintes regras devem ser respeitadas: ######          @");
		System.out.println("                 @                                                                                                              @");
		System.out.println("                 @         Comandos:                                                                                            @");
		System.out.println("                 @                                                                                                              @");
		System.out.println("                 @           A Linha de comando deve conter apenas:                                                             @");
		System.out.println("                 @              ==> \"E\" para virar o drone para a esquerda;                                                     @");
		System.out.println("                 @              ==> \"D\" para virar o drone para a Direita;                                                      @");
		System.out.println("                 @              ==> \"M\" para mover o drone uma posi��o na dire��o que eles estiver virado;                      @");
		System.out.println("                 @                                                                                                              @");
		System.out.println("                 @         Para iniciar a explora��o:                                                                           @");
		System.out.println("                 @                                                                                                              @");
		System.out.println("                 @           A Primeira linha determina o limite superior direito da ilha:                                      @");
		System.out.println("                 @               ==> apenas N�meros inteiros positivos;                                                         @");
		System.out.println("                 @               ==> apenas um espa�o em branco entre eles;                                                     @");
		System.out.println("                 @           A Segunda linha determina a localiza��o inicial do drone e para qual dire��o ele esta voltado:     @");
		System.out.println("                 @               ==> apenas a sequencia de dois n�meros e uma letra separados por um espa�o em branco           @");
		System.out.println("                 @                 ser�o aceitos                                                                                @");
		System.out.println("                 @               ==> Os n�meros devem ser inteiros positivos e menores que os limites da ilha;                  @");
		System.out.println("                 @               ==> Somente as letras \"N\" para norte, \"S\" para sul, \"L\" ou \"E\" para leste e                    @");
		System.out.println("                 @                 \"O\" ou \"W\" para oeste ser�o aceitas;\"                                                        @");
		System.out.println("                 @                                                                                                              @");
		System.out.println("                 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");


		System.out.printf("\n	                Quantos drones ir�o explorar a ilha?\n");		
		int numberDrones = keypad.nextInt();
		keypad.hasNextLine();

		System.out.printf("\n	                Qual � o limite superior da ilha?\n");	
		keypad.nextLine();	
		String upperLimitISland = keypad.nextLine();	

		ArrayList<String> posDroneList = new ArrayList<>();
		ArrayList<String> commandList = new ArrayList<>();

		int aux = numberDrones;
		for(int i = 0; i < aux; i++) {

			System.out.print("\n                	Qual a posi��o do drone"+i+"?\n");	
			String posAux = keypad.nextLine();
			posDroneList.add(posAux);

			System.out.print("\n                	Qual o comando para o drone"+i+"?\n");
			String commandAux = keypad.nextLine();
			commandList.add(commandAux);	
		}

		keypad.close();

		String[] limitSplited = upperLimitISland.split(" ");
		int limitX = Character.getNumericValue(limitSplited[0].charAt(0));
		int limitY = Character.getNumericValue(limitSplited[1].charAt(0));

		Driver driver = new Driver(limitX, limitY);

		for(int i = 0; i < posDroneList.size(); i++) {
			String[] posDroneSplited = posDroneList.get(i).split(" ");
			int posX = Character.getNumericValue(posDroneSplited[0].charAt(0));
			int posY = Character.getNumericValue(posDroneSplited[1].charAt(0));
			char front = posDroneSplited[2].charAt(0);	
			driver.addDronew(posX, posY, front);
			String aux2 = commandList.get(i);
			driver.receiveCommand(i, aux2 );
			System.out.print("\n	                A posi��o atual do Drone"+i+" �: "); 
			driver.printActualPosition(i);
		}




	}

}
