/** 
 * @author Amanda Bakalarczyk
 * COSC 1047
 * Exercise 18.11
 * Sum the digits in an integer using recursion
 * 2017-03-07
 */
import java.util.Scanner;

public class SumIntegerDigits {
	public static void main(String[] args) {
		
		// user input for n
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int n = input.nextInt();
		
		// display the sum of digits in n
		System.out.println(sumDigits(n));
	}//
	
	public static int sumDigits(long n) {
		int sum = 0;
		
		// base case
		if (n == 0) {
			return sum;
		}
		else { // recursive call
			sum = (int)(n % 10 + sumDigits(n / 10));
		    return sum;
		}
	}
}//
