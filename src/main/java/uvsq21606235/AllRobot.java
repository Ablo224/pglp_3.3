package uvsq21606235;

import java.util.ArrayList;
import java.util.List;

public class AllRobot {
	
	private List<Robot> robot;
	private List<RobotM> robotM;
	
	public AllRobot() {
		robot =  new ArrayList<Robot>();
		robotM = new ArrayList<RobotM>();
	}
	
	public void avancerTous() {
		//seul les robots mobiles qui bouge
		for(RobotM r: robotM) {
			r.avance();
		}
	}

}
