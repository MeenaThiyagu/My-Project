package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AddressAsValue {
	String name;
	int age;
	char gender;
	Address address;
		

	public AddressAsValue(String name, int age, char gender, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = (Address) address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "AddressAsValue [name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Address addrObj1=new Address("Sterling Drive1");
		Address addrObj2=new Address("Sterling Drive2");
		Address addrObj3=new Address("Sterling Drive3");
		Address addrObj4=new Address("Sterling Drive4");
		
		AddressAsValue pcObj1=new AddressAsValue("Meena",18,'F',addrObj1);
		AddressAsValue pcObj2=new AddressAsValue("Vishwas",13,'M',addrObj2);
		AddressAsValue pcObj3=new AddressAsValue("Kritika",14,'F',addrObj3);
		AddressAsValue pcObj4=new AddressAsValue("Nandhan",9,'M',addrObj4);
		
		List<AddressAsValue> addressList=new ArrayList<>();
		addressList.add(pcObj1);
		addressList.add(pcObj2);
		addressList.add(pcObj3);
		addressList.add(pcObj4);
		
		//COnvert the object to list
		List<Object> newli=new ArrayList<>();
		newli.add(addrObj1);
		newli.add(addrObj2);
		newli.add(addrObj3);
		newli.add(addrObj4);
		
		Iterator itObj=newli.iterator();
		while(itObj.hasNext()){
			System.out.println("Demo" +itObj.next());
		}
			
		HashMap<Integer, Object> hmap=new HashMap<>();
		hmap.put(pcObj1.age, newli.get(0));
		hmap.put(pcObj2.age, newli.get(1));
		
		//Traversing through Map
		for(Map.Entry<Integer,Object> entry: hmap.entrySet())
			System.out.println("For the key " +entry.getKey()+", the value of the map is "+entry.getValue());		
		}		
		


}
