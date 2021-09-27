package faang.snapchat;

public class ReverseWordsInAString {

	public static void main(String[] args) {
		ReverseWordsInAString r = new ReverseWordsInAString();
		
		System.out.println(r.reverseWords("the sky is blue")); // answer is "blue is sky the"
		System.out.println(r.reverseWords("is answer")); // answer is "answer is"
		System.out.println(r.reverseWords("reversed is string this")); // answer is "this string is reversed"
	}
	
	public String reverseWords(String str) {
		String[] words = str.trim().split("\\s+");
		String result = "";
		
		for(int i = words.length - 1; i > 0; i--) {
			result += words[i] + " ";
		}
		
		return result + words[0];
	}
}
