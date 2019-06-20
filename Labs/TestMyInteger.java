
public class TestMyInteger {
	public static void main(String[] args) {
		
		MyInteger myInt1 = new MyInteger(4);
		MyInteger myInt2 = new MyInteger(5);
		
		System.out.println("myInt1 is odd: " + myInt1.isOdd());
		System.out.println("myInt2 is even: " + myInt2.isEven());
		System.out.println("myInt1 is even: " + myInt1.isEven());
		System.out.println("myInt2 is odd: " + myInt2.isOdd());
	}
}
