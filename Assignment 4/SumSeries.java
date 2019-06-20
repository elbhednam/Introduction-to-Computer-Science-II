/** 
 * @author Amanda Bakalarczyk
 * COSC 1047
 * Exercise 18.5
 * Recursive method to compute the series i/(2i + 1)
 * 2017-03-07
 */
public class SumSeries {
	public static void main(String[] args) {
		
		// display m(i) for i = 1 ... 10
		for (int i = 1; i <= 10; i++) {
			System.out.println(m(i));
		}
	}//
	
	public static double m(int i) {
		// base case
		if (i == 1) {
			return 1.0 / 3;
		}
		
		// recursive call
		else
			return m(i - 1) + i * 1.0 / (2 * i + 1);
	}
}//