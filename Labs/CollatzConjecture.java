import java.util.*;

public class CollatzConjecture {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = input.nextInt();
		System.out.println(collatz(n));
	}
	
	public static String collatz(int n) {
		
		if (n == 1) 
			return 1 + " ";
		
		else if (n % 2 == 0) 
			return n + " " + collatz(n / 2);
		
		else 
			return  n + " " + collatz(n * 3 + 1);
	}
}
