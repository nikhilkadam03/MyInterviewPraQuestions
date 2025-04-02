package interview_questions;

import java.util.HashMap;

public class MajorityOfElements {
	
	public static void main(String[] args) {
		
		int [] arr = {3,1,2,3,3,4};
		majority(arr);
		
		
		
	}
	public static void majority(int [] arr) {
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = i+1; j < arr.length; j++) {
				
				if(arr[i] == arr[j]) {
					boolean check = false;
					count++;
					if(count >= arr.length/2) {
						check = true;
						System.out.println(i);
					}
					if(!check) {
						System.out.println("No Majority");
					}
				}
				
				
			}
			
			
			
		}
		
		
	}
	
	

}
