package collection;

import java.util.*;
import java.util.Map.Entry;

public class ListDemo {

	public static void main(String[] args) {
		List <String> lObj=new ArrayList();
		lObj.add("Meena");
		lObj.add("Vishwas");
		lObj.add("Kritika");
		lObj.add("Nandhan");
	
		List <Integer> lObj2=new ArrayList();
		lObj2.add(18);
		lObj2.add(13);
		lObj2.add(14);
		lObj2.add(9);
		
		HashMap<List<Integer>,List<String>> hMap=new HashMap<>();		
		hMap.put(lObj2, lObj);
		
		
		//Traversing through HashMap
		for(Map.Entry<List<Integer>,List<String>> entry: hMap.entrySet())
			System.out.println("For the new created HashMap, The Keys are " +entry.getKey()+" and the values are "+entry.getValue());
		
		//Getting the value of the key 9
		System.out.println("The value of the key 18 is "+hMap.get(1));
		System.out.println("The value of the key 13 is "+hMap.get(13));
		System.out.println("The value of the key 14 is "+hMap.get(14));
		System.out.println("The key value of the value Meena is "+hMap.get("Meena"));
		System.out.println("The value of the key 7 is "+hMap.get(7));
	}
}
