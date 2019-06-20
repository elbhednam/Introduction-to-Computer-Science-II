/** 
 * @author Amanda Bakalarczyk
 * COSC 1047
 * Exercise 13.5
 * Rectangle class that extends GeometricObject and implements its abstract methods
 * 2017-02-28
 */
public class Rectangle extends GeometricObject {
	// data fields
	private double width;
	private double height;
	
	// constructors
	public Rectangle() {
		
	}
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	// methods
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	// Implement methods defined in abstract GeometricObject class
	@Override
	public double getArea() {
		return width * height;
	}
	
	@Override
	public double getPerimeter() {
		return 2 * (width + height);
	}
	
	// override toString method
	@Override
	public String toString() {
		return "The rectangle is created " + getDateCreated() + " with width " + width + " and height " + height;
	}
	
	// Implement compareTo method defined in Comparable interface
	@Override
	public int compareTo(GeometricObject r) {
		if (getArea() > r.getArea()) {
			return 1;
		}
		
		else if (getArea() < r.getArea()) {
			return -1;
		}
		
		else
			return 0;
	}
}