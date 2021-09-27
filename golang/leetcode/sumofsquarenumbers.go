/*
Problem:
- Given a non-negative integer c, decide whether there're
  two integers a and b such that a2 + b2 = c.

Example:
- Input: c = 5
  Output: true
  Explanation: 1 * 1 + 2 * 2 = 5

Link:
- https://leetcode.com/problems/sum-of-square-numbers/
*/

package leetcode

import (
	"math"
)

func judgeSquareSum(c int) bool {
	stat := map[int]struct{}{}
	for i := 0; i <= int(math.Sqrt(float64(c))); i++ {
		if _, ok := stat[c-i*i]; ok || i*i+i*i == c {
			return true
		}
		stat[i*i] = struct{}{}
	}

	return false
}
