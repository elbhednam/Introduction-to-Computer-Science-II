/** 
 * @author Amanda Bakalarczyk
 * COSC 1047
 * Exercise 11.16
 * Addition quiz with array list
 * 2017-02-17
 */
import java.util.Scanner;
import java.util.*;

public class AdditionQuiz {
	public static void main(String[] args) {
		
		// generate random numbers for quiz
		int n1 = (int)(Math.random() * 10);
		int n2 = (int)(Math.random() * 10);
		
		// create array list to store answers
		ArrayList<Integer> answers = new ArrayList<>();
		
		// create scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is " + n1 + " + " + n2 + " ? ");
		int answer = input.nextInt();
		
		// continue quiz until the answer is correct
		while (n1 + n2 != answer) {
			System.out.print("Wrong answer. Try again. \nWhat is " + n1 + " + " + n2 + " ? ");
			answer = input.nextInt();
			
			if (answers.contains(answer)) { // check for answers already entered
				System.out.println("You already entered " + answer);
			}
			else
				answers.add(answer); // add answers to the array list
			
		}
		// good job
		System.out.println("You got it!");
	}
}
