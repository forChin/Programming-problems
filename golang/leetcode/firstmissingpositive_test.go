package leetcode

import (
	"reflect"
	"testing"
)

func TestFindFirstMissingPositive(t *testing.T) {
	tests := []struct {
		in       []int
		expected int
	}{
		{
			in:       []int{1, 2, 0},
			expected: 3,
		},
		{
			in:       []int{3, 4, -1, 1},
			expected: 2,
		},
		{
			in:       []int{7, 8, 9, 11, 12},
			expected: 1,
		},
	}

	for _, tt := range tests {
		result := firstMissingPositive(tt.in)
		if !reflect.DeepEqual(tt.expected, result) {
			t.Errorf("got %v, wanted %v", result, tt.expected)
		}
	}
}
