/** 
 * @author Amanda Bakalarczyk
 * COSC 1047
 * Exercise 18.16
 * Find the number of uppercase letters in an array of characters
 * 2017-03-07
 */
import java.util.Scanner;

public class UppercaseLetters {
	public static void main(String[] args) {
		
		// user input for characters
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string of characters: ");
		String s = input.nextLine();
		char[] chars = s.toCharArray();
		
		// display uppercase characters
		System.out.println("There are " + count(chars) + " uppercase characters.");
	}//
	
	// recursive method
	public static int count(char[] chars) {
		return count(chars, chars.length - 1);
	}
	
	// recursive helper method
	public static int count(char[] chars, int high) {
		// base case
		if (high < 0) { 
			return 0;
		}
		else
			// recursive call
			return count(chars, high - 1) + (chars[high] >= 65 && chars[high] <= 90 ? 1 : 0);
	}
}//