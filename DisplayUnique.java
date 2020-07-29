package stringBufferNBuilder;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class DisplayUnique {
	public String dispUniqChar(String input){
		
		for(int i=0;i<input.length();i++){//Hii
			System.out.println(input.charAt(i));
			char ch1=input.charAt(i);
		}
		return input;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the input here");
		Scanner scObj=new Scanner(System.in);
		String word=scObj.next();		
		StringBuilder sb = new StringBuilder();
		word.chars().distinct().forEach(c -> sb.append((char) c));
		System.out.println("The value is "+word);

		
	}

}
