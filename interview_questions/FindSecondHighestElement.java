package interview_questions;

import java.util.Arrays;

public class FindSecondHighestElement {

	public static void main(String[] args) {
		
		//int [] array = {12,2,3,44,5,6,7,9,44};
		
		int [] array = {12};
		
		findSecondHighest(array);
		
	}
	
	public static void  findSecondHighest(int [] array) {
		
		int size = array.length;
		
		if(size < 2) {
			System.out.println("No Second-highest Element in thr array");
			return;
		}
		
		Arrays.sort(array);
		System.out.println("Sorted Array "+Arrays.toString(array));
		
		for(int i = size-2 ; i >= 0; i--) {
			
			if(array[i] != array[array.length-1]) {
				System.out.println("Second Largest Number is "+array[i]);
				return;
			}
			
		}
	
		
	}
}
