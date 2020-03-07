package faang.amazon;

import java.util.HashMap;

/* Given a string, find the first non-repeating character in it and 
 * return it's index. If it doesn't exist, return -1.
 * 
 * Examples:
 * 
 * s = "leetcode"
 * return 0.
 * 
 * s = "loveleetcode",
 * return 2.
 * Note: You may assume the string contain only lowercase letters.
 */

public class FirstUniqueCharacterInAString {

	public static void main(String[] args) {
		FirstUniqueCharacterInAString f = new FirstUniqueCharacterInAString();
		
		System.out.println(f.firstUniqChar("chingiz")); // answer is 0
		System.out.println(f.firstUniqChar("label")); // answer is 1
		System.out.println(f.firstUniqChar("qwertyytrewq")); // answer is -1
	}

	 public int firstUniqChar(String s) {
		 HashMap<Character, Integer> chars = new HashMap<>();
		 
		 for(int i = 0; i < s.length(); i++) {
			 char possibleUniqueChar = s.charAt(i);
			 if(chars.containsKey(possibleUniqueChar)) {
				 chars.put(possibleUniqueChar, -1);
			 } else {
				 chars.put(possibleUniqueChar, i);
			 }
		 }
		 
		 int min = Integer.MAX_VALUE;
		 for(char c : chars.keySet()) {
			 if(chars.get(c) != -1 && chars.get(c) < min) {
				 min = chars.get(c);
			 }
		 }
		 
		 return min == Integer.MAX_VALUE ? -1 : min;
	 }
}
