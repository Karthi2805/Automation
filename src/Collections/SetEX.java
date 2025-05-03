package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetEX {

	public static void main(String[] args) {
		Set<String> oSet = new HashSet<String>();
		
		oSet.add("Karthi");
		oSet.add("Balaji");
		oSet.add("Hari");
		oSet.add("Logesh");
		oSet.add(null);
		oSet.add("Mathi");
		oSet.add(null);
		System.out.println(oSet);
		
		List<String> oList1 = new ArrayList<String>();
		oList1.add("ABC");
		oList1.add("DEF");
		oList1.add("GHI");
		oList1.add("ABC");
		oSet.addAll(oList1);
		System.out.println(oSet);
		System.out.println("**********************************************************");
		
		for (String name : oSet) {
			System.out.println(name);
		}
		
		System.out.println("***********************************************");
		
		Iterator<String> names = oSet.iterator();
		while (names.hasNext()) {
			System.out.println(names.next());
		}
		System.out.println("***********Linked Hashset*****************");
		//Linked hash set will manitain the insertion order, but unable to print values using based on index (No get method in set Interface)
		
		Set<String> oSet2 = new LinkedHashSet<String>();
		oSet2.add("Karthi");
		oSet2.add("Balaji");
		oSet2.add("Hari");
		oSet2.add("Logesh");
		oSet2.add(null);
		oSet2.add("Mathi");
		oSet2.add(null);
		System.out.println(oSet2);
		
		System.out.println("**************TreeSet**************************");
		//Tree set will maintain the albhabetical order to print the values & it will not accpet the null values.
		
		Set<String> oSet3 = new TreeSet<String>();
		oSet3.add("Karthi");
		oSet3.add("Balaji");
		oSet3.add("Hari");
		oSet3.add("Logesh");
		oSet3.add("Veeri");
		oSet3.add("Mathi");
		System.out.println(oSet3);
		
		
		
		

	}

}
