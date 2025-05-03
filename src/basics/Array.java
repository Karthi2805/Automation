package basics;

public class Array {

	public static void main(String[] args) {

		/*
		 * Array is an non-primitive data type which is used to group the same type of
		 * data with one variable name. Array will store the data based on the index. it
		 * will start with 0. Disadvantage/Draw back of array: The size of an array
		 * cannot be increase or decreased during the runtime.
		 * 
		 * 1.One dimensional array 2.Multi dimensional array
		 */
		int iEmpid[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // Size 10 (0-9)

		System.out.println(iEmpid[2]);
		System.out.println("**********************************************");

		for (int i = 0; i < 7; i++) {
			System.out.println(iEmpid[i]);

		}

		System.out.println("********************************************");

		for (int i = 0; i < 7; i++) {
			System.out.print(iEmpid[i] + ",");

		}

		for (int i = 0; i < iEmpid.length; i++) {
			System.out.print(iEmpid[i] + ",");
		}

		System.out.println(" ");

		String[] sName = { "AA", "BB", "CC", "DD", "EE" };
		for (String empName : sName) {
			System.out.println(empName);

		}
 
	}

}
