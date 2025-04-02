package interview_questions;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array = {1,2,2,3,4,4,5,6,6,7,1};
		
		for(int i = 0; i < array.length; i++) {
			
			for(int j = i+1; j < array.length; j++) {
				
				if(array[i] == array[j]) {
					array[j] = -1;
				}
			}
			if(array[i] >= 0) {
				System.out.print(" "+array[i]);
			}
		}

	}

}
