package stringBufferNBuilder;

import java.util.Scanner;

public class PrintEvenOnly {

	public static void main(String[] args) {
		System.out.println("Enter the string to find even characters here");
		Scanner scObj=new Scanner(System.in);
		String word=scObj.next();		
		StringBuffer sbObj=new StringBuffer(word);
		StringBuffer sbObj2=new StringBuffer();
		sbObj.ensureCapacity(1);
		for(int i=0;i<sbObj.length();i++){
			if(i%2!=0)
				System.out.println("The even placed words are "+sbObj.charAt(i));
		}
	}
}
