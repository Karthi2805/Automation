package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		List<String> oList = new ArrayList<String>();
		oList.add("Karthi");
		oList.add("Balaji");
		oList.add("Hari");
		oList.add("Logesh");
		oList.add(null);
		oList.add("Mathi");
		oList.add(null);
		System.out.println(oList);
		
		oList.add(3, "LK");
		System.out.println(oList);
		
		List<String> oList1 = new ArrayList<String>();
		oList1.add("ABC");
		oList1.add("DEF");
		oList1.add("GHI");
		oList1.add("ABC");
		System.out.println(oList1);
		
		oList.addAll(oList1);
		System.out.println(oList);
		//oList1.addAll(oList);
		//System.out.println(oList1);
		
		oList.addAll(4, oList1);
		System.out.println(oList);
		
		System.out.println("To retrieve value from list by index : " + oList.get(5));
		
		System.out.println("Contains Method : " + oList.contains("AAA"));
		
		System.out.println("Size of List : " + oList.size());
		
		System.out.println("Index of : " + oList.indexOf("ABC"));
		System.out.println("Last Index of : " + oList.lastIndexOf("ABC"));
		
		oList.remove("DEF");
		System.out.println(oList);
		oList.remove(8);
		System.out.println(oList);
		
		System.out.println("Equals Method :" + oList.equals(oList1));
		
		System.out.println(oList.get(1).length()); //String methods will use when  put . second time.
		
		System.out.println(oList.get(1).equals("BALAJI"));
		System.out.println(oList.get(1).equalsIgnoreCase("BALAJI"));
		
		System.out.println("***************************List values Retrive Ways***************************");
		
		for(int i=0;oList.size()>i;i++) {
			System.out.println(oList.get(i));
		}
		
		System.out.println("**********************************************************");
		
		for (String sName : oList) {
			System.out.println(sName);
			
		}
		
		System.out.println("*****************************************************************");
		
		int i=0;		
		while (i<oList.size()) {
			System.out.println(oList.get(i));
			i++;		
		}
		System.out.println("*****************Itereator*******************");
		Iterator<String> iNames = oList.iterator();
		while (iNames.hasNext()) {    //hasNext() --> To check current index has value or not
			System.out.println(iNames.next());   //next() -->Print the current index valu & place the cursor to next index
		}	
		
		System.out.println("********************Linked List******************************");
		List<String> oList2 = new LinkedList<String>();
		
		oList2.add("ABC");
		oList2.add("DEF");
		oList2.add("GHI");
		oList2.add("ABC");
		oList2.add("ABC");
		oList2.add(null);
		System.out.println(oList2);
	}

}
