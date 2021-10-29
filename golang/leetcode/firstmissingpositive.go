/*
Problem:
- Given an unsorted integer array nums, return the
  smallest missing positive integer. You must implement an algorithm that
  runs in O(n) time and uses constant extra space.

Example:
- Input: nums = [1,2,0]
  Output: 3

- Input: nums = [3,4,-1,1]
  Output: 2

- Input: nums = [7,8,9,11,12]
  Output: 1

Link:
- https://leetcode.com/problems/first-missing-positive/
*/

package leetcode

func firstMissingPositive(nums []int) int {
	stat := map[int]struct{}{}

	for _, n := range nums {
		if n > 0 {
			stat[n] = struct{}{}
		}
	}

	var i int
	for i = 1; i <= len(stat); i++ {
		if _, ok := stat[i]; !ok {
			return i
		}
	}

	return i
}
