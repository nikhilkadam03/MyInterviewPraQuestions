package interview_questions;

import java.util.Arrays;

public class AnagramChecker {
	
	//silent
	//Listen
	
	public static void main(String[] args) {
		
		String s1 = "Slient";
		String s2 = "Lis Ten";
		System.out.println(isAnagram(s1,s2));
		
	}
	
	public static boolean isAnagram (String s1, String s2) {
		
		//Remove the white space..
		 String str1 = s1.replaceAll("\\s", "");
		 String str2 = s2.replaceAll("\\s", "");
		
		 //check the length 
		if(str1.length() != str2.length()) {
			
			return false;
		}
		else {
			
			//Convert to lowercase and convert to char Array
			char [] arr1 = str1.toLowerCase().toCharArray();
			char [] arr2 =str2.toLowerCase().toCharArray();
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			return Arrays.equals(arr1, arr2);
		}
		
		
	}

}
