package interview_questions;

import java.util.Scanner;

public class Java8Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner sc = new Scanner(System.in);
		//System.out.print("Enter the number: ");
		//int num = sc.nextInt();
		String num = "121";
		isPalindrom(num);
		
	}
	private static void isPalindrom(String num) {
		
		
		//String orgNum = String.valueOf(num); //Convert number to String
		String orgNum = num;
		String newStr = "";
		
		
		for(int i = orgNum.length()-1; i >= 0; i--) {
			
			newStr += orgNum.charAt(i);
		}
		if( orgNum.equals(newStr)) {
			System.out.println(num+" is a palindrom number");
		}
		else {
			System.out.println(num+" is not a palindrom number");
		}
		
		
	}



}
