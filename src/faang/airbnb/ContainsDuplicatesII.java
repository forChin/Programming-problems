package faang.airbnb;

import java.util.HashMap;

/* Given an array of integers and an integer k, 
 * find out whether there are two distinct indices i and 
 * j in the array such that nums[i] = nums[j] and 
 * the absolute difference between i and j is at most k.
 */

public class ContainsDuplicatesII {

	public static void main(String[] args) {
		ContainsDuplicatesII c = new ContainsDuplicatesII();
		
		System.out.println(c.containsNearbyDuplicate(new int[] {1, 2, 1, 3, 4}, 2)); // answer is true
		System.out.println(c.containsNearbyDuplicate(new int[] {1, 2, 3, 4, 1}, 2)); // answer is false
		System.out.println(c.containsNearbyDuplicate(new int[] {1, 2, 3, 4, 5, 6}, 5)); // answer is false
	}

	public boolean containsNearbyDuplicate(int[] nums, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < nums.length; i++) {
			int current = nums[i];
			
			if(map.containsKey(current) && i - map.get(current) <= k ) {
				return true;
			} else {
				map.put(current, i);
			}
		}
		
		return false;
	}
}
