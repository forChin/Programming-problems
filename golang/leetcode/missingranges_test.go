package leetcode

import (
	"reflect"
	"testing"
)

func TestFindMissingRanges(t *testing.T) {
	tests := []struct {
		in       []int
		expected []string
	}{
		{[]int{}, []string{}},
		{[]int{6}, []string{"0-5", "7-99"}},
		{[]int{0, 6}, []string{"1-5", "7-99"}},
		{[]int{6, 99}, []string{"0-5", "7-98"}},
		{[]int{0, 6, 6, 6, 99}, []string{"1-5", "7-98"}},
		{[]int{6, 16, 66}, []string{"0-5", "7-15", "17-65", "67-99"}},
		{[]int{1, 3, 50, 75, 98}, []string{"0", "2", "4-49", "51-74", "76-97", "99"}},
	}

	for _, tt := range tests {
		result := findMissingRanges(tt.in)
		if !reflect.DeepEqual(tt.expected, result) {
			t.Errorf("got %v, wanted %v", result, tt.expected)
		}
	}
}
