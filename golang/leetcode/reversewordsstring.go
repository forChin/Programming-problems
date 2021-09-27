/*
Problem:
- Given a string, reverse it word by word.

Example:
- Input: "hard so be to have not does interview coding"
  Output: "coding interview does not have to be so hard"

Cost:
- O(n) time, O(n) space.

Link:
- https://leetcode.com/problems/reverse-words-in-a-string/
*/

package leetcode

import (
	"strings"
)

func reverseSlice(s []string) {
	for i, j := 0, len(s)-1; i < j; i, j = i+1, j-1 {
		s[i], s[j] = s[j], s[i]
	}
}

func reverseWordsString(s string) string {
	words := strings.Fields(s)
	reverseSlice(words)

	return strings.Join(words, " ")
}
