package _01_algorithms._2_fibonacci;

import javax.swing.JOptionPane;

public class fibonacci {
public static void main(String[] args) {
	int number1=0;
	int number2=1;

	System.out.println(number1 +","+ number2);
	for (int i = 0; i < 9; i++) {
		int sum=number1+number2;
		System.out.println(sum);
	}
}
}
