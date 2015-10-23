package array;

import java.util.*;
/**
 * Leetcode118：Pascal's Triangle 题目：给定一个数字，最后输出pascal 三角形
 * 思路：本题为实现题，观察pascal三角形规律即可。
 * 
 * @author qiuyi
 *
 */
public class solution118 {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> list = new LinkedList<>();
		if (numRows == 0)
			return list;

		List<Integer> prev = new LinkedList<>();
		prev.add(1);
		list.add(prev);
		for (int i = 2; i <= numRows; i++) {
			List<Integer> layer = new LinkedList<>();
			for (int j = 0; j < i; j++) {
				if (j == 0)
					layer.add(1);
				else if (j == (i - 1))
					layer.add(1);
				else
					layer.add((int) prev.get(j - 1) + (int) prev.get(j));
			}
			list.add(layer);
			prev = layer;
		}
		return list;
	}
}
