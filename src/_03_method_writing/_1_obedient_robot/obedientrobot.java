package _03_method_writing._1_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class obedientrobot {
public static void main(String[] args) {
	drawSquare();
	drawTriangle();
}
static void drawSquare() {
	Robot rob = new Robot();
	rob.penDown();
	for (int j=1; j<5; j++) {
	rob.move(100);
	rob.turn(90);
	}
}
static void drawTriangle() {
	Robot rob = new Robot();
	for (int j=1; j<4; j++) {
		rob.move(100);
		rob.turn(60);
	}
}
}
