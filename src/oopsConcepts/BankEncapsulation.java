package oopsConcepts;

public class BankEncapsulation {

	/*
	 * Encapsulation is a wrpping up the data members. Using this technique, we can
	 * hide data memebers from one class to another class.
	 * 
	 * Getter & Setter method
	 */
	private long accNumber;
	private String accHolderName;
	private long accPhoneNumber;

	public void setAccNo(long AccNum) {
		accNumber = AccNum;
	}
	public void setAccName(String AccName) {
		accHolderName = AccName;
	}
	public void setPhnNo(long AccPhnNo) {
		accPhoneNumber = AccPhnNo;
	}
	
	public long getAccNo() {
		return accNumber;
	}
	
	public String getAccName() {
		return accHolderName;
	}
	
	public long getPhnNo() {
		return accPhoneNumber;
	}

}
