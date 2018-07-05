package drone.aceleradora.processo.seletivo;

import java.util.ArrayList;

public class Driver {
	private ArrayList<Drone> droneList;
	private Isand island;

	public Driver(int islandLimitX, int islandLimitY ) {
		this.island = new Isand(islandLimitX, islandLimitY);
		this.droneList = new ArrayList<>();
	}
	
	public void addDronew(int posX, int posY, char front) {
		droneList.add(new Drone(posX, posY, front));		
	}

	public boolean receiveCommand(int indexDroneList, String command) {
		
		Drone drone = droneList.get(indexDroneList);
		
		int actualPosX = drone.getPosX();
		int actualPosY = drone.getPosY();
		char actualFront = drone.getFront();
		
		
		
		boolean aux = false;
		int countD = 0;
		int countE = 0;
		int countM = 0;
		
		char[] arrayCommands = command.toCharArray();

		for(int i = 0; i < arrayCommands.length; i ++) {
			if(arrayCommands[i] == 'D') { 
				countD++;				
			}else if(arrayCommands[i] == 'E') {
				countE++;				
			}else if (arrayCommands[i] == 'M') {
				countM++;				
			}
		}
		
		
		
		if((countD+countE+countM) == arrayCommands.length) {
			
			for(int i = 0; i < arrayCommands.length; i ++) {				
				if((arrayCommands[i]== 'D') || (arrayCommands[i]== 'E')) {
					drone.turn(arrayCommands[i]);					
				}else {
					drone.move();	
				}	
			}
			
			if((drone.getPosX() >= 0) && (drone.getPosY() >= 0)) {
				
				
				if((drone.getPosX() <= this.island.getLimitX()) && (drone.getPosY() <= this.island.getLimitY())) {
					
					aux = true;					
				}else {
					drone.setFront(actualFront);
					drone.setPosX(actualPosX);
					drone.setPosY(actualPosY);
					System.out.println("Os comandos levaram o Drone "+indexDroneList+" para fora da ilha, por isso ele retornou a posição anterior aos comandos recebidos!");
					System.out.println("Posição atual do Drone "+indexDroneList+": "+drone.getActualPosition());
					aux = false; 
				}
				
				
				
			}else {
				drone.setFront(actualFront);
				drone.setPosX(actualPosX);
				drone.setPosY(actualPosY);
				System.out.println("Os comandos levaram o Drone "+indexDroneList+" para fora da ilha, por isso ele retornou a posição anterior aos comandos recebidos!");
				System.out.println("Posição atual do Drone "+indexDroneList+": "+drone.getActualPosition());
				aux = false; 
			}		
			
			
		}else {
			System.out.println("Os comandos devem conter somente as letras \"D\", \"E\" ou \"M\"!");
		}		


		return aux;
	}
	
	
	public Isand getIsland() {
		return island;
	}

	public void printActualPosition(int indexDroneList) {
		System.out.println(droneList.get(indexDroneList).getActualPosition());
	}


}
