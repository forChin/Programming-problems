/*
Problem:
- Given a sorted integer array where the range of elements are [0, 99] inclusive,
  return its missing ranges.

Example:
- Input: []int{0, 1, 6, 16, 66, 99}
  Output: []string{"2-5", "7-15", "17-65", "67-98"}
- Input: []int{6, 16, 66}
  Output: []string{"0-5", "7-15", "17-65", "67-99"}

Cost:
- O(n) time.

Link:
- https://leetcode.com/problems/missing-ranges/
*/

package leetcode

import (
	"fmt"
	"strconv"
)

func findMissingRanges(list []int) []string {
	out := []string{}
	start, end := 0, 99

	if len(list) == 0 {
		return out
	}

	for i := range list {
		curr := list[i]
		if i < len(list)-1 && curr == list[i+1] {
			continue
		}

		if curr == start {
			start++
		} else {
			out = append(out, getRange(start, curr-1))
			start = curr + 1
		}
	}

	if start <= end {
		out = append(out, getRange(start, end))
	}

	return out
}

func getRange(n1, n2 int) string {
	if n1 == n2 {
		return strconv.Itoa(n1)
	}
	return fmt.Sprintf("%d-%d", n1, n2)
}
