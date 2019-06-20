/** 
 * @author Amanda Bakalarczyk
 * COSC 1047
 * Exercise 13.5
 * Test program to demonstrate max method
 * 2017-02-28
 */
import java.util.Scanner;
public class TestComparableGeometricObject {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// take user input for circle radius 
		System.out.print("Enter the radius of circle one: ");
		double circle1 = input.nextDouble();
		System.out.print("Enter the radius of circle two: ");
		double circle2 = input.nextDouble();
		
		// create two circles
		GeometricObject c1 = new Circle(circle1);
		GeometricObject c2 = new Circle(circle2);
		
		// take user input for rectangle width and height
		System.out.print("Enter the width and height of rectangle one: ");
		double r1w = input.nextDouble();
		double r1h = input.nextDouble();
		System.out.print("Enter the width and height of rectangle two: ");
		double r2w = input.nextDouble();
		double r2h = input.nextDouble();
		
		// create two rectangles
		GeometricObject r1 = new Rectangle(r1w, r1h);
		GeometricObject r2 = new Rectangle(r2w, r2h);
		
		// display the max of two circles followed by two rectangles
		System.out.println("c1 area: " + c1.getArea() + "\nc2 area: " + c2.getArea() + "\nThe circle with area " + Circle.max(c1, c2) + " is larger.");
		System.out.println();
		System.out.println("r1 area: " + r1.getArea() + "\nr2 area: " + r2.getArea() + "\nThe rectangle with area " + Rectangle.max(r1, r2) + " is larger.");
	}
	
}
