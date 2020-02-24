package problems.leetcode;

/* DESCRIPTION
 *Given an array of integers, return indices of the two 
 *numbers such that they add up to a specific target.
 *You may assume that each input would have exactly one solution, 
 *and you may not use the same element twice.
 *
 *Example:
 *Given nums = [2, 7, 11, 15], target = 9,
 *Because nums[0] + nums[1] = 2 + 7 = 9,
 *return [0, 1].
*/

class TwoSum {
	public static void main(String[] args) {
		TwoSum s = new TwoSum();
		
		int[] nums = {3, 2, 4};
		s.printArray(s.twoSum(nums, 6)); 	// answer: [1, 2]
		s.printArray(s.twoSum(nums, 5)); 	// answer: [0, 1]
		
		int[] nums2 = {7, 34, 22, 1, 10};
		s.printArray(s.twoSum(nums2, 11)); 	// answer: [3, 4]
		s.printArray(s.twoSum(nums2, 35)); 	// answer: [1, 3]
	}
	
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(i != j && nums[i] + nums[j] == target) {
                	return new int[] {i, j};
                }
            }
        }
        
        throw new IllegalArgumentException("No right answer :(");
    }
    
    public void printArray(int[] arr) {
    	System.out.print("[");

    	for (int i = 0; i < arr.length; i++) {
    		System.out.print(arr[i]);
    		if(i != arr.length-1) {
    			System.out.print(", ");
    		}
    	}
    	
    	System.out.println("]");
    }
}
