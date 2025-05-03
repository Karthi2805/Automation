package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapEx {

	public static void main(String[] args) {
		Map<String, Integer> oMap = new HashMap<String, Integer>();
		oMap.put("Karthi", 28);
		oMap.put("Balaji", 27);
		oMap.put("Hari", 27);
		oMap.put("Arun", 25);
		oMap.put("Praveen", 26);
		oMap.put("Karthi", 29);
		System.out.println(oMap);
		
		System.out.println("To retrieve value based on key : " + oMap.get("Karthi"));
		
		Set<String> boys = oMap.keySet();
		for (String gang : boys) {
			//System.out.println(gang);
			System.out.println(gang + " : "+ oMap.get(gang));
		}
		
		System.out.println("*********************************************************");
		
		Set<Entry<String, Integer>> eSet = oMap.entrySet();
		for (Entry<String, Integer> A : eSet) {
			//System.out.println(A);
			System.out.println(A.getKey() + " : " + A.getValue());	
		}
		
		System.out.println("***************Map & List Combination***************************");
		
		List<String> oTesting = new ArrayList<String>();
		oTesting.add("Seleinum");
		oTesting.add("API Automation");
		oTesting.add("Playwright");
		oTesting.add("ETL");
		
		List<String> oDevlopment = new ArrayList<String>();
		oDevlopment.add("Java");
		oDevlopment.add("C#");
		oDevlopment.add("Python");
		oDevlopment.add("CSS");
		oDevlopment.add("Angular");
		
		Map<String, List<String>> oMap1 = new HashMap<String, List<String>>();
		oMap1.put("Testing", oTesting);
		oMap1.put("Devlopment", oDevlopment);
		System.out.println(oMap1);
		
		Set<String> courses = oMap1.keySet();
		for (String course : courses) {
			System.out.println(oMap1.get(course).get(3));
		}
		
		System.out.println("***************Linked Hashmap********************************");
		
		Map<String, Integer> oMap2 = new LinkedHashMap<String, Integer>();
		oMap2.put("Karthi", 28);
		oMap2.put("Balaji", 27);
		oMap2.put("Hari", 27);
		oMap2.put("Arun", 25);
		oMap2.put("Praveen", 26);
		oMap2.put("Karthi", 29);
		
		Set<String> BB = oMap2.keySet();
		for (String CC : BB) {
			//System.out.println(CC);
			System.out.println(CC + " : " + oMap2.get(CC));
		}
		
		System.out.println("***************Tree Hashmap********************************");
		
		Map<String, Integer> oMap3 = new TreeMap<String, Integer>();
		oMap3.put("Karthi", 28);
		oMap3.put("Balaji", 27);
		oMap3.put("Hari", 27);
		oMap3.put("Arun", 25);
		oMap3.put("Praveen", 26);
		oMap3.put("Karthi", 29);
		//oMap3.put(null, 30);
		System.out.println(oMap3);
	}
	
}

