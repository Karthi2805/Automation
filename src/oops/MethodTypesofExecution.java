package oops;

public class MethodTypesofExecution {

	public void login() { // Method without Parameter

		String userName = "Karthikeyan";
		String password = "Password@123";
		System.out.println("User name is " + userName);
		System.out.println("Password is " + password);
	}

	public void teamSharePointLogin(String uName, String password) { // Method with Parameter
		System.out.println("User name given is " + uName);
		System.out.println("Passowrd given is " + password);

	}

	public int bookMovieTicket(String nameofTicketHolder) { //Method with return type
		System.out.println("Tciket booked person name is " + nameofTicketHolder);
		int iTicketno = 333;
		return iTicketno;

	}

	public void orderFood(int food) {

		System.out.println("Food order for the ticket no is " + food);

	}

	public static void main(String[] args) {

		MethodTypesofExecution m = new MethodTypesofExecution();
		m.login();
		m.teamSharePointLogin("Karthikeyan", "Password777");
		int t = m.bookMovieTicket("LK");
		m.orderFood(t);

	}

}
