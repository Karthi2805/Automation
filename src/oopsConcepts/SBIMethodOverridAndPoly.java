package oopsConcepts;

public class SBIMethodOverridAndPoly extends RBIMethodOverridAndPoly {

	int iSBI = 200;
	String sSBI = "Chennai";

	public SBIMethodOverridAndPoly() { // Super(); -method will invoke by default. Thats why initially it's printing parent class constructor results;
										
		System.out.println("Default constructor of SBI");

	}

	public void print() {

		System.out.println("SBI ID is " + iSBI);
		System.out.println("SBI branch is " + sSBI);

	}

	public void override() {
		System.out.println("Execution from Child class");

	}

	public static void main(String[] args) {
		SBIMethodOverridAndPoly obj = new SBIMethodOverridAndPoly();
		obj.print();
		obj.display();
		obj.override(200); // parent class
		obj.override();// Child class
		System.out.println("************************************************");
		RBIMethodOverridAndPoly obj1 = new SBIMethodOverridAndPoly();
		obj1.override(100);

	}

}
