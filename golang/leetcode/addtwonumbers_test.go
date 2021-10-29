package leetcode

import (
	"reflect"
	"testing"
)

func TestAddTwoNumbers(t *testing.T) {
	tests := []struct {
		in1      *ListNode
		in2      *ListNode
		expected *ListNode
	}{
		{
			in1:      toListNode([]int{2, 4, 3}),
			in2:      toListNode([]int{5, 6, 4}),
			expected: toListNode([]int{7, 0, 8}),
		},
		{
			in1:      toListNode([]int{0}),
			in2:      toListNode([]int{0}),
			expected: toListNode([]int{0}),
		},
		{
			in1:      toListNode([]int{9, 9, 9, 9, 9, 9, 9}),
			in2:      toListNode([]int{9, 9, 9, 9}),
			expected: toListNode([]int{8, 9, 9, 9, 0, 0, 0, 1}),
		},
	}

	for _, tt := range tests {
		result := addTwoNumbers(tt.in1, tt.in2)
		if !reflect.DeepEqual(tt.expected, result) {
			t.Errorf("got %v, wanted %v", result, tt.expected)
		}
	}
}

// toListNode converts array to linked list and
// returns pointer to first element.
func toListNode(arr []int) *ListNode {
	var l *ListNode
	for i := len(arr) - 1; i >= 0; i-- {
		tmp := ListNode{Val: arr[i], Next: l}
		l = &tmp
	}

	return l
}
