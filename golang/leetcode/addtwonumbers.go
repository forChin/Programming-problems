/*
Problem:
- You are given two non-empty linked lists representing
  two non-negative integers. The digits are stored in
  reverse order, and each of their nodes contains a single digit.
  Add the two numbers and return the sum as a linked list.

  You may assume the two numbers do not contain any leading zero,
  except the number 0 itself.

Example:
- Input: l1 = [2,4,3], l2 = [5,6,4]
  Output: [7,0,8]
  Explanation: 342 + 465 = 807.

- Input: l1 = [0], l2 = [0]
  Output: [0]

- Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
  Output: [8,9,9,9,0,0,0,1]

Link:
- https://leetcode.com/problems/add-two-numbers/
*/

package leetcode

type ListNode struct {
	Val  int
	Next *ListNode
}

func addTwoNumbers(l1 *ListNode, l2 *ListNode) *ListNode {
	l3 := ListNode{}
	ptr := &l3
	carry := 0
	for {
		sum := carry
		carry = 0
		if l1 != nil {
			sum += l1.Val
			l1 = l1.Next
		}
		if l2 != nil {
			sum += l2.Val
			l2 = l2.Next
		}

		if sum >= 10 {
			carry = 1
			sum %= 10
		}

		ptr.Val = sum
		if l1 == nil && l2 == nil {
			break
		}
		ptr.Next = new(ListNode)
		ptr = ptr.Next
	}
	if carry > 0 {
		ptr.Next = new(ListNode)
		ptr.Next.Val = carry
	}

	return &l3
}
