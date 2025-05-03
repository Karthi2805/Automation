package oops;

public class SampleCricketStadium {

	int iNumberofEntrances; //Declare the variable
	int iNumberofSeatingCapacity;
	int iNumberofPavilons;
	String sStadiumName;
	int iParkingCapacity;

	public void Location() {
		System.out.println("Chepauk");
	}

	public void City() {
		System.out.println("Chennai");

	}

	public void NearbyRailwayStation() {
		System.out.println("Triplicane Station");

	}
	public void print() {
		System.out.println(iNumberofEntrances);
		System.out.println(iNumberofPavilons);
		System.out.println(iNumberofSeatingCapacity);
		System.out.println(iParkingCapacity);
		System.out.println(sStadiumName);
	}

	public static void main(String[] args) {
		
		SampleCricketStadium oCricket = new SampleCricketStadium();
		oCricket.iNumberofEntrances = 8; //Define the variable
		oCricket.iNumberofPavilons = 2;
		oCricket.iNumberofSeatingCapacity = 25000;
		oCricket.iParkingCapacity = 10000;
		oCricket.sStadiumName = "MA Chidabaram Stadium";
		oCricket.Location(); // Calling the Method 
		oCricket.City();
		oCricket.NearbyRailwayStation();
		oCricket.print();
		

	}

}
