package interview_questions;

import java.util.Arrays;

public class MedainOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int [] arr = {2,4,1,3,5};
		int [] arr = {2, 5, 1, 7}; 
		 Arrays.sort(arr);
		 System.out.println("Sorted Array: "+ Arrays.toString(arr));
		
		 if(arr.length % 2 != 0) {
			 int index = arr.length / 2;
			 System.out.println("Meadian "+arr[index]);
		 }
		 else {
			 int index = arr.length/2;
			 double md =(double) (arr[index] + arr[index-1])/2;
			 System.out.println(md);
			 
		 }

	}

}
