package interview_questions;

public class TargetSum2 {

	public static void main(String[] args) {
		// Sorted Array, with distinct elements
		
		int [] array = {1,2,3,4,5,6,7};
		int sum = 9;
		int low = 0;
		int high = array.length-1;
		
		while(low < high) {
			
			if(array[low] + array[high] > sum) {
				
				high--;
			}
			else if(array[low] + array[high] < sum) {
				low++;
			}
			else if(array[low] + array[high] == sum) {
				
				System.out.println("pair {"+array[low]+","+array[high]+"}" );
				low++;
				high--;
			}
		}

	}

}
