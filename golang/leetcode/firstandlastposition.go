/*
Problem:
- Given an array of integers nums sorted in ascending order,
  find the starting and ending position of a given target value.
  If target is not found in the array, return [-1, -1].

Example:
- Input: nums = [5,7,7,8,8,10], target = 8
  Output: [3,4]

- Input: nums = [5,7,7,8,8,10], target = 6
  Output: [-1,-1]

- Input: nums = [], target = 0
  Output: [-1,-1]

Link:
- https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
*/

package leetcode

func searchRange(nums []int, target int) []int {
	first, last := -1, -1

	for i := range nums {
		if nums[i] == target {
			last = i
			if first == -1 {
				first = i
			}
		}
	}

	return []int{first, last}
}
