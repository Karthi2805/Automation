package basics;

public class TypeCasting {

	public static void main(String[] args) {
		/*
		 1.Widening Casting/Implicit Casting/Non-linear Casting - Converting smaller Data type to larger data type.
		 
		 2.Narrow Casting/Explicit casting/Linear Casting - Converting larger data type to smaller data type	 
		 
		 */
				
		int iPrice = 500;
		System.out.println("Price value is "+ iPrice);
		
		double dPrice = iPrice;
		System.out.println("Decimal price value is "+ dPrice);
		
		
		
		double dPrice2 = 500.87;
		System.out.println("Whole Price value is "+ dPrice2);
		
		int iPrice2 = (int) dPrice2;
		System.out.println("Round of price value is "+ iPrice2);
		
	}

}
