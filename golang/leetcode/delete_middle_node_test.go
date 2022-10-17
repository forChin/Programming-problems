package leetcode

import (
	"reflect"
	"testing"
)

func TestDeleteMiddle(t *testing.T) {
	tests := []struct {
		in       *ListNode
		expected *ListNode
	}{
		{
			in:       toLinkedList([]int{1, 3, 4, 7, 1, 2, 6}),
			expected: toLinkedList([]int{1, 3, 4, 1, 2, 6}),
		},
		{
			in:       toLinkedList([]int{1, 2, 3, 4}),
			expected: toLinkedList([]int{1, 2, 4}),
		},
		{
			in:       toLinkedList([]int{2, 1}),
			expected: toLinkedList([]int{2}),
		},
	}

	for _, tt := range tests {
		result := deleteMiddle(tt.in)
		if !reflect.DeepEqual(tt.expected, result) {
			t.Errorf("got %v, wanted %v", result, tt.expected)
		}
	}
}

func toLinkedList(arr []int) *ListNode {
	if len(arr) == 0 {
		return nil
	}

	head := &ListNode{
		Val: arr[0],
	}
	curr := head
	for i := 1; i < len(arr); i++ {
		curr.Next = &ListNode{
			Val: arr[i],
		}

		curr = curr.Next
	}

	return head
}
