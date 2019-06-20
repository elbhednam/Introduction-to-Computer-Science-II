/** 
 * @author Amanda Bakalarczyk
 * COSC 1047
 * Exercise 12.4
 * Loan test program
 * 2017-02-17
 */
public class TestLoan {
	public static void main(String[] args) throws Exception {
		
		// make some loan objects and print the monthly and total payments
		try {
			Loan l1 = new Loan();
			System.out.println("Loan l1 monthly payment: " + l1.getMonthlyPayment());
			System.out.println("Loan l1 total payment: " + l1.getTotalPayment());
			
			Loan l2 = new Loan(3.0, 5, 5000);
			System.out.println("Loan l2 monthly payment: " + l2.getMonthlyPayment());
			System.out.println("Loan l2 total payment: " + l2.getTotalPayment());
			
			Loan l3 = new Loan(0.025, 7, 1000);
			System.out.println("Loan l3 monthly payment: " + l3.getMonthlyPayment());
			System.out.println("Loan l3 total payment: " + l3.getTotalPayment());
		}
		// catch and handle exceptions
		catch (Exception x) {
			System.out.println(x);
		}
	}
}
