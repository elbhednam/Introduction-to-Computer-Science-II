/** 
 * @author Amanda Bakalarczyk
 * COSC 1047
 * Exercise 12.13
 * Count characters, words, and lines in a file
 * 2017-02-17
 */
import java.io.*;
import java.util.*;
import java.net.*;
public class CountFile {
	public static void main(String[] args) throws Exception {
		
		int chars = 0;
        int words = 0;
        int lines = 0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a file name or URL: ");
        String str = scanner.nextLine();
      
        if (str.contains("http://") || str.contains("https://")) {
        	try { 
    			URL url = new URL(str);
    			Scanner input = new Scanner(url.openStream());
    			do {
    				String s = input.nextLine();
    				lines++;
    				chars += s.length();
    				String[] word = s.split(" ");
    				words += word.length;
    			}
    			while (input.hasNext());
    			
    			input.close();
    		}
    		
    		catch (java.io.IOException ex) {
    			System.out.println("Invalid");
    		}
        }
       
        else {
        	try (Scanner input = new Scanner(str);) {
    			do {
    				String s = input.nextLine();
    				lines++;
    				chars += s.length();
    				String[] word = s.split(" ");
    				words += word.length;
    				
    			}
    			while (input.hasNext());
    		}
        }
       
		 System.out.println("Characters: " + chars);
	     System.out.println("Words: " + words);
	     System.out.println("Lines: " + lines);
	     
	}
}
