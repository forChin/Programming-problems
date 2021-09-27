/*
Problem:
- Given an array of integers, return indices of the two numbers such that they
  add up to a specific target.
- You may assume that each input would have exactly one solution, and you may
  not use the same element twice.

Example:
- Input: nums = []int{2, 5, 4}, target = 6
  Output: [0, 2] since nums[0] + nums[2] = 2 + 4 = 6

Cost:
- O(n) time.

Link:
- https://leetcode.com/problems/two-sum/
*/

package leetcode

func twoSum(nums []int, target int) []int {
	stat := make(map[int]int)
	for i, v := range nums {
		if n, ok := stat[target-v]; ok {
			return []int{i, n}
		}

		stat[v] = i
	}

	return []int{0, 0}
}
