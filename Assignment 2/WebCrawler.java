/** 
 * @author Amanda Bakalarczyk
 * COSC 1047
 * Listing 12.18
 * web crawler with some additions
 * 2017-02-17
 */
import java.util.*;
import java.net.*;
public class WebCrawler {
	public static void main(String[] args) {
		// input a url and call the crawler method
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a URL: ");
		String url = input.nextLine();
		crawler(url);
	}
	
	public static void crawler(String startingURL) {
		ArrayList<String> pendingList = new ArrayList<>(); // list of pending URLs
		ArrayList<String> traversedList = new ArrayList<>(); // list of traversed URLs
		
		pendingList.add(startingURL); // add a starting URL

		while (!pendingList.isEmpty() && traversedList.size() <= 100) {
			String urlString = pendingList.remove(0); // remove URL from list of pending
			if (!traversedList.contains(urlString)) { // if URL not in traversed list, add it
				traversedList.add(urlString);
				System.out.println("Crawl " + urlString);
				
				// for each URL contained in the page, add to pending list if it's not in the traversed list
				for (String s: getSubURLs(urlString)) {
					if (!traversedList.contains(s)) {
						pendingList.add(s);
					}
				}
			}
		}
		// compare list elements to find number of unique URLs
		for (int i = 0; i < traversedList.size() - 1; i++) {
			for (int j = i + 1; j < traversedList.size(); j++) {
				if (traversedList.get(i) == traversedList.get(j)) {
					traversedList.remove(j);
					
				}
			}
		}
		System.out.println("Unique URLs visited: " + traversedList.size());
		
	}
	
	public static ArrayList<String> getSubURLs(String urlString) {
		ArrayList<String> list = new ArrayList<>();
		
		try {
			URL url = new URL(urlString);
			Scanner input = new Scanner(url.openStream());
			int current = 0;
			int lines = 0;
			int words = 0;
			// while there are things to be read
			while (input.hasNext()) {
				String line = input.nextLine(); // read a line
				lines++; // increase line count
				String[] word = line.split(" "); // split the line into an array of strings delimited by a space
				words += word.length; // increase word count
				current = line.indexOf("http:", current); // search for a URL
				while (current > 0) {
					int endIndex = line.indexOf("\"", current); // URL ends with "
					if (endIndex > 0) { // ensure that a correct URL is found
						list.add(line.substring(current, endIndex)); // extract a URL
						current = line.indexOf("http:", endIndex); // search for next URL
					}
					else
						current = -1;
				}
			}
			// show the number of lines and words for each URL
			System.out.println("lines: " + lines);
			System.out.println("words: " + words);
		}
		catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}
		
		return list;
	}
}
