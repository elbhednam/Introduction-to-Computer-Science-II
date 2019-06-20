/** 
 * @author Amanda Bakalarczyk
 * COSC 1047
 * Exercise 12.25
 * Process large dataset
 * 2017-02-17
 */
import java.net.URL;
import java.util.*;

public class ProcessLargeDataset { 
	public static void main(String[] args) throws Exception { 
		// make a URL and read it
		URL url = new URL("http://cs.armstrong.edu/liang/data/Salary.txt");
        Scanner input = new Scanner(url.openStream());
        
        // make some array lists for different faculty ranks
        ArrayList<Double> assistant = new ArrayList<>();
        ArrayList<Double> associate = new ArrayList<>();
        ArrayList<Double> full = new ArrayList<>();
        ArrayList<Double> allFaculty = new ArrayList<>();
        
        // while there are things to read...
        while (input.hasNext()) {
        	String s = input.nextLine(); // read a line
        	String[] line = s.split(" "); // split it
        	if (line[2].matches(".*assistant.*")) { // if 2nd element is 'assistant', add 3rd element to assistant list and allFaculty
                assistant.add(Double.parseDouble(line[3]));
                allFaculty.add(Double.parseDouble(line[3]));
            } else if (line[2].matches(".*associate.*")) { // if 'associate', add to associate list and allFaculty
            	associate.add(Double.parseDouble(line[3]));
            	allFaculty.add(Double.parseDouble(line[3]));
            } else {
            	full.add(Double.parseDouble(line[3])); // if 'full', add to full list and allFaculty
            	allFaculty.add(Double.parseDouble(line[3]));
            }
        }
        // print all the things
        System.out.printf("Assistant total: %.2f \n", sum(assistant));
        System.out.printf("Associate total: %.2f \n", sum(associate));
        System.out.printf("Full total: %.2f \n", sum(full));
        System.out.printf("All faculty total: %.2f \n", sum(allFaculty));
        
        System.out.printf("Assistant average: %.2f \n", average(assistant));
        System.out.printf("Associate average: %.2f \n", average(associate));
        System.out.printf("Full average: %.2f \n", average(full));
        System.out.printf("All faculty average: %.2f \n", average(allFaculty));
        
        input.close();
	} //
	
	// sum an array list
	public static double sum(ArrayList<Double> list) {
		double sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		return sum;
	}
	
	// average an array list
	public static double average(ArrayList<Double> list) {
		return sum(list) / list.size();
	}
} //
