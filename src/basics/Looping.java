package basics;

public class Looping {

	public static void main(String[] args) {

		/*
		 * for loop, while, do-while, for each, 2 Statement used in looping - break,
		 * continue for (Initialization/declaration; condition; Unary operator
		 * increment/decrement)
		 */
		// Simple for loop
		for (int i = 5; i <= 10; i++) {
			System.out.println("Simple for loop execution ");

		}
		// Loop with conditional statement
		for (int iRollno = 1; iRollno <= 30; iRollno++) {
			System.out.println("Morning pratcial exam batch");
		}
		// Loop with conditional statement & break
		for (int a = 10; a <= 20; a++) {

			if (a == 15) {
				System.out.println("A value is reached 15");
				break;
				// continue; //Continue -> once condition reaches, it won't go for the next
				// line. again it go back to the loop iteration.
			}
			System.out.println("Printing A values");

		}
		// While loop - Only condition satisfied, it will go in to the next line in block
		int x = 0;
		while (x < 10) {
			System.out.println("Print X value");
			x++;

		}

		// Do while - 1st time directly execute the block without verify the
		// condition.From 2nd time works same as an while loop.

		int a = 10;
		do {

			System.out.println("Do while statement execute");

		} while (a < 10);

	}

}
