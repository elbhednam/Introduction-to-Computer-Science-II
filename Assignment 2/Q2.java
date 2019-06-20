/** 
 * @author Amanda Bakalarczyk
 * COSC 1047
 * Question 2
 * ask a string and a file name then removes all the occurrences of that string from the text file. 
 * 2017-02-17
 */
import java.util.*;
import java.io.*;
public class Q2 {
	public static void main(String[] args) throws Exception {
		
		// get user input for string and file name
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		System.out.print("Enter the file name: ");
		String filename = input.nextLine();
		
		// make some files
		File file = new File(filename);
		File newFile = new File("NewFile.txt");
		
		// file writer and file reader
		PrintWriter pw = new PrintWriter(newFile);
		Scanner scanner = new Scanner(file);
		
			// while there are things to be read, read them and replace any instances of the specified string
			while (scanner.hasNext()) {
				String s1 = scanner.nextLine();
				System.out.println(s1);
				String s2 = s1.replaceAll(s, "");
				pw.println(s2); // print the new string to the new file
			}
			// rename the new file to the old file name and close the scanner and printwriter
		newFile.renameTo(file);
		scanner.close();
		pw.close();
		
		
		
	}
}

