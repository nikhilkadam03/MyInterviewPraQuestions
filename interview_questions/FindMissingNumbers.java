package interview_questions;

import java.util.HashSet;

public class FindMissingNumbers {

	//{2,4,1,5,7,8,0}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] a = {2,4,1,5,7,8,0,12};
		missingNumbers(a);
	}
	
	public static void missingNumbers(Integer a[]) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int num : a) { 
			set.add(num);
		}
		
		int n = a.length+1;
		
		for(int i = 0; i <n; i++) {
			
			if(!set.contains(i)) {
				System.out.println(i);
			}
		}
		
	}

}



