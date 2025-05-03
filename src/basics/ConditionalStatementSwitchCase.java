package basics;

public class ConditionalStatementSwitchCase {

	public static void main(String[] args) {

		/*
		 * Key - Variable going to pass Value - Possible values of the variable Break -
		 * if one case is matched/pass with condition (value), it will execute that case
		 * & won't check the other cases & get come out of your switch case. Preference
		 * - If going to check only single condition/value we can use switch case.
		 */

		String sBrowser = "Chrome";

		switch (sBrowser) {

		case "Edge":
			System.out.println("User Running the Edge Browser ");
			break;
		case "FireFox":
			System.out.println("User Running the FireFox Browser ");
			break;
		case "Chrome":
			System.out.println("User Running the Chrome Browser ");
			break;
		case "IE":
			System.out.println("User Running the IE Browser ");
			break;

		default:
			System.out.println("Invalid input!!! ");
			break;
		}

	}

}
