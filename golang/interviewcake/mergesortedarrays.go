/*
Problem:
- Merge two sorted arrays.

Example:
- Input: []int{1, 3, 5}, []int{2, 4, 6}
  Output: []int{1, 2, 3, 4, 5, 6}
- Input: []int{1, 3, 5}, []int{2, 4, 6, 7}
  Output: []int{1, 2, 3, 4, 5, 6, 7},

*/
package interviewcake

func mergeSortedArrays(a, b []int) []int {
	if len(a) < 1 {
		return b
	}
	if len(b) < 1 {
		return a
	}

	less, bigger := b, a
	if a[0] < b[0] {
		less, bigger = a, b
	}

	return append([]int{less[0]}, mergeSortedArrays(less[1:], bigger)...)
}
