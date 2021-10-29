/*
Problem:
- Given an integer array sorted in non-decreasing order,
  there is exactly one integer in the array that occurs more
  than 25% of the time, return that integer.

Example:
- Input: arr = [1,2,2,6,6,6,6,7,10]
  Output: 6

- Input: arr = [1,1]
  Output: 1

Link:
- https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/
*/

package leetcode

func findSpecialInteger(arr []int) int {
	var count int
	for i := 0; i < len(arr); i++ {
		if i == 0 || arr[i] == arr[i-1] {
			count++
			if count > len(arr)/4 {
				return arr[i]
			}
			continue
		}
		count = 1
	}

	return -1
}
