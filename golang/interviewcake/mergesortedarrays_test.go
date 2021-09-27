package interviewcake

import (
	"reflect"
	"testing"
)

func TestMergeSortedArrays(t *testing.T) {
	tests := []struct {
		in1      []int
		in2      []int
		expected []int
	}{
		{
			[]int{},
			[]int{},
			[]int{},
		},
		{
			[]int{},
			[]int{1},
			[]int{1},
		},
		{
			[]int{1, 3, 5},
			[]int{2, 4, 6},
			[]int{1, 2, 3, 4, 5, 6},
		},
		{
			[]int{1, 3, 5},
			[]int{2, 4, 6, 7},
			[]int{1, 2, 3, 4, 5, 6, 7},
		},
		{
			[]int{1, 2, 3, 4, 5},
			[]int{6},
			[]int{1, 2, 3, 4, 5, 6},
		},
	}

	for _, tt := range tests {
		result := mergeSortedArrays(tt.in1, tt.in2)
		if !reflect.DeepEqual(tt.expected, result) {
			t.Errorf("got %v, wanted %v", result, tt.expected)
		}
	}
}
