package leetcode;

/*Given a string s, find the longest palindromic substring in s. 
 *You may assume that the maximum length of s is 1000.
 *
 *Example 1:
 *Input: "babad"
 *Output: "bab"
 *Note: "aba" is also a valid answer.
 *
 *Example 2:
 *Input: "cbbd"
 *Output: "bb"
*/

public class LongestPalindromicSubstring {
	
	public static void main(String[] args) {
		LongestPalindromicSubstring l = 
				new LongestPalindromicSubstring();
		
		System.out.println(l.longestPalindrome("madam"));				// answer: madam
		System.out.println(l.longestPalindrome("paramadam")); 			// answer: madam
		System.out.println(l.longestPalindrome("a")); 					// answer: madam
		System.out.println(l.longestPalindrome("lkajdracecarlsabc")); 	// answer: racecar
	}

	public String longestPalindrome(String s) {
		String answer = "";
		
        for(int i = 0; i < s.length(); i++) {
        	for (int j = 0; j < s.length() - i; j++) {
        		String possibleAnswer = s.substring(i, s.length() - j);
            	
            	if(possibleAnswer.length() > answer.length() 
            			&& isPalindrome(possibleAnswer)) {
            		answer = possibleAnswer;
            		break;
            	}
            }
        }
		
		return answer;
    }
	
	public boolean isPalindrome(String s) {
		for(int i = 0; i < s.length() - (1+i); i++) {
			if(s.charAt(i) != s.charAt(s.length() - (1 + i))) {
				return false;
			}
		}
		
		return true;
	}
}
