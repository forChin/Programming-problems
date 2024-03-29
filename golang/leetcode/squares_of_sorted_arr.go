/*
Problem:
- Given an integer array nums sorted in non-decreasing order,
  return an array of the squares of each number sorted in non-decreasing order.

Example:
- Input: nums = [-4,-1,0,3,10]
  Output: [0,1,9,16,100]
  Explanation: After squaring, the array becomes [16,1,0,9,100].
  After sorting, it becomes [0,1,9,16,100].


- Input: nums = [-7,-3,2,3,11]
  Output: [4,9,9,49,121]

Link:
- https://leetcode.com/problems/squares-of-a-sorted-array/
*/

package leetcode

func sortedSquares(nums []int) []int {
	result := make([]int, len(nums))

	i := 0
	j := len(nums) - 1
	for k := len(nums) - 1; k >= 0; k-- {
		if abs(nums[j]) > abs(nums[i]) {
			result[k] = nums[j] * nums[j]
			j--
		} else {
			result[k] = nums[i] * nums[i]
			i++
		}
	}

	return result
}

func abs(n int) int {
	if n < 0 {
		return n * -1
	}
	return n
}
