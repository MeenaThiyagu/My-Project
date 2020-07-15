package polymorphism;

import java.util.Scanner;

public class BusinessUser {

	 public static void main(String[] args) { 
		 //Mobile mobj=new Mobile();	
		 	Mobile mobj=new Mobile(123456,"Meena");//IMEI,OwnerName
		 	Customer cusObj=new Customer(111,mobj.getOwnerName());//CID,CustName
			Company cObj=new Company(1,"Samsung",mobj);//CompanyID,CompanyName,Product
			
			System.out.println(cObj.toString());
			System.out.println(mobj.toString());
			System.out.println(cusObj.toString());
			cObj.details();//Need to check why the mobile details are not visible in Company
			mobj.details();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the mode of calling. Options are Whatsapp or Skype. Any other options leads to 911 ");
			String callingMode=sc.next();
			if ((callingMode.equalsIgnoreCase("Whatsapp")) ||(callingMode.equalsIgnoreCase("Skype"))){
				mobj.call(callingMode);
			}
			else{
				System.out.println("----------------Calling default calling mode------------");
				mobj.call();
				System.out.println("----------------A glance on both product and company provided using method overriding and super()------------");
				mobj.Catalog();
				mobj.toString();
			}
		}
}
