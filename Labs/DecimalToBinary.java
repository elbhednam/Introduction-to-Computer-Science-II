import java.util.*;

public class DecimalToBinary {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = input.nextInt();
		
		System.out.println(decToBin(n));
	}
	
	public static String decToBin(int n) {
		
		if (n == 0)
			return "";
		
		else
			return decToBin(n / 2) + n % 2;
	}
}
