package uvsq21606235;

import java.util.ArrayList;
import java.util.List;

public class AllRobot {
	
	private List<RobotMobile> robotM;
	
	public AllRobot() {
		robotM = new ArrayList<RobotMobile>();
	}
	
	public void ajoutRobot(RobotMobile r) {
		robotM.add(r);
	}
	
	public void avance(Direction d) {
		//seul les robots mobiles qui bouge
		for(RobotMobile r: robotM) {
			r.avance(d);
		}
	}
	
	public void tourne(Direction d) {
		//seul les robots mobiles qui bouge
		for(RobotMobile r: robotM) {
			r.tourne(d);
		}
	}

}
