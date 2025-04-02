package interview_questions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindingDuplicatesInArray {

	public static void main(String[] args) {
		
		int [] array = {1,2,3,4,5,7,2,1,4,1};
		
//		Set<Integer> hashSet = new HashSet<>();
//		
//		for(int elements : array) {
//			
//			if (hashSet.add(elements)== false) {
//				
//				System.out.print(elements+" ");
//			}
//		}
		
		
		Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		
		for(int elements : array) {
			
			Integer count = hashMap.get(elements);
			
			if(count == null) {
				hashMap.put(elements, 1);
			}
			else {
				count+=1;
				hashMap.put(elements, count);
			}
		}
		Set<Map.Entry<Integer, Integer>> enterySet = hashMap.entrySet();
		
		for(Map.Entry<Integer, Integer> me: enterySet) {
			
			if(me.getValue()>1) {
				System.out.println(me.getKey());
			}
		}
		
		
	}
}
