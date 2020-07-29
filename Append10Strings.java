package stringBufferNBuilder;

import java.util.Scanner;

public class Append10Strings {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="";
		Append10Strings appendStrings=new Append10Strings();
		System.out.println("Enter 10 different strings here");
		Scanner scObj=new Scanner(System.in);
		for(int i=0;i<9;i++){
		str=str.concat(scObj.next());	
		}
		System.out.println("The value of str is "+str);
	}
}
