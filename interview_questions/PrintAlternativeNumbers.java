package interview_questions;

public class PrintAlternativeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {0, 1, 2, 3, 4, 5};
		
		for(int i = 0; i < arr.length; i++) {
			
			if(i % 2 != 0) {
				System.out.println(arr[i]);
			}
		}

	}

}
