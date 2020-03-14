package leetcode;

import java.util.HashMap;

/* Given an array of integers, 
 * every element appears three times except for one, 
 * which appears exactly once. Find that single one.
 */

public class SingleNumberII {

	public static void main(String[] args) {
		SingleNumberII s = new SingleNumberII();
		
		System.out.println(s.singleNumber(new int[] {1, 2, 2, 3, 3})); // answer is 1
		System.out.println(s.singleNumber(new int[] {1, 1, 2, 2, 3, 3})); // answer is -1
		System.out.println(s.singleNumber(new int[] {120, 200, 200, 120, 3})); // answer is 3
	}
	
	public int singleNumber(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i : nums) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			} else {
				map.put(i, 1);
			}
		}
		
		for(int key : map.keySet()) {
			if(map.get(key) == 1) {
				return key;
			}
		}
		
		return -1;
	}

}
