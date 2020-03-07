package faang.airbnb;

import java.util.HashMap;

/* Given an array of integers, find if the array contains any duplicates. 
 * Your function should return true if any value appears at least twice in the array, 
 * and it should return false if every element is distinct.
 */

public class ContainsDuplicate {

	public static void main(String[] args) {
		ContainsDuplicate c = new ContainsDuplicate();
		
		System.out.println(c.ContainsDuplicate(new int[] {1, 2, 3})); // answer is false
		System.out.println(c.ContainsDuplicate(new int[] {1, 2, 3, 3})); // answer is true
		System.out.println(c.ContainsDuplicate(new int[] {122, 12, 1})); // answer is false
		System.out.println(c.ContainsDuplicate(new int[] {3, 34, 35, 32, 12, 3})); // answer is true
	}
	
	public boolean ContainsDuplicate(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for (int i : nums) {
			if(map.containsKey(i)) {
				return true;
			} else {
				map.put(i, 1);
			}
		}
		
		return false;
	}

}
