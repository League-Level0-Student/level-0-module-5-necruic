package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class skillpractice {
	public static void main(String[] args) {

		skillpractice skills = new skillpractice();
		//skills.skill1();
		skills.skill2();
		skills.skill3();
		skills.skill4();
		skills.skill5();
	}

	void skill1() {
		// Use pop-ups for the following.
		// Ask the user how many dimes they have
	String dimes =	JOptionPane.showInputDialog("how many dimes do you have?");
	int dimesint = Integer.parseInt(dimes);
		// Tell them how many cents they have (hint multiply by 10)
		JOptionPane.showMessageDialog(null, "you have "+(10*dimesint)+"cents.");
		// Ask the user how tall they are (inches)
	String height =	JOptionPane.showInputDialog("how tall are you?");
	int heightint = Integer.parseInt(height);
		// If they are shorter than 36 inches, tell them to eat their Wheaties
		if (heightint < 36) {
		JOptionPane.showMessageDialog(null, "eat your Wheaties.");
		}
	}

	void skill2() { // Write a loop to print every third number between 1 and 30 to the console
for (int i = 0; i < 31; i++) {
	if (i % 3 == 0) {
	System.out.println(i);
}
}
	}

	void skill3() { // Get a random number that is less than 20 and print it to the console
		int random = new Random().nextInt(20);
		System.out.println(random);
		// Get another random number that is less than 10 and print it to the console
		int random2 = new Random().nextInt(10);
		System.out.println(random2);
		// Using a pop-up, tell the user the difference between the numbers // Hint: use
		// subtraction
		JOptionPane.showMessageDialog(null, "the difference between the numbers is "+(random-random2)+".");
	}

	void skill4() { // In a pop-up, ask the user for the city they live in
		String city = JOptionPane.showInputDialog("What city do you live in?");
		// If they answered "San Diego", tell them they live in America's Finest City
		if (city.equalsIgnoreCase("San Diego")) {
			JOptionPane.showMessageDialog(null, "you live in America's Finest City.");
		}
		// Otherwise, tell them to move to San Diego
		else {
			JOptionPane.showMessageDialog(null, "move to San Diego.");
		}
		// Create a variable - cars - and initialize it to the number of cars your
		// family has. // If there are 0 cars, use a pop-up to display, "I bet you use
		// public transportation."
	String cars = JOptionPane.showInputDialog("how many cars does your family own?");
	int carsint = Integer.parseInt(cars);
		if (carsint == 0) {
			JOptionPane.showMessageDialog(null, "i bet you use public transportation.");
		}
		// If there is 1 car, use a pop-up to display the make/model of the car
		if (carsint == 1){
			JOptionPane.showMessageDialog(null, "toyota corolla");  
			
		}
		// If there is more than 1 car, use a pop-up to display how many wheels the //
		// cars have between them.
		if (carsint >= 2) {
			JOptionPane.showMessageDialog(null, "number of wheels you own: "+(carsint*4));
		}
	}

	void skill5() { // In a pop-up, ask the user for the name of their school
		String school = JOptionPane.showInputDialog("what school do you go to?");
		// In another pop-up, tell the user, that their school is a fantastic school. //
		// You must include the name of the school in the message.
		JOptionPane.showMessageDialog(null, school+" is a fantastic school.");
	}

}
