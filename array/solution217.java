package array;

import java.util.*;
/**
 * Leetcode217: Contains Duplicate 题目：判定一个数组是否含有duplicates
 * 思路：用hashset，若添加不成功，则证明存在duplicates
 * 
 * @author qiuyi
 *
 */
public class solution217 {
	public boolean containsDuplicate(int[] nums) {
		if (nums == null || nums.length == 0)
			return false;
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i : nums)
			if (!set.add(i)) {
				return true;
			}
		return false;
	}
}
