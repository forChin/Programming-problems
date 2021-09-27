package faang.google;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), 
 * some elements appear twice and others appear once.
 * 
 * Find all the elements of [1, n] inclusive that do not appear in this array.
 * 
 * Could you do it without extra space and in O(n) runtime? 
 * You may assume the returned list does not count as extra space.
 * 
 * Example:
 * Input: [4,3,2,7,8,2,3,1]
 * Output: [5,6]
 */

public class FindAllNumbersDisappearedInAnArray {

	public static void main(String[] args) {
		FindAllNumbersDisappearedInAnArray f = new FindAllNumbersDisappearedInAnArray();
		
		printArray(f.findDisappearedNumbers(new int[] {4,3,2,7,8,2,3,1})); //answer is [5, 6]
		printArray(f.findDisappearedNumbers(new int[] {1, 2, 3, 4, 5, 5, 7})); //answer is [6]
		printArray(f.findDisappearedNumbers(new int[] {2, 2, 3, 3, 5})); //answer is [1, 4]
	}

	 public List<Integer> findDisappearedNumbers(int[] nums) {
		 HashMap<Integer, Integer> map = new HashMap<>();
		 ArrayList<Integer> result = new ArrayList<>();
		 
		 for(int i = 1; i <= nums.length; i++) {
			 map.put(i, 1);
		 }
		 
		 for(int i : nums) {
			 if(map.containsKey(i)) {
				 map.put(i, -1);
			 }
		 }
		 
		 for(int i : map.keySet()) {
			 if(map.get(i) != -1) {
				 result.add(i);
			 }
		 }
		 
		 return result;
	 }
	 
	 public static void printArray(List<Integer> list) {
			System.out.print("[");
			
			for(int i = 0; i < list.size(); i++) {
				if(i != list.size()-1) {
					System.out.print(list.get(i) + ", ");
				} else {
					System.out.print(list.get(i));
				}
				
			}
			
			System.out.println("]");
		}
}
