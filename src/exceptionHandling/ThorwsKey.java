package exceptionHandling;

import java.io.IOException;
import java.util.Scanner;

public class ThorwsKey {

	public static void age(int a) {
		if (a < 18) {
			throw new ArithmeticException("You are not eligible");
			// System.out.println("Not Eligible");
		} else {
			System.out.println("Eligible");
		}
	}
	
	public static void getInputFromUser () throws IOException {
		Scanner oScan = new Scanner(System.in);
		System.out.println("Enter user name :");
		
		String userName = oScan.nextLine();
		System.out.println("User input is : " + userName);
		
		if(userName.contains("Karthi")) {
			throw new IOException("User already logged in");
		}else {
			System.out.println("User is valid");
		}
	}

	public static void main(String[] args) throws IOException {
		try {
			age(17);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		getInputFromUser();

	}

}
