package interview_questions;

import java.util.Arrays;

public class RotateArrayKTimes {
	
	public static void main(String[] args) {
		
		int [] array = {1,2,3,4,5,6,7};
	
		System.out.println("Origial Array");
		for(int i =0 ; i < array.length; i++) {
			System.out.print(" "+array[i]);
		}
		rotate(array, 3);
		
		System.out.println("");
		System.out.println("Result Array");
		for(int i =0 ; i < array.length; i++) {
			System.out.print(" "+array[i]);
		}
		
	}
	
	public static void rotate(int [] array, int k) {
		k = k % array.length;
		reverse(array, 0, array.length-1);
		reverse(array, 0, k-1);
		reverse(array, k, array.length-1);
		
	}
	
	public static void reverse(int [] array, int start, int end ) {
		
		while(start < end) {
			int temp = array[start];
			array[start]=array[end];
			array[end] = temp;
			start++;
			end--;
		}
		
	}

}
