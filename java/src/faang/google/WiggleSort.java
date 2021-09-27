package faang.google;

/* Given an unsorted array nums, reorder it in-place such 
 * that nums[0] <= nums[1] >= nums[2] <= nums[3]....
 * 
 * For example, given nums = [3, 5, 2, 1, 6, 4], 
 * one possible answer is [1, 6, 2, 5, 3, 4].
 */

public class WiggleSort {

	public static void main(String[] args) {
		WiggleSort w = new WiggleSort();
		
		int[] arr = {1, 2, 3, 4, 5};
		w.wiggleSort(arr);
		printArray(arr); // answer is [1, 3, 2, 5, 4]
	}

	public void wiggleSort(int[] nums) {
		for(int i = 1; i < nums.length; i++) {
			int current = nums[i-1];
			
			if((i % 2 == 0) == (current < nums[i])) {
				nums[i-1] = nums[i];
				nums[i] = current;
			}
		}
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
