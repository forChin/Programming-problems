package leetcode

import (
	"reflect"
	"testing"
)

func TestCheckIfPangram(t *testing.T) {
	tests := []struct {
		in       string
		expected bool
	}{
		{
			in:       "thequickbrownfoxjumpsoverthelazydog",
			expected: true,
		},
		{
			in:       "leetcode",
			expected: false,
		},
	}

	for _, tt := range tests {
		result := checkIfPangram(tt.in)
		if !reflect.DeepEqual(tt.expected, result) {
			t.Errorf("got %v, wanted %v", result, tt.expected)
		}
	}
}
