package array;

/**
 * Leetcode26:Remove Duplicates from Sorted Array
 * 题目：给定有序数组，删除数组中的duplicates，并且保留一个。返回新数组长度。 原地完成。
 * 思路：初始化一个比较基准，每次遇到不同的数字，更新当前的基准即可。
 * 
 * @author qiuyi
 *
 */
public class solution26 {
	public int removeDuplicates(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		int LastCheck = nums[0];
		int index = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != LastCheck) {
				LastCheck = nums[i];
				nums[index] = LastCheck;
				index++;
			}
		}
		return index;
	}
}
