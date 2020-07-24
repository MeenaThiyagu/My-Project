package collection;

public class Address {
	public String address;
	
	Address(String add){
		this.address=add;
		
	}

	@Override
	public String toString() {
		return "Address [address=" + address + "]";
	}
}
