package interviewcake

import (
	"reflect"
	"testing"
)

func TestMergeMeetings(t *testing.T) {
	tests := []struct {
		in       []meeting
		expected []meeting
	}{
		{[]meeting{}, []meeting{}},
		{[]meeting{{1, 2}}, []meeting{{1, 2}}},
		{[]meeting{{1, 2}, {2, 3}}, []meeting{{1, 3}}},
		{[]meeting{{1, 5}, {2, 3}}, []meeting{{1, 5}}},
		{[]meeting{{1, 2}, {4, 5}}, []meeting{{1, 2}, {4, 5}}},
		{[]meeting{{1, 5}, {2, 3}, {4, 5}}, []meeting{{1, 5}}},
		{[]meeting{{1, 2}, {2, 3}, {4, 5}}, []meeting{{1, 3}, {4, 5}}},
		{[]meeting{{1, 6}, {2, 3}, {4, 5}}, []meeting{{1, 6}}},
		{[]meeting{{4, 5}, {2, 3}, {1, 6}}, []meeting{{1, 6}}},
	}

	for _, tt := range tests {
		result := mergeMeetings(tt.in)
		if !reflect.DeepEqual(tt.expected, result) {
			t.Errorf("got %v, wanted %v", result, tt.expected)
		}
	}
}
