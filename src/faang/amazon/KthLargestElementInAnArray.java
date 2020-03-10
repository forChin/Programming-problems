package faang.amazon;

import java.util.Arrays;

/* Find the kth largest element in an unsorted array. 
 * Note that it is the kth largest element in the sorted order, 
 * not the kth distinct element.
 * 
 * For example,
 * Given [3,2,1,5,6,4] and k = 2, return 5.
 * 
 * Note: 
 * You may assume k is always valid, 1 ≤ k ≤ array's length.
 */

public class KthLargestElementInAnArray {

	public static void main(String[] args) {
		KthLargestElementInAnArray k = new KthLargestElementInAnArray();
		
		System.out.println(k.findKthLargest(new int[] {3, 2, 1, 5, 6, 4}, 2)); // answer is 5
		System.out.println(k.findKthLargest(new int[] {3, 2, 1, 5, 6, 4}, 1)); // answer is 6
		System.out.println(k.findKthLargest(new int[] {3, 21, 61, 42}, 3)); // answer is 21
	}

	public int findKthLargest(int[] nums, int k) {
		int len = nums.length;
		
		Arrays.sort(nums);
		
		return nums[len - k];
	}
}
