package array;

/**
 * Leetcode27: Remove elements 题目：给定一个数和一个数组，删除这个数组中的这个数，然后返回新数组的长度。 思路：遍历数组即可
 * 原地即可，无需开辟新空间。
 * @author qiuyi
 *
 */
public class solution27 {
	public int removeElement(int[] nums, int val) {
		int i = 0;
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != val) {
				nums[i++] = nums[j];
			}
		}
		return i;
	}
}
