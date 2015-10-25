package linkedlist;

/**
 * Leetcode19: Remove Nth Node From End of List Problem: Given a linked list,
 * remove the nth node from the end of list and return its head. Idea: First get
 * the length of the linked list and then delte it. Remember considering all the
 * boundary condition.
 * 
 * @author qiuyi
 *
 */
public class solution19 {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (head == null)
			return null;
		if (n <= 0)
			return head;

		int length = 0;
		int target;
		int index = 1;
		ListNode pre = null;
		ListNode cur = head;
		ListNode temp = head;
		while (temp != null) {
			length++;
			temp = temp.next;
		}
		target = length - n + 1;
		if (length == n) {
			if (length == 1)
				return null;
			else {
				head = head.next;
				return head;
			}
		}
		while (index != target) {
			pre = cur;
			cur = cur.next;
			index++;
		}
		pre.next = cur.next;
		return head;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
