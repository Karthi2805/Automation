package oops;

/* Static - it's mainly used for memory management. We can use static when the value is not frequently change.
 * Static variable will not impacted the object
 * Static keyword can be used with Variables, Method & a block.
 * Static members will get memory allocated when class file is loaded for an execution in the class memory.
 * Non static members (variables & methods) can access both static members & non static members,
 * where as Static members can only access the static members when it required to access non static members we need an object.
 * Static method can be overloaded, but it can't be overridden
 * Static keyword can't be used with an abstract with keyword.
 */
public class StaticEx {

	int empId;
	String empName;
	static String designation = "QA Engineer";
	static int ipage=0; //We can use static when the value is not frequently change

	public StaticEx(int e, String eN) {
		empId = e;
		empName = eN;
		ipage++;
	}

	public void print() {
		System.out.println("Employee ID is " + empId);
		System.out.println("Employee name is " + empName);
		System.out.println("Employee designation is " + designation);
		System.out.println("iPage value is " + ipage);
		//sample();

	}

	public static void sample() { // Static method
		System.out.println("This is a Static method");

	}

	public static void main(String[] args) {
		StaticEx obj1 = new StaticEx(100, "Karthi");
		obj1.print();

		StaticEx obj2 = new StaticEx(101, "Aravinth");
		obj2.print();

		StaticEx obj3 = new StaticEx(103, "Balaji");
		obj3.print();
		sample();
		

	}

}
