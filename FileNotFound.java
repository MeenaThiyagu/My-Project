package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLClientInfoException;

public class FileNotFound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream input = null;
		InputStream input1 = null;

		try{
		 input = new FileInputStream("c:\\Users\\Meena\\workspace\\Techouts_Core\\src\\exceptions\\Arithmetic.java");
		 input1 = new FileInputStream("c:\\Users\\meena\\Desktop\\Analysis_Java.txt");

		  int data = input1.read();
		  if(data != -1) {
		      System.out.println("I am able to read the file!!!!"+data);//Getting Ascii value for first number
		      data = input1.read();
		      System.out.println("I am able to read the file!!!!"+data);
		      data = input.read();
		      System.out.println("I am able to read the file!!!!"+data);
		  }
		}
		catch(FileNotFoundException fnf){
			fnf.printStackTrace();
			System.out.println("Get cause method gives output as "+fnf.getCause());//null
			System.out.println("Get message method gives output as "+fnf.getMessage());//Cannot find file specified
		}
		catch(IOException e){
			System.out.println("Catch block is reached as it is IO exception generalized");
		}
		finally {
			System.out.println(" Finally the block is Closed");
		}
	}

}

//How to read content in a file?I can read only ASCII values using .read() method
//If I have 2 files in a try block and if only one file throws exception, why other file is not considered?
//How to analyze how many exceptions are thrown in a package/application if asked as a Business requirement? Are these saved anywhere?
//If I need to display both fnf and IOException? Is there any way? is catching only for syso(showing)? Aren't it saved for analysis for history purpose?

//
