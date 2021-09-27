package leetcode

import (
	"reflect"
	"testing"
)

func TestTwoSum(t *testing.T) {
	tests := []struct {
		in1      []int
		in2      int
		expected []int
	}{
		{[]int{}, 6, []int{0, 0}},
		{[]int{1}, 6, []int{0, 0}},
		{[]int{2, 4}, 6, []int{1, 0}}, // result order is not important
		{[]int{2, 5}, 6, []int{0, 0}},
		{[]int{2, 5, 4}, 6, []int{2, 0}},
		{[]int{2, 5, 8}, 6, []int{0, 0}},
	}

	for _, tt := range tests {
		result := twoSum(tt.in1, tt.in2)
		if !reflect.DeepEqual(tt.expected, result) {
			t.Errorf("got %v, wanted %v", result, tt.expected)
		}
	}
}
