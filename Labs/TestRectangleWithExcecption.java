public class TestRectangleWithExcecption {
	public static void main(String[] args) {
		
		try {
			Rectangle r1 = new Rectangle(5,2);
			
			Rectangle r2 = new Rectangle(5,-2);
			
			Rectangle r3 = new Rectangle(3,7);
			
			
			System.out.println("Area of r1: " + r1.getArea());
			System.out.println("Area of r2: " + r2.getArea());
			System.out.println("Area of r3: " + r3.getArea());
		}
		
		catch (InvalidSpecificationException x) {
			System.out.println(x);
		}
	}
}
