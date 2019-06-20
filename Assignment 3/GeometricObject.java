/** 
 * @author Amanda Bakalarczyk
 * COSC 1047
 * Exercise 13.5
 * GeometricObject class that implements the Comparable interface
 * 2017-02-28
 */
public abstract class GeometricObject implements Comparable<GeometricObject> {
	// data fields
	private String colour = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	// constructors
	protected GeometricObject() {
		dateCreated = new java.util.Date();
	}
	
	protected GeometricObject(String colour, boolean filled) {
		dateCreated = new java.util.Date();
		this.colour = colour;
		this.filled = filled;
	}
	// methods
	public String getColour() {
		return colour;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public boolean isFilled() {
		return filled;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	
	// override toString method
	@Override
	public String toString() {
		return "Created on " + dateCreated + "\nColour: " + colour + "\nFilled: " + filled;
	}
	
	// return the area of the larger of two geometric objects
	public static double max(GeometricObject obj1, GeometricObject obj2) {
		if (obj1.compareTo(obj2) > 0) {
			return obj1.getArea();
		}
		else
			return obj2.getArea();
	}
	
	// define abstract methods to be implemented in subclass
	public abstract double getArea();
	
	public abstract double getPerimeter();
}