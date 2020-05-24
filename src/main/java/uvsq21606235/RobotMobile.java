package uvsq21606235;

public class RobotMobile extends Robot{
	
	private Direction direction;
	private Position position;
	
	public RobotMobile(Direction d, Position p) {
		this.direction = d;
		this.position = p;
	}
	
	public Position getPosition() {
		return this.position;
	}
	
	public Direction getDirection() {
		return this.direction;
	}
	
	/**
	 * avancer en fonction de la direction souhaité
	 */
	@Override
	public void avance(Direction d) {
		int y = position.getY(); 
		int x = position.getX();
		
        switch (d) {
        //si c'est vers le nord on avance vers le haut en incrémentant 
        case N :
            position.setY(y+1);
            break;
         //si c'est vers le sud on avance vers le bas en décrémentant
        case S :
            position.setY(y--);
            break;
         //si c'est vers l'ouest on avance vers la gauche on décréemente x
        case O :
        	position.setX(x--);
        	break;
        //si c'est vers l'Est on avance vers la droite en incrémentant x
        case E :
        	position.setX(x++);
        	break;
        default :
        	System.out.println("Direction incorrecte");
        	break;
        }
    }
	
	/**
	 * tourner en fonction de la direction
	 */
	@Override
	public void tourne(Direction d) {
		switch (d) {
        case N :
            direction = Direction.N;
            break;
        case S :
        	direction = Direction.S;
        	break;
        case O :
        	direction = Direction.O;
        	break;
        case E :
        	direction = Direction.E;
        	break;
        default :
        	System.out.println("Direction incorrecte");
        	break;
		}
	}

}
