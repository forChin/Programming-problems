package faang.airbnb;

import java.util.Stack;

/* Given a string containing just the characters '(', ')', '{', '}', '[' and ']', 
 * determine if the input string is valid.
 * 
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid 
 * but "(]" and "([)]" are not.
 */

public class ValidParentheses {

	public static void main(String[] args) {
		ValidParentheses v = new ValidParentheses();
		
		System.out.println(v.isValid("{}[]()")); // answer is true
		System.out.println(v.isValid("{{}[]()}")); // answer is true
		System.out.println(v.isValid("{()[]}")); // answer is true
		System.out.println(v.isValid("{}[](")); // answer is false
		System.out.println(v.isValid("{}[](]")); // answer is false
	}

	public boolean isValid(String s) {
		if(s.length() % 2 == 1) {
			return false;
		}
		
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < s.length(); i++) {
			char current = s.charAt(i);
			
			if(current == '(' || current == '[' || current == '{') {
				stack.add(current);
			} else if (current == ')' && !stack.isEmpty() && stack.peek() == '(') {
				stack.pop();
			} else if(current == ']' && !stack.isEmpty() && stack.peek() == '[') {
				stack.pop();
			} else if(current == '}' && !stack.isEmpty() && stack.peek() == '{') {
				stack.pop();
			} else {
				return false;
			}
		}
		
		return stack.isEmpty();
	}
}
