package interview_questions;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "aagcdefccb";
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		
		int lengthOfString = str.length();
		
		for(int i = 0; i < lengthOfString ; i++) {
			
			Character currentCharacter = str.charAt(i);
			if(hashMap.containsKey(currentCharacter) == false) {
				hashMap.put(currentCharacter, 1);
			}
			else {
				Integer currentFreq = hashMap.get(currentCharacter);
				currentFreq++;
				hashMap.put(currentCharacter, currentFreq);
			}
		}
		boolean noRepeatingFound = false;
		for(int i = 0; i < lengthOfString ; i++) {
			
			Character currentCharacter = str.charAt(i);
			int currentFrq = hashMap.get(currentCharacter);
			if(currentFrq == 1) {
				System.out.println(currentCharacter);
				noRepeatingFound = true;
				break;
			}
		}
		
		if(noRepeatingFound == false) {
			System.out.println(-1);
		}

	}

}
