package interview_questions;

import java.util.Arrays;

public class DeletingElementFromArray {

	public static void main(String[] args) {
		
		int [] originalArray = {1,2,3,4,5,6,7,8,9};
		
		int elementToRemove = 5;
		
		int [] newArray = toRemove(originalArray, elementToRemove);
		
		System.out.println("Original Array "+Arrays.toString(originalArray));
		System.out.println("________________________________________________");
		System.out.println("New Array "+Arrays.toString(newArray));
		
	}
		
		public static int [] toRemove(int [] array, int element) {
			
			int [] newArray = new int[array.length-1];
			
			int index = 0;
			
			for(int i = 0; i < array.length; i++) {
				
				if(array[i] != element) {
					newArray[index] = array[i];
					index++;
				}
			}
			return newArray;
			
		}
		
}
