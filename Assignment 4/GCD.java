/** 
 * @author Amanda Bakalarczyk
 * COSC 1047
 * Exercise 18.3
 * Compute greatest common divisor using recursion
 * 2017-03-07
 */
import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// user input for two integers to be checked for GCD
		System.out.print("Enter first integer: ");
		int n1 = input.nextInt();
		System.out.print("Enter second integer: ");
		int n2 = input.nextInt();
		
		// display GCD
		System.out.println("The greatest common divisor of " + n1 + " and " + n2 + " is " + gcd(n1, n2));
	}//
	
	public static int gcd(int m, int n) {
		
		// base case
		if (m % n == 0) {
			return n;
		}
		else
			// recursive call
			return gcd(n, m % n);
	}
}//
