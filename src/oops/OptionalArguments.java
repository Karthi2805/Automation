package oops;

public class OptionalArguments {

	public void bookTicket(String name, String... Optional) { // Optional argument must be the last argument.
		System.out.println("Ticket is booked for " + name);
		if (Optional.length > 0) {
			for (int i = 0; i < Optional.length; i++) {
				System.out.println(Optional[i]);
			}
		}

	}

	public static void main(String[] args) {
		OptionalArguments obj = new OptionalArguments();
		obj.bookTicket("Karthi");
		obj.bookTicket("Karthi", "Balaji");
		obj.bookTicket("Karthi", "Balaji", "Logesh");

	}

}
