package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//LeetCode
public class TwoSum {	
	
	public static void main(String[] args) {
		int[] numbers = new int[] {2,7,11,15};
		int target = 9;
		
		System.out.println(Arrays.toString(getTwoSum(numbers, target)));
	}
	
	public static int[] getTwoSum(int[] numbers, int target) {
		Map<Integer, Integer> nMap = new HashMap<>();
		
		for (int i = 0; i < numbers.length; i++) {
			int delta = target-numbers[i];
			
			if(nMap.containsKey(delta)) {
				return new int[] {nMap.get(delta), i};
			}
			nMap.put(numbers[i], i);
		}
		return new int[] {-1,-1};		
	}

}
