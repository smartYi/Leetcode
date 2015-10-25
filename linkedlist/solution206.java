package linkedlist;

/**
 * Leetcode206: reverse linkedlist 题目：给出一个链表，反转链表。 思路：1.递归；
 * 2.iteration。在这里给出iteration版本，设置两个pointer，一个prev，一个last。 遍历链表反转即可。
 * 
 * @author qiuyi
 *
 */
public class solution206 {
	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode current = head;
		ListNode prev = null;
		while (current != null) {
			ListNode temp = current.next;
			current.next = prev;
			prev = current;
			current = temp;
		}
		head = prev;
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
