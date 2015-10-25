package linkedlist;

/**
 * Leetcode203: Remove Linked List Elements. Problem: Remove all elements from a
 * linked list of integers that have value val. Idea: Iterate the linkedlist and
 * delete the node with the value of val.
 * 
 * @author qiuyi
 *
 */
public class solution203 {
	public ListNode removeElements(ListNode head, int val) {
		if (head == null)
			return null;
		while (head != null) {
			if (head.val == val)
				head = head.next;
			else
				break;
		}
		ListNode cur = head;
		ListNode prev = head;
		while (cur != null) {
			if (cur.val == val) {
				prev.next = cur.next;
				cur = cur.next;
			} else {
				prev = cur;
				cur = cur.next;
			}
		}
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
