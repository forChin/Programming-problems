package faang.facebook;

import java.util.HashSet;
import java.util.Set;

/* Given an unsorted array of integers, 
 * find the length of the longest consecutive elements sequence.
 * 
 * For example,
 * Given [100, 4, 200, 1, 3, 2],
 * The longest consecutive elements sequence is [1, 2, 3, 4]. 
 * Return its length: 4.
 * 
 * Your algorithm should run in O(n) complexity.
 */

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		LongestConsecutiveSequence l = new LongestConsecutiveSequence();
		
		System.out.println(l.longestConsecutive(new int[] {100, 4, 200, 1, 3, 2})); // answer is 4
		System.out.println(l.longestConsecutive(new int[] {1, 2, 3, 44, 33, 22})); // answer is 3
	}
	
	 public int longestConsecutive(int[] nums) {
		 if(nums == null || nums.length == 0) {
			 return 0;
		 }
		 
		 Set<Integer> set = new HashSet<>();
		 
		 for(int i : nums) {
			 set.add(i);
		 }
		 
		 int maxLen = 0;
		 for(int i : set) {
			 if(!set.contains(i-1)) {
				 int currentMaxLen = 1;
				 
				 while(set.contains(i+1)) {
					 currentMaxLen++;
					 i++;
				 }
				 
				 maxLen = Math.max(maxLen, currentMaxLen);
			 }
		 }
		 
		 return maxLen;
	 }

}
