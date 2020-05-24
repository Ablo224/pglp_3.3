package uvsq21606235;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPosition {

	@Test
	public void testConstruction() {
		Position p = new Position(2, 4);
		assertNotNull(p);
		assertTrue(p.getX() == 2 && p.getY() == 4);
		System.out.println("création d'une position réussi");
	}

}
