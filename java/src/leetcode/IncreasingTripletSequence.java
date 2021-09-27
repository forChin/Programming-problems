package leetcode;

/* Given an unsorted array return whether an increasing subsequence of length 3 exists or not in the array.
 * 
 * Formally the function should:
 * Return true if there exists i, j, k 
 * such that arr[i] < arr[j] < arr[k] given 0 ≤ i < j < k ≤ n-1 else return false.
 * Your algorithm should run in O(n) time complexity and O(1) space complexity.
 * 
 * Examples:
 * Given [1, 2, 3, 4, 5],
 * return true.
 * 
 * Given [5, 4, 3, 2, 1],
 * return false.
 */

public class IncreasingTripletSequence {

	public static void main(String[] args) {
		IncreasingTripletSequence i = new IncreasingTripletSequence();
		
		System.out.println(i.increasingTriplet(new int[] {1, 2, 3, 4, 5})); // answer is true
		System.out.println(i.increasingTriplet(new int[] {5, 4, 3, 2, 1})); // answer is false
		System.out.println(i.increasingTriplet(new int[] {1, 11, 2, 323, 110, 3})); // answer is true
	}

	public boolean increasingTriplet(int[] nums) {
		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;
		
		for(int n : nums) {
			if(n <= first) {
				first = n;
			} else if(n < second) {
				second = n;
			} else if(n > second) {
				return true;
			}
		}
		
		return false;
	}
}
