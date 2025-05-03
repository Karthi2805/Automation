package basics;

public class Operators {

	public static void main(String[] args) {
		/*
		 1.Arithmetic operators (+, -, *, /, % - Mod)
		 2.Unary operators (++, --)
		 3.Assignment operator (=, +=, *=, -=, /=, %=)
		 4.Comparison operator (==, >, <, >=, <=, !=) -> Output of comparison operator will be boolean.
		 5.Logical operator (Boolean) --> && (AND), || (OR), ! (NOT)
		 */
		
		int a=10, b=3, c=20, d=25;

		
		System.out.println("Plus value of " + (a+b));
		System.out.println("Minus Value is " + (a-b));
		System.out.println("Multiply value is " + (a*b));
		System.out.println("Divide by value is " + (a/b));
		System.out.println("Modular value is " + (a%b));
		
		System.out.println("Initail value is " + a++); //Post increment
		System.out.println("New Value after Post increment is " + a);
		System.out.println("Pre Incremnt value is " + ++b); //Pre Increment
		
		System.out.println("Initial value C is " + c--); //Post decrement
		System.out.println("After decrement is " + c);
		System.out.println("Pre Decremnt value is " + --d); // Pre decrment
		
		int i = 10;
		i+=10;
		System.out.println("Value of i is " + i);
		i-=5;
		System.out.println("Sub va,ue of i is "+ i);
		i*=2;
		System.out.println("Multiply value of i is " + i);
		i%=5;
		System.out.println("Modular value of i is "+ i);
		
		

	}

}
