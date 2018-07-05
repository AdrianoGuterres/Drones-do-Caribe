package drone.aceleradora.processo.seletivo;

public class Drone {

	private int posX;
	private int posY;
	private char front;

	public Drone(int posX, int posY, char front) {
		setPosX(posX);
		setPosY(posY);
		setFront(front);
	}


	public void turn(char dir) {
		
		switch (dir) {
		case 'D':
			if(front == 'N') {
				this.front = 'L';
				
			}else if(front == 'L') {
				this.front = 'S';
				
			}else if(front == 'S') {
				this.front = 'O';
				
			}else {
				this.front = 'N';
			}
			break;		
			
		case 'E':
			if(front == 'N') {
				this.front = 'O';
				
			}else if(front == 'O') {
				this.front = 'S';
				
			}else if(front == 'S') {
				this.front = 'L';
				
			}else {
				this.front = 'N';
			}
			break;
			

		default:
			break;
		}

	} 


	public void move() {

		switch (front) {		
		case 'N':
			this.posY++;
			break;
		case 'S':
			this.posY--;
			break;
		case 'L':
			this.posX++;
			break;
		case 'O':
			this.posX--;
			break;
		default:
			break;
		} 
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public char getFront() {
		return front;
	}

	public void setFront(char front) {		
		
		switch (front) {
		case 'N':
			this.front = 'N';			
			break;
		case 'S':
			this.front = 'S';			
			break;
		case 'L':
			this.front = 'L';			
			break;
		case 'E':
			this.front = 'L';			
			break;
		case 'O':
			this.front = 'O';			
			break;
		case 'W':
			this.front = 'O';			
			break;
		default:
			break;
		}		 
	}
	
	public String getActualPosition() {
		return this.posX+" "+this.posY+" "+this.front;
	}
}
