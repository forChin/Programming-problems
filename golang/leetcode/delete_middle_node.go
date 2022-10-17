/*
Link:
- https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
*/

package leetcode

func deleteMiddle(head *ListNode) *ListNode {
	if head.Next == nil {
		return nil
	}

	var prev *ListNode
	slow, fast := head, head
	for fast != nil && fast.Next != nil {
		prev = slow
		slow = slow.Next
		fast = fast.Next.Next
	}

	prev.Next = slow.Next

	return head
}
