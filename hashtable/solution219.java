package hashtable;

import java.util.*;
/**
 * Leetcode219: Contains Duplicate II
 * 题目：给定一个数组和一个数字k，找出数组中是否存在不同i和j，使得存储的之相同，但是i－j<=k。
 * 思路：用hashmap来存储数组，下标作为key，数组中的值作为value。如果value相同，则取得他们的key，若<=k
 * 返回true，否则false。
 * 
 * @author qiuyi
 *
 */
public class solution219 {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int length = nums.length;
		for (int i = 0; i < length; i++) {
			if (!map.containsKey(nums[i])) {
				map.put(nums[i], i);
			} else {
				if (i - map.get(nums[i]) <= k)
					return true;
				else
					map.put(nums[i], i);
			}
		}
		return false;
	}
}
