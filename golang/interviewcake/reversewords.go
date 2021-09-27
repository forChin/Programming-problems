/*
Problem:
- Given a list of string that is made up of word but in reverse, return the
  correct order in-place.

Example:
- Input: []string{"w", "o", "r", "l", "d", "", "h", "e", "l", "l", "o", "", "s", "a", "y"}
  Output: []string{"s", "a", "y", "", "h", "e", "l", "l", "o", "", "w", "o", "r", "l", "d"}

Cost:
- O(n) time, O(1) space.
*/

package interviewcake

func reverse(a []string) {
	for i, j := 0, len(a)-1; i < j; i, j = i+1, j-1 {
		a[i], a[j] = a[j], a[i]
	}
}

func reverseWords(words []string) []string {
	// Reverse slice to place words in right order (not chars).
	// Chars are not in right order, but words are.
	reverse(words)

	var start int
	for i := range words {
		if words[i] == "" {
			// now place all chars of each word in right order
			word := words[start:i]
			reverse(word)

			start = i + 1
		}
	}

	reverse(words[start:]) // last word

	return words
}
