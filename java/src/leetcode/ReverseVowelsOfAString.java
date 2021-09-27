package leetcode;

/* Write a function that takes a string as input and 
 * reverse only the vowels of a string.
 * 
 * Example 1:
 * Given s = "hello", return "holle".
 * 
 * Example 2:
 * Given s = "leetcode", return "leotcede".
 * 
 * Note:
 * The vowels does not include the letter "y".
 */

public class ReverseVowelsOfAString {

	public static void main(String[] args) {
		ReverseVowelsOfAString r = new ReverseVowelsOfAString();
		
		System.out.println(r.reverseVowels("hello")); // answer is "holle"
		System.out.println(r.reverseVowels("leetcode")); // answer is "leotcede"
	}

	public String reverseVowels(String s) {
		if(s == null || s.length() == 0) {
			return s;
		}
		
		String vowels = "aeiouAEIOU";
		char[] chars = s.toCharArray();

		int i = 0;
		int j = chars.length-1;
		while(i < j) {
			while(i < j && !vowels.contains(chars[i] + "")) {
				i++;
			}
			
			while(i < j && !vowels.contains(chars[j] + "")) {
				j--;
			}
			
			char temp = chars[i];
			chars[i] = chars[j];
			chars[j] = temp;
		
			i++;
			j--;
		}
		
		return new String(chars);
	}
}
