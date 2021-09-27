package leetcode

import (
	"reflect"
	"testing"
)

func TestFindDisappearedNumbers(t *testing.T) {
	tests := []struct {
		in       []int
		expected []int
	}{
		{[]int{4, 3, 2, 7, 8, 2, 3, 1}, []int{5, 6}},
		{[]int{1, 1}, []int{2}},
	}

	for _, tt := range tests {
		result := findDisappearedNumbers(tt.in)
		if !reflect.DeepEqual(tt.expected, result) {
			t.Errorf("got %v, wanted %v", result, tt.expected)
		}
	}
}
