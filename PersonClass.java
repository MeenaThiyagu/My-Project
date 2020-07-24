package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class PersonClass {
	String name;
	int age;
	char gender;
	int contact;
	String address;
	
	
	public PersonClass(String name, int age, char gender, int contact, String address) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.contact = contact;
		this.address = address;
	}


	@Override
	public String toString() {
		return "PersonClass [name=" + name + ", age=" + age + ", gender=" + gender + ", contact=" + contact
				+ ", address=" + address + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonClass pcObj1=new PersonClass("Meena",18,'F',132,"Seven");
		PersonClass pcObj2=new PersonClass("Vishwas",13,'M',123,"Eleven");
		PersonClass pcObj3=new PersonClass("Kritika",14,'F',131,"Shols");
		PersonClass pcObj4=new PersonClass("Nandhan",9,'M',133,"Chennai");
		List<PersonClass> pcList=new ArrayList<>();
		pcList.add(pcObj1);
		pcList.add(pcObj2);
		pcList.add(pcObj3);
		pcList.add(pcObj4);
		
		List<Integer> liInt=new ArrayList();
		//liInt.add
		Iterator itObj=pcList.iterator();
		while(itObj.hasNext()){
			System.out.println(itObj.next());
			
		HashMap<Integer, String> hmap=new HashMap<>();
		hmap.put(pcObj1.contact,pcObj1.name);
		hmap.put(pcObj2.contact,pcObj2.name);
		hmap.put(pcObj3.contact,pcObj3.name);
		hmap.put(pcObj4.contact,pcObj4.name);
		
		//Traversing through Map
		for(Map.Entry<Integer,String> entry: hmap.entrySet())
			System.out.println("For the key " +entry.getKey()+", the value of the map is "+entry.getValue());		
		}		
		
	}



}
