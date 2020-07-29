package stringBufferNBuilder;

import java.util.Arrays;
import java.util.Scanner;

public class ReorderWords {

	public static void main(String[] args) {
		String str="";
		ReorderWords reordered=new ReorderWords();
		System.out.println("Enter the input here");
		Scanner scObj=new Scanner(System.in);
		String word=scObj.nextLine();		
		if(word.equalsIgnoreCase("MY HOME IS JEWEL" )){
			//First split using " " ; 		
		String[] wordList=word.split(" ");
		String[] tempWordList=word.split(" ");//create temporary array which stores our re-ordered value
		System.out.println(" The splitted array of words are "+Arrays.toString(wordList));
		//below logic straight away compares the array values according to their indexes and stores in temp array
		if((wordList[0].equalsIgnoreCase("MY")) &&(wordList[1].equalsIgnoreCase("HOME"))&&(wordList[2].equalsIgnoreCase("IS"))&&(wordList[3].equalsIgnoreCase("JEWEL"))){
		
			tempWordList[0]=wordList[3];
			tempWordList[1]=wordList[2];
			tempWordList[2]=wordList[0];
			tempWordList[3]=wordList[1];
		}
		System.out.println("The final is "+tempWordList[0]+tempWordList[1]+tempWordList[2]+tempWordList[3]);
	}
	}
}
