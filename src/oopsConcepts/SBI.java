package oopsConcepts;

public class SBI extends RBI {

	int iSBI = 200;
	String sSBI = "Chennai";

	public SBI() { //Super(); -method will invoke by default. Thats why initially it's printing parent class constructor results.

		System.out.println("Default constructor of SBI");

	} 

	public void print() {

		System.out.println("SBI ID is " + iSBI);
		System.out.println("SBI branch is " + sSBI);

	}

	public static void main(String[] args) {
		SBI obj = new SBI();
		obj.print();
		obj.display();

	}

}
