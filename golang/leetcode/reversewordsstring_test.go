package leetcode

import (
	"reflect"
	"testing"
)

func TestReverseWordsString(t *testing.T) {
	tests := []struct {
		in       string
		expected string
	}{
		{"", ""},
		{"a", "a"},
		{" a", "a"},
		{"a ", "a"},
		{"b a", "a b"},
		{"c b a", "a b c"},
		{"d c b a", "a b c d"},
		{"hard so be to have not does interview coding", "coding interview does not have to be so hard"},
	}

	for _, tt := range tests {
		result := reverseWordsString(tt.in)
		if !reflect.DeepEqual(tt.expected, result) {
			t.Errorf("got %v, wanted %v", result, tt.expected)
		}
	}
}
