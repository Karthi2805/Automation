package oopsConcepts;

public class SBI_Abstract extends RBI_Abstract {

	public SBI_Abstract() {
		System.out.println("SBI default constructor");
	}

	public double creditCardLoan() {
		return 4.5;

	}

	public double goldLoan() {
		return 7.8;

	}

	public static void main(String[] args) {

		SBI_Abstract obj = new SBI_Abstract();

		System.out.println("Home Loan Percentage is " + obj.homeLoanPercentage());
		System.out.println("Car Loan is Percentage " + obj.carLoanPercentage());
		System.out.println("Personnal loan Percentage is " + obj.personalLoanPercentage());
		System.out.println("Credit card loan percentage is " + obj.creditCardLoan());
		System.out.println("Gold loan percntage is " + obj.goldLoan());
		
		System.out.println("******************************************************************");
		
		RBI_Abstract objR = new SBI_Abstract();
		
		System.out.println("Home Loan Percentage is " + objR.homeLoanPercentage());
		System.out.println("Car Loan is Percentage " + objR.carLoanPercentage());
		System.out.println("Personnal loan Percentage is " + objR.personalLoanPercentage());
		System.out.println("Credit card loan percentage is " + objR.creditCardLoan());
		System.out.println("Gold loan percntage is " + objR.goldLoan());
		

	}

}
