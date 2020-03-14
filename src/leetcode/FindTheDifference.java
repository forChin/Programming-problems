package leetcode;

/* Given two strings s and t which consist of only lowercase letters.
 * 
 * String t is generated by random shuffling string s and 
 * then add one more letter at a random position.
 * 
 * Find the letter that was added in t.
 * 
 * Example:
 * 
 * Input:
 * s = "abcd"
 * t = "abcde"
 * 
 * Output:
 * e
 * Explanation:
 * 'e' is the letter that was added.
 */

public class FindTheDifference {

	public static void main(String[] args) {
		FindTheDifference f = new FindTheDifference();
		
		System.out.println(f.findTheDifference("abcd", "abcde")); // answer is 'e'
		System.out.println(f.findTheDifference("faang", "finaag")); // answer is 'i'
		System.out.println(f.findTheDifference("chingiz", "chinagiz")); // answer is 'a'
	}

	public char findTheDifference(String s, String t) {
		int charCodeS = 0;
		int charCodeT = 0;
		
		for(int i = 0; i < s.length(); i++) {
			charCodeS += s.charAt(i);
		}
		
		for(int i = 0; i < t.length(); i++) {
			charCodeT += t.charAt(i);
		}
		
		return (char) (charCodeT - charCodeS);
	}
}