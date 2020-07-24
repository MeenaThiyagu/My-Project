package exceptions;

public class Arithmetic {
	public static void main(String[] args) {
		try{
			int x =9/0;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			System.out.println("Stack traced with the error");
		}
	}
}
