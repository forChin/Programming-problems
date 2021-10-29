package leetcode

import (
	"reflect"
	"testing"
)

func TestSingleNumber(t *testing.T) {
	tests := []struct {
		in       []int
		expected int
	}{
		{
			in:       []int{2, 2, 1},
			expected: 1,
		},
		{
			in:       []int{4, 1, 2, 1, 2},
			expected: 4,
		},
		{
			in:       []int{1},
			expected: 1,
		},
	}

	for _, tt := range tests {
		result := singleNumber(tt.in)
		if !reflect.DeepEqual(tt.expected, result) {
			t.Errorf("got %v, wanted %v", result, tt.expected)
		}
	}
}
