package uvsq21606235;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRobotMobile {

	@Test
	public void testConstruction() {
		Position p = new Position(2, 4);
		Direction d = null;
		
		RobotMobile r = new RobotMobile(d.N, p);
		assertNotNull(r);
	}
	
	@Test
	public void testTourne() {
		Position p = new Position(2, 4);
		Direction d = null;
		
		RobotMobile r = new RobotMobile(d.E, p);
		assertTrue(r.getDirection() == d.E);
		System.out.println("le robot à tourner");
	}
	
	@Test
	public void testAvance() {
		Position p = new Position(2, 4);
		Direction d = null;
		
		
		RobotMobile r = new RobotMobile(d.E, p);
		r.avance(d.N);
		assertTrue(r.getPosition().getX() == 2 
				&& r.getPosition().getY() == 5);
		System.out.println("le robot à avancer jusqu'au point ( "
				+ r.getPosition().getX() 
				+" "+r.getPosition().getY()+" )");
	}

}
