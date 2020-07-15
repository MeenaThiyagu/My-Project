package polymorphism;

import java.util.Scanner;
public class Mobile extends Company {
	private int imei;
	private String ownerName;
	public static int numberToDial;//static variable
	
	static {
		numberToDial=911;		//static method
	}
	
	Mobile(int imei, String ownerName){//Parametertized constructor
		this.imei=imei;
		this.ownerName=ownerName;
	}
	
	@Override
	public String toString() {
		return "Mobile [imei=" + imei + ", ownerName=" + ownerName + "]";
	}

	@Override
	public void details() {//Method Overriding
		System.out.println("IMEI is " +imei+ " And its ownerName is " + ownerName);
	}
	
	
	public int getImei() {
		return imei;
	}
	public void setImei(int imei) {
		this.imei = imei;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	void call(){
		System.out.println("Calling functionality is available through mobile");
		call(numberToDial);// Calling other method
	}
	
	void call(int number){//Method overloading
		System.out.println("--------------Calling using static variable as input to call method-------------------");
		System.out.println("Calling the number "+ number+ " via normal call");
	}
	void call(String input){//Method overloading
		System.out.println("--------------Calling using dynamic string as input to call method-------------------");
		System.out.println("Calling functionality is initiated through Whatsapp/Skype.");
	}
	
	 public int Catalog(){//Method overriding
		 super.Catalog();//Parent class method is called
		 System.out.println("This is an example of method overriding. Mobile has various apps");
		 return companyId;
	 }		
}





