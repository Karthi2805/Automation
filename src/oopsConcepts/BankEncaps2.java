package oopsConcepts;

public class BankEncaps2 extends BankEncapsulation {

	public static void main(String[] args) {
		
		BankEncaps2 obj = new BankEncaps2 ();
		
		obj.setAccNo(9365323873468746l);
		obj.setAccName("Karthikeyan L");
		obj.setPhnNo(9500334455l);
		
		System.out.println("Account number is " + obj.getAccNo());
		System.out.println("Account holder name is " + obj.getAccName());
		System.out.println("Phone number is " + obj.getPhnNo());
		

	}

}
