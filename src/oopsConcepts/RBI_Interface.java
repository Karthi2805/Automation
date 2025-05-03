package oopsConcepts;

public interface RBI_Interface {

	int iRollNo = 100;
	
	public double homeLoanPercentage(); 
	
	public double carLoanPercentage(); 
	
	public double personalLoanPercentage(); 
	
	public abstract double creditCardLoan();
	
	public abstract double goldLoan();
	
	public default  void dummy () {
		
		System.out.println("This is dummy method with default keyword");
	}

}



