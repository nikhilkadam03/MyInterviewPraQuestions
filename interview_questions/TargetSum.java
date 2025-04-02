package interview_questions;

import java.util.Scanner;

public class TargetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int [] array = takeInput();
		System.out.println("Enter the Target number");
		int x = sc.nextInt();
		System.out.println(pairSum(array,x));
	}
	
	public static int [] takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size = sc.nextInt();
		int [] array = new int[size];
		for(int i =0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		
		return array;
	}
	
	public static String pairSum(int [] array, int number) {
		int ans = 0;
		for(int i = 0; i < array.length; i++) {
			
			for(int j = i+1; j < array.length; j++) {
				
				if(array[i] + array[j] == number) {
					ans++;
				}
			}
			
		}
		return ans+" "+number+ " can have these many pairs";
	}
	

}
