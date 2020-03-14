package leetcode;

import java.util.HashMap;

/* Given two strings s and t , 
 * write a function to determine if t is an anagram of s.
 * 
 * Example 1:
 * 
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * Example 2:
 * 
 * Input: s = "rat", t = "car"
 * Output: false
 * 
 * Note:
 * You may assume the string contains only lowercase alphabets.
 */

public class ValidAnagram {

	public static void main(String[] args) {
		ValidAnagram v = new ValidAnagram();
		
		System.out.println(v.isAnagram("cat", "tac")); //answer is true
		System.out.println(v.isAnagram("java", "cool")); //answer is false
		System.out.println(v.isAnagram("python", "garbage")); //answer is false
	}

	public boolean isAnagram(String s, String t) {
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char c : s.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			} else {
				map.put(c, 1);
			}
		}
		
		for(char c : t.toCharArray()) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)-1);
			} else {
				return false;
			}
		}
		
		for(char c : map.keySet()) {
			if(map.get(c) != 0) {
				return false;
			}
		}
		
		return true;
	}
}
