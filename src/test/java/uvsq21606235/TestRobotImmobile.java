package uvsq21606235;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRobotImmobile {

	@Test
	public void testConstruction() {
		Direction d = null;
		Position p = new Position(2, 4);
		
		RobotImmobile r = new RobotImmobile(p, d.S);
		assertNotNull(r);
	}
	
	@Test
	public void testTounreRobotImmobile() {
		Direction d = null;
		Position p = new Position(2, 4);
		
		RobotImmobile r = new RobotImmobile(p, d.S);
		r.tourne(d.N);
		assertFalse(r.getDirection() ==  d.N);
	}
	
	@Test
	public void testAvanceRobotImmobile() {
		Direction d = null;
		Position p = new Position(2, 4);
		
		RobotImmobile r = new RobotImmobile(p, d.S);
		r.avance(d.N);
		assertFalse(r.getPosition().getX() == 2 
				&& r.getPosition().getY() == 5);
	}

}
