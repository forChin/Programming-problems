package others;

/* Write a function that takes two 
 * words as an argument and 
 * returns true if they are 
 * anagrams (contain the exact same letters) 
 * and false otherwise.
 */

public class Anagram {

	public static void main(String[] args) {
		Anagram a = new Anagram();
		
		System.out.println(a.isAnagram("cat", "tac")); //answer is true
		System.out.println(a.isAnagram("New York Times", "monkeys write")); //answer is true
		System.out.println(a.isAnagram("debit card", "bad credit")); //answer is true
		System.out.println(a.isAnagram("java", "cool")); //answer is false
		System.out.println(a.isAnagram("Python", "garbage")); //answer is false
	}

	public boolean isAnagram(String str1, String str2) {
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		if(str1.length() < str2.length()) {
			String strTemp = str1 + "";
			str1 = str2;
			str2 = strTemp;
		}
		
		for(int i = 0; i < str1.length(); i++) {
			if(!isCharInWord(str1.charAt(i), str2)) {
				return false;
			}
		}
		
		return true;
	}
	
	public boolean isCharInWord(char c, String word) {
		boolean inWord = false;
		
		for(int i = 0; i < word.length(); i++) {
			if(c == word.charAt(i)) {
				inWord = true;
			}
		}

		return inWord;
	}
}
