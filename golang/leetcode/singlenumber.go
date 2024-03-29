/*
Problem:
- Given a non-empty array of integers nums,
  every element appears twice except for one.
  Find that single one.

  You must implement a solution with a linear
  runtime complexity and use only constant extra space.

Example:
- Input: nums = [2,2,1]
  Output: 1

- Input: nums = [4,1,2,1,2]
  Output: 4

- Input: nums = [1]
  Output: 1

Link:
- https://leetcode.com/problems/single-number/
*/

package leetcode

func singleNumber(nums []int) int {
	var result int
	for _, num := range nums {
		result ^= num
	}
	return result
}
