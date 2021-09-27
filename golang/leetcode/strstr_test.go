package leetcode

import (
	"reflect"
	"testing"
)

func TestStrStr(t *testing.T) {
	tests := []struct {
		in1      string
		in2      string
		expected int
	}{
		{"", "", 0},
		{"", "a", -1},
		{"dani", "a", 1},
		{"danidani", "a", 1},
		{"xxxdani", "dani", 3},
		{"xxxdanixxx", "dani", 3},
		{"aaaaaaaaaaaa", "xxx", -1},
	}

	for _, tt := range tests {
		result := strStr(tt.in1, tt.in2)
		if !reflect.DeepEqual(tt.expected, result) {
			t.Errorf("got %v, wanted %v", result, tt.expected)
		}
	}
}
