package linkedlist;

import java.util.*;

/**
 * Leetcode160: Intersection of Two Linked Lists
 * Problem: Write a program to find the node at which the intersection of two singly linked lists begins.
 * Remember what specific intersection means, reference or value.
 * Idea: 1. Using a hashset and find the intersection of two linkedlists.
 * 2. First make the two linkedlist start from the same point and compare.
 * @author qiuyi
 *
 */
public class solution160 {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null||headB == null) return null;
        if (headA.val == headB.val) return headA;
        HashSet<Integer>set = new HashSet<Integer>();
        while(headA!=null){
            set.add(headA.val);
            headA = headA.next;
        }
        while(headB!=null){
            if(set.add(headB.val)) headB = headB.next;
            else return headB;
        }
        return null;
    }
	
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
