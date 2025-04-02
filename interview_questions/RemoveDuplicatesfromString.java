package interview_questions;

public class RemoveDuplicatesfromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "coconut";
		String output ="";
		
		for(int i = 0; i < str.length(); i++) {
			
			boolean check = false;
			
			for(int j = 0; j < output.length(); j++) {
				
				if(output.charAt(j) == str.charAt(i)) {
					check = true;
					break;
				}
			}
			
			if(!check) {
				output += str.charAt(i);
			}
		}
			System.out.println(output);
		

	}

}
