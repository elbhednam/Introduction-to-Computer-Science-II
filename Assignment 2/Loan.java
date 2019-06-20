/** 
 * @author Amanda Bakalarczyk
 * COSC 1047
 * Exercise 12.4
 * Loan class with IllegalArgumentException
 * 2017-02-17
 */
public class Loan {
	// data fields
	private double annualInterestRate = 0;
	private int numberOfYears = 0;
	private double loanAmount = 0;
	private java.util.Date loanDate;
	
	// default constructor
	public Loan() {
		this(2.5, 1, 1000); // invoke the overloaded constructor
	}
	
	// overloaded constructor
	public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
		setAnnualInterestRate(annualInterestRate);
		setNumberOfYears(numberOfYears);
		setLoanAmount(loanAmount);
		loanDate = new java.util.Date();
	}
	/** getter and setter methods */
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	// throws exception if interest rate less than 5%
	public void setAnnualInterestRate(double annualInterestRate) throws IllegalArgumentException {
		if (annualInterestRate >= 0.05) {
			this.annualInterestRate = annualInterestRate;
		}
		else
			throw new IllegalArgumentException("Interest rate cannot be less than 5%.");
	}
	
	public int getNumberOfYears() {
		return numberOfYears;
	}
	// throws exception if years zero or less
	public void setNumberOfYears(int numberOfYears) throws IllegalArgumentException {
		if (numberOfYears > 0) {
			this.numberOfYears = numberOfYears;
		}
		else
			throw new IllegalArgumentException("Number of years must be greater than zero.");
	}
	
	public double getLoanAmount() {
		return loanAmount;
	}
	// throws exception if loan amount less than 10
	public void setLoanAmount(double loanAmount) throws IllegalArgumentException {
		if (loanAmount >= 10) {
			this.loanAmount = loanAmount;
		}
		else
			throw new IllegalArgumentException("Loan amount cannot less than 10.0.");
	}
	
	public double getMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
		return monthlyPayment;
	}
	
	public double getTotalPayment() {
		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;
	}
	
	public java.util.Date getLoanDate() {
		return loanDate;
	}
}
