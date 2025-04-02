package interview_questions;

public class PrintFirstLetterOfEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Learn with Krishna Sandeep";
		
		String [] words = str.split(" ");
		
		for(int i =0; i < words.length; i++) {
			
			String s = words[i];
			System.out.println(s.charAt(0));
			
		}
		

	}

}
