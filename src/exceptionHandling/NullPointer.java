package exceptionHandling;

public class NullPointer {

	public static void main(String[] args) {
		String name = "Karthikeyan";
		System.out.println("Length of the name is :" + name.length());
		
		try {
			name = null;
			System.out.println("Chnage name to lowercase :" + name.toLowerCase());
		} 
		catch (NullPointerException e) {
			System.out.println("Exception Handled!!!");
		}
		

	}

}
