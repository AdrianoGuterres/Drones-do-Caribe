package drone.aceleradora.processo.seletivo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import drone.aceleradora.processo.seletivo.Drone;

class DroneTest {
	
	private Drone drone;
	
	
	//----------------------------------------------------- move() tests ---------------------------------------------------------------------------------


	@Test
	void testMoveOneNorth() {
		drone = new Drone(0, 0, 'N');
		
		drone.move();
		
		int expectedX = 0;
		int expectedY = 1;
		char expectedFront = 'N';
		
		 assertEquals(expectedX, drone.getPosX());
		 assertEquals(expectedY, drone.getPosY());
		 assertEquals(expectedFront, drone.getFront());		 
	}
	
	@Test
	void testMoveOneSouth() {
		drone = new Drone(4, 4, 'S');		
		drone.move();
		
		int expectedX = 4;
		int expectedY = 3;
		char expectedFront = 'S';
		
		 assertEquals(expectedX, drone.getPosX());
		 assertEquals(expectedY, drone.getPosY());
		 assertEquals(expectedFront, drone.getFront());		
	}
	
	@Test
	void testMoveOneEast() {
		drone = new Drone(4, 4, 'L');		
		drone.move();
		
		int expectedX = 5;
		int expectedY = 4;
		char expectedFront = 'L';
		
		 assertEquals(expectedX, drone.getPosX());
		 assertEquals(expectedY, drone.getPosY());
		 assertEquals(expectedFront, drone.getFront());
		
	}
	
	@Test
	void testMoveOneWest() {
		drone = new Drone(4, 4, 'O');		
		drone.move();
		
		int expectedX = 3;
		int expectedY = 4;
		char expectedFront = 'O';
		
		 assertEquals(expectedX, drone.getPosX());
		 assertEquals(expectedY, drone.getPosY());
		 assertEquals(expectedFront, drone.getFront());		
	}
	
	//------------------------------------------------------------------------------ turn() tests ------------------------------------------------------------------------
	
	@Test
	void testTurnOnceRight() {
		drone = new Drone(4, 4, 'N');		
		drone.turn('D');
		
		String expected = "4 4 L";
		
		 assertEquals(expected, drone.getActualPosition());		
	}
	
	@Test
	void testTurnTwiceRight() {
		drone = new Drone(4, 4, 'N');		
		drone.turn('D');
		drone.turn('D');
		
		String expected = "4 4 S";		
		 assertEquals(expected, drone.getActualPosition());		
	}
	
	@Test
	void testTurnThreeTimesRight() {
		drone = new Drone(4, 4, 'N');		
		drone.turn('D');
		drone.turn('D');
		drone.turn('D');
		
		String expected = "4 4 O";		
		 assertEquals(expected, drone.getActualPosition());		
	}
	
	@Test
	void testTurnFourTimesRight() {
		drone = new Drone(4, 4, 'N');		
		drone.turn('D');
		drone.turn('D');
		drone.turn('D');
		drone.turn('D');
		
		String expected = "4 4 N";		
		 assertEquals(expected, drone.getActualPosition());		
	}
	
	@Test
	void testTurnFiveTimesRight() {
		drone = new Drone(4, 4, 'N');		
		drone.turn('D');
		drone.turn('D');
		drone.turn('D');
		drone.turn('D');
		drone.turn('D');
		
		String expected = "4 4 L";		
		 assertEquals(expected, drone.getActualPosition());		
	}	
	
	@Test
	void testTurnOnceLeft() {
		drone = new Drone(4, 4, 'N');		
		drone.turn('E');
		
		String expected = "4 4 O";
		
		 assertEquals(expected, drone.getActualPosition());		
	}
	
	@Test
	void testTurnTwiceLeft() {
		drone = new Drone(4, 4, 'N');		
		drone.turn('E');
		drone.turn('E');
		
		String expected = "4 4 S";		
		 assertEquals(expected, drone.getActualPosition());		
	}
	
	@Test
	void testTurnThreeTimesLeft() {
		drone = new Drone(4, 4, 'N');		
		drone.turn('E');
		drone.turn('E');
		drone.turn('E');
		
		String expected = "4 4 L";		
		 assertEquals(expected, drone.getActualPosition());		
	}
	
	@Test 
	void testTurnFourTimesLeft() {
		drone = new Drone(4, 4, 'N');		
		drone.turn('E');
		drone.turn('E');
		drone.turn('E'); 
		drone.turn('E');
		
		String expected = "4 4 N";		
		 assertEquals(expected, drone.getActualPosition());		
	}
	
	@Test
	void testTurnFiveTimesLeft() {
		drone = new Drone(4, 4, 'N');		
		drone.turn('E');
		drone.turn('E');
		drone.turn('E');
		drone.turn('E');
		drone.turn('E');
		
		String expected = "4 4 O";		
		 assertEquals(expected, drone.getActualPosition());		
	}	
	

}
