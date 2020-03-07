package faang.airbnb;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		TwoSum t = new TwoSum();
		
		printArray(t.twoSum(new int[] {1, 2, 3}, 5)); // answer is [1, 2]
		printArray(t.twoSum(new int[] {1, 4, 3}, 10)); // answer is []
		printArray(t.twoSum(new int[] {2, 5, 3}, 7)); // answer is [0, 1]
	}

	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map  = new HashMap<>();
		
		int[] result = {-1, -1};
		
		for(int i = 0; i < nums.length; i++) {
			if(map.containsKey(target - nums[i])) {
				result[1] = i;
				result[0] = map.get(target - nums[i]);
				
				return result;
			}
			
			map.put(nums[i], i);
		}
		
		return result;
	}
	
	public static void printArray(int[] nums) {
		System.out.print("[");
		
		for(int i = 0; i < nums.length; i++) {
			if(i != nums.length-1) {
				System.out.print(nums[i] + ", ");
			} else {
				System.out.print(nums[i]);
			}
			
		}
		
		System.out.println("]");
	}
}
