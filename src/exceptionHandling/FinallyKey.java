package exceptionHandling;

public class FinallyKey {

	public static void singleTryCatch() {

		int a[] = { 10, 20, 30, 40, 50 };
		try {
			System.out.println(a[5]);
		} //{catch (ArrayIndexOutOfBoundsException e) 
			//System.out.println("Exception getting catched!!!");}
		finally {
			System.out.println("Flianlly block executed");
		}

		System.out.println(a[4]);

	}

	public static void main(String[] args) {
		singleTryCatch();

	}

}
