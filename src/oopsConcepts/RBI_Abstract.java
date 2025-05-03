package oopsConcepts;

public abstract class RBI_Abstract {

	public RBI_Abstract() {
		System.out.println("RBI default constructor");
	}

	public double homeLoanPercentage() {
		return 6.7;
	}
	
	public double carLoanPercentage() {
		return 7.2;
	}
	
	public double personalLoanPercentage() {
		return 9.2;
	}
	public abstract double creditCardLoan();
	
	public abstract double goldLoan();

}
