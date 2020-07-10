import java.util.Scanner;

public class Clienttype extends ClientDetails {
	public String client_type_id;
	public Clienttype(String client_type_id) {
		super();//No arg constructor is called
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of client type here: Allowed value is CONSUMER");
		String ct_type=sc.next();
		if(ct_type.equalsIgnoreCase("CONSUMER")){
			Clienttype ctObj=new Clienttype("Private Client");
			ClientDetails cdObj1=new ClientDetails(10000,"ICG");
			cdObj1.country="NJ";
			cdObj1.name="Meena";
			cdObj1.ClientDetailsSTatic();
			cdObj1.ConsolidatedDetails();
		}
	}

}
