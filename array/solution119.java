package array;

import java.util.*;
/**
 * Leetcode119: Pascal's Triangle II 题目：给定一个数字k，返回pascal三角形到第k行数字
 * 思路：实现题。观察pascal三角形规律即可。
 * 
 * @author qiuyi
 *
 */
public class solution119 {
	public List<Integer> getRow(int rowIndex) {
		List<Integer> list = new LinkedList<>();
		if (rowIndex < 0)
			return list;
		if (rowIndex == 0) {
			list.add(1);
			return list;
		}
		int m = rowIndex;
		int pre = 1;
		list.add(1);
		for (int j = 1; j <= rowIndex; j++) {
			int current = (int) Math.rint((double) pre / j * (m--));
			list.add(current);
			pre = current;
		}
		return list;
	}
}
