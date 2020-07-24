package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;

public class MultipleCatch {

	public static void main(String[] args) throws FileNotFoundException {
		InputStream input1 = null;
		try {
			       	      int num[] = {1, 2, 3 ,4};
			       	      System.out.println(num[4]);
			    	      int x=9/0;
			       	      input1 = new FileInputStream("c:\\Users\\meena\\Desktop\\Analysis_Java.txt");
			    		  int data = input1.read();
			    		  if(data != -1) {
			    		      System.out.println("I am able to read the file!!!!"+data);//Getting Ascii value for first number
			    		      data = input1.read();
			    		    
			    		  }
			  }
		catch(IOException fnf){
			fnf.printStackTrace();
			System.out.println("Get cause method gives output as "+fnf.getCause());//null
			System.out.println("Get message method gives output as "+fnf.getMessage());//Cannot find file specified
		}
		catch (ArrayIndexOutOfBoundsException arrayExc) {
			System.out.println("Exception is catched by Array Index itself");
			System.out.println("Get stack trace method gives output as "+arrayExc.getStackTrace());
			arrayExc.printStackTrace();
			System.out.println("Get cause method gives output as "+arrayExc.getCause());//null
			System.out.println("Get message method gives output as "+arrayExc.getMessage());//5
		} 
		catch(ArithmeticException ae){
			ae.printStackTrace();
			System.out.println("Exception is catched by Arithmetic exception only");
		}
		/*catch (SQLException sql) {
			System.out.println("Exception is catched by Array Index itself");
			sql.printStackTrace();
		} */
		/*catch (Exception e) {
			System.out.println("Exception is catched by the Exception class");
			e.printStackTrace();
		}    */
		 
	}
}
