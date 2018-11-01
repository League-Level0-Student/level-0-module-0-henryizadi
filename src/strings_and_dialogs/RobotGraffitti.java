package strings_and_dialogs;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffitti {
	public static void main(String[] args) {
		Robot h = new Robot();
h.setSpeed(30);		
h.penDown();
h.move(200);
h.turn(180);
h.move(100);
h.turn(270);
h.move(50);
h.turn(270);
h.move(100);
h.turn(180);
h.move(200);

	}
}