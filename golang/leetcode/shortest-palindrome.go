/*
Problem:
- You are given a string s. You can convert s to a palindrome by
  adding characters in front of it.
  Return the shortest palindrome you can find by
  performing this transformation.

Example:
- Input: s = "aacecaaa"
  Output: "aaacecaaa"

Link:
- https://leetcode.com/problems/shortest-palindrome/
*/

package leetcode

func shortestPalindrome(s string) string {
	prefix := ""
	for i := len(s) - 1; i >= 0; i-- {
		if sp := prefix + s; isPalindrome(sp) {
			return sp
		}
		prefix += string(s[i])
	}

	return ""
}
