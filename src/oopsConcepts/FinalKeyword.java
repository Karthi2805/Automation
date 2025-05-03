package oopsConcepts;

public class FinalKeyword {

	/*
	 * Final keyword can be declared with variable, method & class. 
	 * When we declare a variable as a final, then we should define that value & that value will not be change further. 
	 * When we declare method as a final, then it will allow us to overload but not to override that method. 
	 * When we declara class as a final, then we can't derive/extend that class.
	 */

	public final int iValue = 100;

	public void localVariable() {

		final int i = 10;

	}

	public static void main(String[] args) {

	}

}
