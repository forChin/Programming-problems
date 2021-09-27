/*
Problem:
- Given an array nums of n integers where
  nums[i] is in the range [1, n], return an array of
  all the integers in the range [1, n] that do not appear in nums.

Example:
- Input: nums = [4,3,2,7,8,2,3,1]
  Output: [5,6]

- Input: nums = [1,1]
  Output: [2]

Link:
- https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
*/

package leetcode

func findDisappearedNumbers(nums []int) []int {
	stat := map[int]struct{}{}
	for _, v := range nums {
		stat[v] = struct{}{}
	}

	var res []int
	for i := 1; i <= len(nums); i++ {
		if _, ok := stat[i]; !ok {
			res = append(res, i)
		}
	}

	return res
}
