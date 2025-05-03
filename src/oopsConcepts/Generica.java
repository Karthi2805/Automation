package oopsConcepts;

import java.util.ArrayList;
import java.util.List;

public class Generica {

	public static void main(String[] args) {
		
		//Without Generics
		List oList = new ArrayList ();
		oList.add("Karthi");
		oList.add(29);
		oList.add("QA Engineer");
		oList.add(30000);
		System.out.println(oList);
		String sName = (String) oList.get(2);
		System.out.println(sName);
		int age = (Integer) oList.get(1);
		System.out.println(age);
		
		//With Generics - (Generics should always a Non-primitive data type)
		List<String> oName = new ArrayList<String>();
		oName.add("Karthi");
		oName.add("Balaji");
		oName.add("Logesh");
		System.out.println(oName);
		String s = oName.get(1);
		System.out.println(s);

	}

}
