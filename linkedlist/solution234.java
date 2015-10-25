package linkedlist;

/**
 * Leetcode234: Palindrome Linked List
 * Problem: Given a singly linked list, determine if it is a palindrome.
 * Idea: First find the middle element of the linkedlist and reverse the later part and compare.
 * @author qiuyi
 *
 */
public class solution234 {
	public boolean isPalindrome(ListNode head) {
        if(head == null||head.next == null) return true;
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next!=null&&fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode last = slow.next;
        ListNode prev = null;
        while(last!=null){
            ListNode next = last.next;
            last.next = prev;
            prev = last;
            last = next;
        }
        while(head!=null&&prev!=null){
            if(head.val!=prev.val) return false;
            else{
                head = head.next;
                prev = prev.next;
            }
        }
        return true;
    }
	
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
