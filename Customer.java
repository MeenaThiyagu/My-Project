package polymorphism;

public class Customer {
	public String customerName;
	static int customerId;
	public Mobile myProduct;
	
	public Customer(int cID, String Name){//Composition-----> Customer owns Mobile
		this.customerId=cID;
		this.customerName=Name;
		this.myProduct=new Mobile(this.customerId,this.customerName);
	}
	
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ",  myProduct=" + myProduct + "]";
	}


	static{
		customerId=100;
		++customerId;
	}
	
	
}
