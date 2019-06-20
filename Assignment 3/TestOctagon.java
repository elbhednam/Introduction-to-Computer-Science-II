/** 
 * @author Amanda Bakalarczyk
 * COSC 1047
 * Exercise 13.5
 * Test program for cloning an Octagon
 * 2017-02-28
 */
public class TestOctagon {
	public static void main(String[] args) {
		
		try {
			Octagon o1 = new Octagon(); // create octagon with side value 5
			System.out.println("o1 area: " + o1.getArea()); // display area
			System.out.println("o1 perimeter: " + o1.getPerimeter()); // display perimeter
			
			// make a clone and compare it to the original
			Octagon o2 = (Octagon)o1.clone(); 
			System.out.println("Compare o1 and o2: " + o1.compareTo(o2));
		}
		
		// catch and handle exception
		catch (CloneNotSupportedException ex) {
			System.out.println(ex);
		}
	}
}
