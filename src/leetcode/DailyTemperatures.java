package leetcode;

import java.util.Stack;

/* Given a list of daily temperatures, produce a list that, for each day in the input, 
 * tells you how many days you would have to wait until a warmer temperature. 
 * If there is no future day for which this is possible, put 0 instead.
 * 
 * For example, given the list temperatures = [73, 74, 75, 71, 69, 72, 76, 73], 
 * your output should be [1, 1, 4, 2, 1, 1, 0, 0].
 * 
 * Note: The length of temperatures will be in the range [1, 30000]. 
 * Each temperature will be an integer in the range [30, 100].
 */

public class DailyTemperatures {

	public static void main(String[] args) {
		DailyTemperatures d = new DailyTemperatures();
		
		printArray(d.dailyTemperatures(new int[] {73, 74, 75, 71, 69, 72, 76, 73})); // answer is [1, 1, 4, 2, 1, 1, 0, 0]
	}

	public int[] dailyTemperatures(int[] temperatures) {
		Stack<Integer> stack = new Stack<>();
		int[] result = new int[temperatures.length];
		
		for(int i = 0; i < temperatures.length; i++) {
			while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
				int index = stack.pop();
				result[index] = i - index;
			}
			
			stack.push(i);
		}
		
		return result;
	}
	
	public static void printArray(int[] arr) {
		System.out.print("[");
		
		for(int i = 0; i < arr.length; i++) {
			if(i != arr.length - 1) {
				System.out.print(arr[i] + ", ");
			} else {
				System.out.print(arr[i]);
			}
		}
		
		System.out.println("]");
	}
}
