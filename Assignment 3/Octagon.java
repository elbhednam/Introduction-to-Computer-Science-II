/** 
 * @author Amanda Bakalarczyk
 * COSC 1047
 * Exercise 13.5
 * Octagon class that extends GeometricObject, 
 * implements its abstract methods, 
 * and also implements the Cloneable interface.
 * 2017-02-28
 */
public class Octagon extends GeometricObject implements Cloneable {
	// data field
	private double side;
	
	// constructors
	public Octagon() {
		this(5);
	}
	
	public Octagon(double side) {
		this.side = side;
	}
	
	// methods
	public double getSide() {
		return side;
	}
	
	public void setSide(double side) {
		this.side = side;
	}
	
	// override protected clone method and strengthen its accessibility
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	// Implement methods defined in abstract GeometricObject class
	@Override
	public double getArea() {
		return(2 + (4 / Math.sqrt(2))) * side * side;
	}
	
	@Override
	public double getPerimeter() {
		return side * 8;
	}
	
	// Implement compareTo method defined in Comparable interface
	@Override
	public int compareTo(GeometricObject o) {
		if (getArea() > o.getArea()) {
			return 1;
		}
		
		else if (getArea() < o.getArea()) {
			return -1;
		}
		
		else
			return 0;
	}
}
