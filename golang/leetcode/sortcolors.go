/*
Problem:
- Given an array nums with n objects colored red, white, or blue,
  sort them in-place so that objects of the same color are adjacent,
  with the colors in the order red, white, and blue.
  We will use the integers 0, 1, and 2 to represent the
  color red, white, and blue, respectively.

Example:
- Input: nums = [2,0,2,1,1,0]
  Output: [0,0,1,1,2,2]

- Input: nums = [2,0,1]
  Output: [0,1,2]

- Input: nums = [0]
  Output: [0]

- Input: nums = [1]
  Output: [1]

Link:
- https://leetcode.com/problems/sort-colors/
*/

package leetcode

func sortColors(nums []int) {
	m := [3]int{}

	for _, n := range nums {
		switch n {
		case 0:
			m[0]++
		case 1:
			m[1]++
		case 2:
			m[2]++
		}
	}

	var pos int
	for i, v := range m {
		for j := 0; j < v; j++ {
			nums[pos] = i
			pos++
		}
	}
}
