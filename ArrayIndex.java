package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ArrayIndex {

	public static void main(String[] args) throws FileNotFoundException {
		try {
			int[] num1=new int[3];       	     
			int num[] = {1, 2, 3, 4};
			    	      System.out.println(num[5]);
			 }
		catch (Exception e) {
			    	e.printStackTrace();
		}       
	}

}
