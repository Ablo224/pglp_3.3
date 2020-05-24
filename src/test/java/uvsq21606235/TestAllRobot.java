package uvsq21606235;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class TestAllRobot {

	/**
	 * test pour la methode avance qui permet 
	 * de faire avancer tous les robot
	 */
	@Test
	public void testAvance() {
		Position p = new Position(2, 4);
		Position p1 = new Position(3, 9);
		Direction d = null;
		Direction d1 = null;
		
		RobotMobile r1 = new RobotMobile(d.N, p);
		RobotMobile r2 = new RobotMobile(d1.E, p1);
		AllRobot allR = new AllRobot();
		
		allR.ajoutRobot(r1);
		allR.ajoutRobot(r2);
		allR.avance(d.N);
		
		
		assertTrue(r1.getPosition().getY() == 5  
					&& r2.getPosition().getY() == 10);
		System.out.println("les robot ont changé de position");

	}
	
	@Test
	public void testTourne() {
		Position p = new Position(2, 4);
		Position p1 = new Position(3, 9);
		Direction d = null;
		Direction d1 = null;
		
		RobotMobile r1 = new RobotMobile(d.E, p);
		RobotMobile r2 = new RobotMobile(d1.E, p1);
		AllRobot allR = new AllRobot();
		
		allR.ajoutRobot(r1);
		allR.ajoutRobot(r2);
		allR.tourne(d.N);
		
		
		assertTrue(r1.getDirection() == d.N 
					&& r2.getDirection() == d.N);
		System.out.println("les robot ont changé de direction");
		
	}

}
