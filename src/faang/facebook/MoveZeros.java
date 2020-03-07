package faang.facebook;

/* Given an array nums, write a function to move all 0's to the end of 
 * it while maintaining the relative order of the non-zero elements.
 * 
 * For example, given nums = [0, 1, 0, 3, 12], 
 * after calling your function, nums should be [1, 3, 12, 0, 0].
 * 
 * Note:
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 */

public class MoveZeros {

	public static void main(String[] args) {
		MoveZeros m = new MoveZeros();
		
		int[] arr = {1, 0, 33, 0, 100, 0};
		m.moveZeros(arr);
		printArray(arr); // answer is [1, 33, 100, 0, 0, 0]
	}

	public void moveZeros(int[] nums) {
		int index = 0;
		for(int i : nums) {
			if(i != 0) {
				nums[index] = i;
				index++;
			}
		}
		
		while(index < nums.length) {
			nums[index++] = 0;
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
