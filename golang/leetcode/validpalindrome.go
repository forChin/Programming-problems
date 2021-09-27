/*
Problem:
- Given a string, determine if it is a palindrome, considering only
  alphanumeric characters and ignoring cases.

Example:
- Input: "A man, a plan, a canal: Panama"
  Output: true
- Input: "race a car"
  Output: false

Cost:
- O(n) time, O(1) space.

Link:
- https://leetcode.com/problems/valid-palindrome/
*/

package leetcode

import (
	"strings"
)

func isLetter(r rune) bool {
	return (r >= 'A' && r <= 'Z') || (r >= 'a' && r <= 'z')
}

func isNum(r rune) bool {
	return r >= '0' && r <= '9'
}

func clean(s string) string {
	var cleaned strings.Builder
	for _, c := range s {
		if isLetter(c) || isNum(c) {
			cleaned.WriteRune(c)
		}
	}

	return cleaned.String()
}

func isPalindrome(s string) bool {
	s = clean(strings.ToLower(s))

	for i, j := 0, len(s)-1; i < j; i, j = i+1, j-1 {
		if s[i] != s[j] {
			return false
		}
	}

	return true
}
