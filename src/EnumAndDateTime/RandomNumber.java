package EnumAndDateTime;

import java.util.Iterator;
import java.util.Random;

public class RandomNumber {

	public static void randomclass() {
		Random ran = new Random();
		for (int i = 0; i < 10; i++) {
			System.out.println("Genertate random integer value : " + ran.nextInt());
			System.out.println("Genertate random integer value : " + ran.nextInt(700));

			System.out.println("Genertate random integer value :" + ran.nextDouble());

			System.out.println("Genertate random integer value : " + ran.nextBoolean());
		}

	}
	

	public static void main(String[] args) {
		randomclass();

	} //Math.random 
	//ThreadLocalRandom Class

}
