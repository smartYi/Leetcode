package linkedlist;

/**
 * Leetcode83: Remove Duplicates from Sorted List.
 * Problem: Given a sorted linked list, delete all duplicates such that each element appear only once.
 * Idea: Solve this problem by recursion way.
 * @author qiuyi
 *
 */
public class solution83 {
	public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)return head;
       head.next = deleteDuplicates(head.next);
       return head.val == head.next.val ? head.next : head;
   }
	
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
