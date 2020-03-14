package leetcode;

import java.util.ArrayList;

/* You're now a baseball game point recorder.
 * Given a list of strings, each string can be one of the 4 following types:
 * 
 * Integer (one round's score): Directly represents the number of points you get in this round.
 * "+" (one round's score): Represents that the points you get in this round are the sum of the last two valid round's points.
 * "D" (one round's score): Represents that the points you get in this round are the doubled data of the last valid round's points.
 * "C" (an operation, which isn't a round's score): Represents the last valid round's points you get were invalid and should be removed.
 * 
 * Each round's operation is permanent and could have an impact on the round before and the round after.
 * 
 * You need to return the sum of the points you could get in all the rounds.
 * 
 * Example:
 * Input: ["5","2","C","D","+"]
 * Output: 30
 * 
 * Explanation: 
 * Round 1: You could get 5 points. The sum is: 5.
 * Round 2: You could get 2 points. The sum is: 7.
 * Operation 1: The round 2's data was invalid. The sum is: 5.  
 * Round 3: You could get 10 points (the round 2's data has been removed). The sum is: 15.
 * Round 4: You could get 5 + 10 = 15 points. The sum is: 30.
 */

public class BaseballGame {

	public static void main(String[] args) {
		BaseballGame b = new BaseballGame();
		
		System.out.println(b.calPoints(new String[] {"5", "2", "C", "D", "+"})); // answer is 30
		System.out.println(b.calPoints(new String[] {"5","-2","4","C","D","9","+","+"})); // answer is 27
	}
	
	public int calPoints(String[] ops) {
		ArrayList<Integer> points = new ArrayList<>();
		
		for(String s : ops) {
			int currentSize = points.size();
			
			if(s.equals("C")) {
				points.remove(currentSize- 1);
			} else if(s.equals("D")) {
				points.add(points.get(currentSize - 1) * 2);
			} else if(s.equals("+")) {
				points.add(points.get(currentSize - 1) + points.get(currentSize - 2));
			} else {
				points.add(Integer.parseInt(s));
			}
		}
		
		int sum = 0;
		for(int i : points) {
			sum += i;
		}
		
		return sum;
	}

}
