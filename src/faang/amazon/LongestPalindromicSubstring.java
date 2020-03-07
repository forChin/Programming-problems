package faang.amazon;

/* Given a string s, find the longest palindromic substring in s. 
 * You may assume that the maximum length of s is 1000.
 * 
 * Example:
 * Input: "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 * 
 * Example:
 * Input: "cbbd"
 * Output: "bb"
 */

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		LongestPalindromicSubstring l = new LongestPalindromicSubstring();
		
		System.out.println(l.longestPalindrome("cbbd")); // answer is "bb"
		System.out.println(l.longestPalindrome("ababacrabarcayio")); // answer is "acrabarca"
		System.out.println(l.longestPalindrome("asasin")); // answer is "asa"
	}

	public String longestPalindrome(String str) {
		if(str == null || str.length() == 0) {
			return "";
		}
		
		String longestPalindromicSubstring = "";
		
		for(int i = 0; i < str.length(); i++) {
			for(int j = i + 1; j <= str.length(); j++) {
				if(j - i > longestPalindromicSubstring.length() && isPalindrome(str.substring(i, j))) {
					longestPalindromicSubstring = str.substring(i, j);
				}
			}
		}
		
		return longestPalindromicSubstring;
	}

	private boolean isPalindrome(String substr) {
		int i = 0;
		int j = substr.length() - 1;
		
		while (i <= j) {
			if(substr.charAt(i++) != substr.charAt(j--)) {
				return false;
			}
		}
		
		return true;
	}
}
