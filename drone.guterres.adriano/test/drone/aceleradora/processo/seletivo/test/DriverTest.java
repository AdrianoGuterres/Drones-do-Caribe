package drone.aceleradora.processo.seletivo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import drone.aceleradora.processo.seletivo.Driver;

class DriverTest {
	
	private Driver driver;

	@Test
	void testReceiveCommandValid() {
		
		driver = new Driver( 5, 5);
		driver.addDronew(1, 2, 'N');
		driver.addDronew(3, 3, 'L');
		
		boolean actual0 = driver.receiveCommand(0,"EMEMEMEMM");
		boolean actual1 = driver.receiveCommand(1,"MMDMMDMDDM");
		driver.printActualPosition(0);
		driver.printActualPosition(1);
		
		assertTrue(actual0);
		assertTrue(actual1);
	}
	
	@Test
	void testReceiveCommandInvalid() {		
		driver = new Driver(50, 50);
		driver.addDronew(0, 0, 'N');
		boolean actual = driver.receiveCommand(0,"DEMDEMA");
		driver.printActualPosition(0);
		assertFalse(actual);
	}
	
	@Test
	void testReceiveCommandSendDroneOffIslandSouth() {
		driver = new Driver(50, 50);
		driver.addDronew(1, 1, 'N');
		boolean actual = driver.receiveCommand(0,"DDMM");
		
		assertFalse(actual);		
	}
	
	@Test
	void testReceiveCommandSendDroneOffIslandWest() {
		driver = new Driver(5, 5);
		driver.addDronew(1, 1, 'N');
		boolean actual = driver.receiveCommand(0,"EMM");
		
		assertFalse(actual);		
	}
	
	@Test
	void testReceiveCommandSendDroneOffIslandNorth() {
		driver = new Driver(5, 5);
		driver.addDronew(1, 1, 'N');
		boolean actual = driver.receiveCommand(0,"MMMMM");
		
		assertFalse(actual);		
	}
	
	@Test
	void testReceiveCommandSendDroneOffIslandEast() {
		driver = new Driver(5, 5);
		driver.addDronew(1, 1, 'N');
		boolean actual = driver.receiveCommand(0,"DMMMMM");
		
		assertFalse(actual);		
	}

}
