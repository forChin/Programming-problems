package leetcode

import (
	"reflect"
	"testing"
)

func TestJudgeSquareSum(t *testing.T) {
	tests := []struct {
		in       int
		expected bool
	}{
		{5, true},
		{3, false},
		{4, true},
		{2, true},
		{1, true},
		{6, false},
	}

	for _, tt := range tests {
		result := judgeSquareSum(tt.in)
		if !reflect.DeepEqual(tt.expected, result) {
			t.Errorf("got %v, wanted %v", result, tt.expected)
		}
	}
}
