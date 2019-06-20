/** 
 * @author Amanda Bakalarczyk
 * COSC 1047
 * Exercise 12.24
 * Create a data file with 1000 lines
 * 2017-02-17
 */
import java.io.*;

public class CreateLargeDataset {
	public static void main(String[] args) throws Exception {
		
		// do I even need this part?
		java.io.File salary = new java.io.File("salary.txt");
		if (salary.exists()) {
			System.out.println("File already exists");
			System.exit(0);
		}
		// create file
		java.io.PrintWriter output = new java.io.PrintWriter("salary.txt");
		
		// randomly generate 1000 entries for rank + salary and print to file
		for (int i = 0; i < 1000; i++) {
			output.print("FirstName" + i + " LastName" + i + " ");
			// randomly generate rank
			int rank = (int)(Math.random() * 3);
			
			if (rank == 0) {
				double pay = Math.random() * 30000 + 50000;
				output.printf("assistant %.2f", pay);
				output.println();
			}
			
			else if (rank == 1) {
				double pay = Math.random() * 50000 + 60000;
				output.printf("associate %.2f", pay);
				output.println();
			}
			
			else {
				double pay = Math.random() * 55000 + 75000;
				output.printf("full %.2f", pay);
				output.println();
			}
		}
		// close the file
		output.close();
	}
}
