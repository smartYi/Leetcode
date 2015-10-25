package linkedlist;


/**
 * Leetcode237: Delete Node in a Linked List Problem: Write a function to delete
 * a node (except the tail) in a singly linked list, given only access to that
 * node. Idea: Since you only access to this target node, you can replace this
 * node by its next node.
 * 
 * @author qiuyi
 *
 */
public class solution237 {
	public void deleteNode(ListNode node) {
		if (node == null)
			return;
		node.val = node.next.val;
		node.next = node.next.next;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
