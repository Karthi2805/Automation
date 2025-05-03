package oops;

public class ReturnComplexType {
	
	public String[] ReturnArrayValue() {
		
		String names [] = {"LK", "Balaji", "Maddy", "Hari", "Krish"};
		return names;
		
	}
	
	public ReturnComplexType SameClassReturn() { //Return the class
		System.out.println("This is used to return all the mthods in the class & going to use those methods in another class");
		return new ReturnComplexType();
		
	}
		
	public static void main(String[] args) { 
		
		
		ReturnComplexType obj = new ReturnComplexType();
		String[] frndname = obj.ReturnArrayValue();
		for (String s : frndname) {
			System.out.println(s);
			
		}
		
	}

}
