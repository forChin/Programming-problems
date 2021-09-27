package leetcode

import (
	"reflect"
	"testing"
)

func TestIsPalindrome(t *testing.T) {
	tests := []struct {
		in       string
		expected bool
	}{
		{"A man, a plan, a canal: Panama", true},
		{"race a car", false},
	}

	for _, tt := range tests {
		result := isPalindrome(tt.in)
		if !reflect.DeepEqual(tt.expected, result) {
			t.Errorf("got %v, wanted %v", result, tt.expected)
		}
	}
}
