package oopsConcepts;

public class RBIMethodOverridAndPoly {

	int iRBI = 100;
	String sRBI = "Delhi";

	public RBIMethodOverridAndPoly() {

		System.out.println("Default constructor of RBI");

	}

	public void display() {

		System.out.println("RBI ID is" + iRBI);
		System.out.println("RBI branch is " + sRBI);

	}

	public void override(int i) {
		System.out.println("Execution from parent class");
	}

}
