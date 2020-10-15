package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class algorithmsprimeornot {
	public static void main(String[] args) {

		String prime = JOptionPane.showInputDialog("enter a number");
		int primeint = Integer.parseInt(prime);
		for (int i = 2; i < primeint; i++) {
			if (primeint % i == 0) {
				JOptionPane.showInternalMessageDialog(null, "not prime");
				System.exit(0);
			}
			

		}
JOptionPane.showInputDialog("prime");
	}
}