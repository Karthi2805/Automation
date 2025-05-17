package oops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Constructor {

	/*
	 * Constructor is a specialize method which is used to initialize a global variable & method
	 */
	int i = 1000;
	String s = "LK";

	public Constructor() {
		System.out.println("This is constructor");
	}

	public Constructor(int i) {
		System.out.println("Paramtrize costructor");
		System.out.println(i);

	}

	public void print() {
		System.out.println("Roll no is " + i);
		System.out.println("Name is " + s);

	}

	public static void main(String[] args) {

		Constructor obj = new Constructor(); // Constructor call
		Constructor obj1 = new Constructor(333);
		obj.print();
		obj1.print();

	}

}
