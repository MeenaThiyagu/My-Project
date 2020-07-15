package polymorphism;

public class Company {
	public int companyId;
	public String companyName;
	public Mobile productDetails;	//Aggregation
	//public Laptop laptopProdDetails;
	Company(){
		
	}
	Company(int companyId,String companyName, Mobile productDetails){
		this.companyId=companyId;
		this.companyName=companyName;
		this.productDetails=productDetails;
	}
	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + ", productDetails=" + productDetails
				+ "]";
	}
	public void details() {//Method will be overridden
		System.out.println("Company ID is " +companyId+ " And its products are "+ productDetails);
		//productDetails.getImei();
	}

	public int Catalog(){//Method will be overridden
			System.out.println("Base class method.A company has various products like Mobile, Laptop, Tab");
			return companyId;
	}	
}

