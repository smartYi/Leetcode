package hashtable;

import java.util.*;

/**
 * Leetcode202: Happy number Problem:A happy number is a number defined by the
 * following process: Starting with any positive integer, replace the number by
 * the sum of the squares of its digits, and repeat the process until the number
 * equals 1 (where it will stay), or it loops endlessly in a cycle which does
 * not include 1. Those numbers for which this process ends in 1 are happy
 * numbers.
 * 
 * 思路： 建立一个hashset，由题目可知，最终这个数字会陷入循环，那么如果这个循环中不含有1，显然这个数字永远不能到达1.
 * 
 * @author qiuyi
 *
 */
public class solution202 {
	private int getNext(int n) {
		int sum = 0;
		while (n > 0) {
			int temp = n % 10;
			sum += (temp * temp);
			n /= 10;
		}
		return sum;
	}

	public boolean isHappy(int n) {
		HashSet<Integer> set = new HashSet<Integer>();
		while (n != 1) {
			if (!set.add(n)) {
				return false;
			}
			set.add(n);
			n = getNext(n);
		}
		return true;
	}
}
