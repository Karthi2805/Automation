package oopsConcepts;

public class StringMethods {

	public static void main(String[] args) {

		String s1 = "Karthi";
		String s2 = "Balaji";
		String s3 = "Mathi";
		String s4 = "Karthi";
		String s5 = "KARTHI";

		System.out.println("Equals method " + s1.equals(s2)); // Case senetive method
		System.out.println("Equals method " + s1.equals(s4)); // Equals method is used to comapare the value
		System.out.println("Equals method " + s1.equals(s5));

		System.out.println("Equals ignore case " + s1.equalsIgnoreCase(s5));
		System.out.println("******************************************");

		System.out.println("Equal operator " + (s1 == s4)); // Equals operator is used to comapare the value of the
															// refrence (memory).
		System.out.println("Equal operator " + (s1 == s2));

		System.out.println("Compare to " + s1.compareTo(s4));
		System.out.println("Compare to " + s1.compareTo(s5));
		System.out.println("Comapare with iqnore case " + s1.compareToIgnoreCase(s5));

		System.out.println("Length of the string is " + s1.length());// Length includes the space as well for the count
																		// in the string.

		System.out.println("To lower case " + s2.toLowerCase());
		System.out.println("To upper case " + s4.toUpperCase());
		System.out.println(s4); // String is immutable class
		s4 = s4.toUpperCase(); // String buffer or String builder is muteable
		System.out.println(s4);

	}

}
