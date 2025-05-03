package oops;

/*
 1. Overloading can only be achieved within the class, when we have same method name with different number of arguments or types of arguments is known as method overloading.
 
 */

public class MethodOverloading {

	public void sum() {
		int a = 10, b = 20;
		int c = a + b;
		System.out.println("Sum value is " + c);

	}

	public void sum(int a, int b) {
		int c;
		c = a + b;
		System.out.println(c);

	}

	public void sum(double a, int b) {
		System.out.println(a + b);

	}

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.sum(10, 15);
		obj.sum(11.5, 10);
		obj.sum();

	}

}
