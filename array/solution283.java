package array;

/**
 * Leetcode283: Move Zeroes 题目：给定数组，将数组中第0移到数组最右边。且其他非0元素保持原来数组中的相对位置。
 * 思路：遍历数组，遇到非0数，则摆放到数组中。最后将后面所有元素设为0.原地即可。
 * 
 * @author qiuyi
 *
 */
public class solution283 {
	public void moveZeroes(int[] nums) {
		int length = nums.length;
		int i;
		int j = 0;
		for (i = 0; i < length; i++) {
			if (nums[i] != 0) {
				nums[j] = nums[i];
				j++;
			}
		}
		while (j < length) {
			nums[j++] = 0;
		}
	}
}
