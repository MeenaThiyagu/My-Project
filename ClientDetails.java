
public class ClientDetails {
	
	public String name;
	public String country;
	public int salary;
	public String lob;
	static String projectname;//static variable
	
	protected static void ClientDetailsSTatic(){
		System.out.println("This method is static");
	}
	static{//static block
		projectname="Citi";
		System.out.println("Citi is the only project that all the employees work for");
	}

	public ClientDetails(int salary, String lob) {
		super();
		this.salary = salary;
		this.lob = lob;
		System.out.println("The person having the salary of "+this.salary +" under the LOB "+this.lob);
	}
	
	public ClientDetails() {
	System.out.println("No arg constructor is called");	
	}
    public String ConsolidatedDetails(){
    	String result=this.country+this.lob+this.name+this.salary;
    	System.out.println("The client details are: Name is "+name +" having the salary "+salary+" under the LOB "+this.lob +" belonging to the country "+this.country);
    	return result;
    }
	
}

