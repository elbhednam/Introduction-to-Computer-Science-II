/** 
 * @author Amanda Bakalarczyk
 * COSC 1047
 * Exercise 13.5
 * Circle class that extends GeometricObject and implements its abstract methods
 * 2017-02-28
 */
public class Circle extends GeometricObject {
	// data field
	private double radius;
	
	// constructors
	public Circle() {
		
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	// methods
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getDiameter() {
		return 2 * radius;
	}
	
	// Implement methods defined in abstract GeometricObject class
	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	@Override
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	
	// override toString method
	@Override
	public String toString() {
		return "The circle is created " + getDateCreated() + " and the radius is " + radius;
	}
	
	// Implement compareTo method defined in Comparable interface
	@Override
	public int compareTo(GeometricObject c) {
		if (getArea() > c.getArea()) {
			return 1;
		}
		
		else if (getArea() < c.getArea()) {
			return -1;
		}
		
		else
			return 0;
	}
}
