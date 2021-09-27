/*
Problem:
- Given a list of string, reverse its order in place.

Example:
- Input: []string{"a", "b", "c", "d"}
  Output: []string{"d", "c", "b", "a"}

Cost:
- O(n) time, O(1) space.
*/

package interviewcake

func reverseString(s []string) []string {
	for i, j := 0, len(s)-1; i < j; i, j = i+1, j-1 {
		s[i], s[j] = s[j], s[i]
	}

	return s
}
