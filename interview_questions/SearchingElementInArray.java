package interview_questions;

public class SearchingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array = {11,21,44,5,6,78,99};
		
		int element = 44;
		
		boolean check = false;
		
		for (int i = 0; i < array.length; i++) {
			
			if(element == array[i]) {
				check = true;
				System.out.println("Element found at "+i +" index");
				break;
			}
			
		}
		if(!check) {
			System.out.println("Element not found");
			
		}

	}
 
}
