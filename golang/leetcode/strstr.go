/*
Problem:
- Implement strstr() that finds the first occurrence of the substring
  needle in the string haystack. It returns -1 if needle is not part of the
  haystack.

Example:
- Input: haystack = "aaabacd", needle = "ba"
  Output: 3, because needle "ba" starts at index 3 in the haystack.

Cost:
- O(nm) time, O(1) space, where n is the length of haystack while m is the
  length of needle.

Link:
- https://leetcode.com/problems/implement-strstr/
*/

package leetcode

func strStr(haystack, needle string) int {
	n := len(needle)
	if n == 0 {
		return 0
	}

	for i := 0; i <= len(haystack)-n; i++ {
		if haystack[i:i+n] == needle {
			return i
		}
	}

	return -1
}
