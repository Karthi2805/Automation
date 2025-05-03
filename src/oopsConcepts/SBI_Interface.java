package oopsConcepts;

public class SBI_Interface implements RBI_Interface {

	@Override
	public double homeLoanPercentage() {
		return 6.7;
	}

	@Override
	public double carLoanPercentage() {
		return 7.1;
	}

	@Override
	public double personalLoanPercentage() {
		return 8.8;
	}

	@Override
	public double creditCardLoan() {
		return 7.3;
	}

	@Override
	public double goldLoan() {
		return 6.5;
	}
	
	public void dummy () {
	System.out.println("This is child dummy method");
	}
	
	public static void main(String[] args) {
		
		SBI_Interface obj = new SBI_Interface();

		System.out.println("Home Loan Percentage is " + obj.homeLoanPercentage());
		System.out.println("Car Loan is Percentage " + obj.carLoanPercentage());
		System.out.println("Personnal loan Percentage is " + obj.personalLoanPercentage());
		System.out.println("Credit card loan percentage is " + obj.creditCardLoan());
		System.out.println("Gold loan percntage is " + obj.goldLoan());
		obj.dummy();
		
		System.out.println("********************************************************");
		
		RBI_Interface objR = new SBI_Interface();
		
		System.out.println("Home Loan Percentage is " + objR.homeLoanPercentage());
		System.out.println("Car Loan is Percentage " + objR.carLoanPercentage());
		System.out.println("Personnal loan Percentage is " + objR.personalLoanPercentage());
		System.out.println("Credit card loan percentage is " + objR.creditCardLoan());
		System.out.println("Gold loan percntage is " + objR.goldLoan());
		objR.dummy();


	}


}
