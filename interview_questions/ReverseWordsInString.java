package interview_questions;

import java.util.Arrays;

public class ReverseWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Welcome to Java World";
		
		String [] splitArray = str.split(" ");
		
		for(int i = splitArray.length-1; i >= 0; i--) {
			
			System.out.print(splitArray[i]+ " ");
			
		}

	}

}
