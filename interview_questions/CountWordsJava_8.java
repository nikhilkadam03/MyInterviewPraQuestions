package interview_questions;

import java.util.Arrays;

public class CountWordsJava_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "I am Learning Java";
		
		String [] result = str.split(" ");
		
		int count = 0;
		
		for(int i = 0; i < result.length; i++) {
			
			int count2 = 0;
			
			String word = result[i];
			count2 = word.length();
			System.out.println( result[i] +" = has "+ count2+" no. of letters" );
			count++;
			
			
		}
		
		System.out.println("No. of words = "+count);
		
		//long count = Arrays.stream(str.split(" ")).count();
		
		//System.out.println(count);

	}

}
