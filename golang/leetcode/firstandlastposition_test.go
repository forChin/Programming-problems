package leetcode

import (
	"reflect"
	"testing"
)

func TestSearchRange(t *testing.T) {
	tests := []struct {
		in1      []int
		in2      int
		expected []int
	}{
		{[]int{}, 0, []int{-1, -1}},
		{[]int{5, 7, 7, 8, 8, 10}, 6, []int{-1, -1}},
		{[]int{5, 7, 7, 8, 8, 10}, 8, []int{3, 4}},
	}

	for _, tt := range tests {
		result := searchRange(tt.in1, tt.in2)
		if !reflect.DeepEqual(tt.expected, result) {
			t.Errorf("got %v, wanted %v", result, tt.expected)
		}
	}
}
