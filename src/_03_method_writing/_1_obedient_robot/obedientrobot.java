package _03_method_writing._1_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedientrobot {
	static Robot rob = new Robot();
public static void main(String[] args) {
String shape = JOptionPane.showInputDialog("what shape would you like to be drawn?");
String color = JOptionPane.showInputDialog("would you like the shape to be red, green, or blue?");
if (color.equalsIgnoreCase("red")) {
	rob.setPenColor(Color.red);
}
else if (color.equalsIgnoreCase("green")) {
	rob.setPenColor(Color.green);
}
else if (color.equalsIgnoreCase("blue")) {
	rob.setPenColor(Color.blue);
}
	if (shape.equalsIgnoreCase("square")) {
		drawSquare();
	}
	else if (shape.equalsIgnoreCase("triangle")) {
		drawTriangle();
	}
	else if (shape.equalsIgnoreCase("circle")) {
		drawCircle();
	}

	}
static void drawSquare() {
	rob.penDown();
	for (int j=1; j<5; j++) {
	rob.move(100);
	rob.turn(90);
	}
}
static void drawTriangle() {
	rob.penDown();
	for (int j=1; j<4; j++) {
		rob.move(100);
		rob.turn(60);
	}
}
static void drawCircle() {
	rob.penDown();
	for (int j=1; j<31; j++) {
		rob.turn(12);
		rob.move(10);
	}
}
static void drawRed() {
	
}
}
