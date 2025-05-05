package exceptionHandling;

public class NumberFormatException {

	public static void numberFormatExc() {
		String price = "100.50";

		try {
			int iPrice = Integer.parseInt(price);
			System.out.println("Int Price is " + iPrice);

		} catch (Exception e) {
			System.out.println("Exception Handled!!!");
		}

	}

	public static void main(String[] args) {
		numberFormatExc();

	}

}
