package leetcode

import (
	"reflect"
	"testing"
)

func TestShortestPalindrome(t *testing.T) {
	tests := []struct {
		in       string
		expected string
	}{
		{"aacecaaa", "aaacecaaa"},
		{"abcd", "dcbabcd"},
	}

	for _, tt := range tests {
		result := shortestPalindrome(tt.in)
		if !reflect.DeepEqual(tt.expected, result) {
			t.Errorf("got %v, wanted %v", result, tt.expected)
		}
	}
}
