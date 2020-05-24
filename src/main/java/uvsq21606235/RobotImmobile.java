package uvsq21606235;

/**
 * ce robot est immobile donc sa position 
 * et direction ne change pas
 * @author ablo
 *
 */
public class RobotImmobile extends Robot {
	
	private Position p;
	private Direction d;
	
	public  RobotImmobile(Position p, Direction d) {
		this.p = p;
		this.d = d;
	}
	
	public Position getPosition() {
		return this.p;
	}
	
	public Direction getDirection() {
		return this.d;
	}

	@Override
	public void tourne(Direction d) {
		// TODO Auto-generated method stub
		System.out.println("ce robot ne peut pas tourner");
		
	}

	@Override
	public void avance(Direction d) {
		// TODO Auto-generated method stub
		System.out.println("ce robot ne peut pas avancer");
		
	}

}
