package exceptionHandling;

public class TryCatch {

	public static void singleTryCatch() {

		int a[] = { 10, 20, 30, 40, 50 };
		try {
			System.out.println(a[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception getting catched!!!");
		}

		System.out.println(a[4]);

	}
	
	public static void singleTryWithDiffCatch() {

		int a[] = { 10, 20, 30, 40, 50 };
		try {
			System.out.println(a[5]);
		} catch (ArithmeticException e) {
			System.out.println("Exception getting catched!!!");
		}

		System.out.println(a[4]);

	}
	
	public static void singleTryWithMultipleCatch() {

		int a[] = { 10, 20, 30, 40, 50 };
		try {
			System.out.println(a[5]);
		} catch (ArithmeticException e) {
			System.out.println("Exception getting catched in Arithmatic!!!");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception getting catched!!!");
		}

		System.out.println(a[4]);

	}

	public static void main(String[] args) {
		//singleTryCatch();
		//singleTryWithDiffCatch();
		singleTryWithMultipleCatch();

	}

}
