/** 
 * @author Amanda Bakalarczyk
 * COSC 1047
 * Exercise 18.13
 * Find the largest number in an array using a recursive method
 * 2017-03-07
 */
import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		
		//prompt user for array size
		Scanner input = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int size = input.nextInt();
		
		//create and display array 
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = (int)(Math.random() * 100);
			System.out.print(array[i] + " ");
		}
		// display largest element in array
		System.out.println();
		System.out.println("The largest number is " + findLargest(array));
	}//
	
	// recursive method
	public static int findLargest(int[] list) {
		return findLargest(list, 0, list.length - 1);
	}
	
	// recursive helper method
	private static int findLargest(int[] list, int low, int high) {
		// base case
		if (low == high) {
			return list[low];
		}
		// compare low and high indices, make appropriate recursive call
		else if (list[low] > list[high] || list[low] == list[high]) {
			return findLargest(list, low, high - 1);
		}
		else
			return findLargest(list, low + 1, high);
	}
}//