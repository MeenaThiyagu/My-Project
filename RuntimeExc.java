package exceptions;

public class RuntimeExc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
     	      int num[] = {1, 2, 3, 4};
     	      System.out.println(num[5]);
		}
		finally{
			 System.out.println("The exception need not be compulsorily catched as it is Runtime exception");
		}
	}

}
