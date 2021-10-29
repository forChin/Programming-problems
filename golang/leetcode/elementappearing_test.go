package leetcode

import (
	"reflect"
	"testing"
)

func TestFindSpecialInteger(t *testing.T) {
	tests := []struct {
		in       []int
		expected int
	}{
		{
			in:       []int{1, 2, 2, 6, 6, 6, 6, 7, 10},
			expected: 6,
		},
		{
			in:       []int{1, 1},
			expected: 1,
		},
		{
			in:       []int{3},
			expected: 3,
		},
	}

	for _, tt := range tests {
		result := findSpecialInteger(tt.in)
		if !reflect.DeepEqual(tt.expected, result) {
			t.Errorf("got %v, wanted %v", result, tt.expected)
		}
	}
}
