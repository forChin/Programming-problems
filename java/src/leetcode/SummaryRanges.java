package leetcode;

import java.util.ArrayList;
import java.util.List;

/* Given a sorted integer array without duplicates, 
 * return the summary of its ranges.
 * 
 * For example, given [0,1,2,4,5,7], 
 * return ["0->2","4->5","7"].
 */

public class SummaryRanges {

	public static void main(String[] args) {
		SummaryRanges s = new SummaryRanges();
		
		printArray(s.summaryRanges(new int[] {0,1,2,4,5,7})); // answer is ["0->2","4->5","7"]
		printArray(s.summaryRanges(new int[] {0, 1, 2, 3, 4, 5})); // answer is ["0->5"]
		printArray(s.summaryRanges(new int[] {0})); // answer is ["0"]
	}

	public List<String> summaryRanges(int[] nums) {
		ArrayList<String> result = new ArrayList<>();
		
		if(nums.length == 1) {
			result.add(nums[0] + "");
			return result;
		}
		
		for(int i = 0; i < nums.length; i++) {
			int current = nums[i];
			
			while(i + 1 < nums.length && nums[i + 1] - nums[i] == 1) {
				i++;
			}
			
			if(current == nums[i]) {
				result.add(nums[i] + "");
			} else {
				result.add(current + "->" + nums[i]);
			}
		}
		
		return result;
	}
	
	public static void printArray(List<String> list) {
		System.out.print("[");
		
		for(int i = 0; i < list.size(); i++) {
			if(i != list.size() - 1) {
				System.out.print("\"" + list.get(i) + "\"" + ", ");
			} else {
				System.out.print("\"" + list.get(i) + "\"");
			}
		}
		
		System.out.println("]");
	}
}
