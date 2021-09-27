/*
Problem:
- Given a list of unsorted, independent meetings, returns a list of a merged
  one.

Example:
- Input: []meeting{{1, 2}, {2, 3}, {4, 5}}
  Output: []meeting{{1, 3}, {4, 5}}
- Input: []meeting{{1, 5}, {2, 3}}
  Output: []meeting{{1, 5}}
*/

package interviewcake

import (
	"sort"
)

type meeting struct {
	start int
	end   int
}

func sortMeetings(ms []meeting) {
	sort.Slice(ms, func(i, j int) bool {
		return ms[i].start < ms[j].start
	})
}

func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}

func mergeMeetings(ms []meeting) []meeting {
	sortMeetings(ms)

	out := []meeting{}
	for _, i := range ms {
		if i != ms[0] && out[len(out)-1].end >= i.start {
			out[len(out)-1].end = max(out[len(out)-1].end, i.end)
		} else {
			out = append(out, i)
		}
	}

	return out
}
