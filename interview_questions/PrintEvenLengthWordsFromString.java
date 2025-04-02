package interview_questions;

public class PrintEvenLengthWordsFromString {
	
	public static void main(String[] args) {
		String str1 = "Hell World";
		
		String [] str2 = str1.split(" ");
		
		for(int i= 0; i <str2.length; i++) {
			
				String word = str2[i];
				
				if(word.length() % 2 == 0) {
					System.out.println(word);
				}
		}
		
	}

}
