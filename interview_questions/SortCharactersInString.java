package interview_questions;

import java.util.Arrays;

public class SortCharactersInString {
	
	public static void main(String[] args) {
		
		String str = "java";
		//aavj
		
		char [] charArray = str.toCharArray();
		Arrays.sort(charArray);
		
		for(int i = charArray.length-1; i >= 0; i--) {
			System.out.print(charArray[i] +" "); //vjaa
			
		}
		
		//System.out.println(Arrays.toString(charArray)); //aavj
		
	}

}
