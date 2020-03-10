package faang.adobe;

import java.util.HashMap;

/* Given an array of size n, find the majority element. 
 * The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * 
 * You may assume that the array is non-empty and 
 * the majority element always exist in the array.
 */

public class MajorityElement {

	public static void main(String[] args) {
		MajorityElement m = new MajorityElement();
		
		System.out.println(m.majorityElement(new int[] {1, 2, 3, 4, 5})); // answer is -1
		System.out.println(m.majorityElement(new int[] {1, 2, 2, 3, 2})); // answer is 2
		System.out.println(m.majorityElement(new int[] {10, 11, 1002, 10, 10, 10, 10})); // answer is 10
	}
	
	public int majorityElement(int[] nums) {
		if(nums.length == 1) {
			return nums[0];
		}
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i : nums) {
			if(map.containsKey(i) && map.get(i) + 1 > nums.length / 2) {
				return i;
			} else if(map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}
		}
		
		return -1;
	}
}
