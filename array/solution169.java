package array;

/**
 * Leetcode169: Majority Element 题目：给定数组，找出数组中的最主要元素。假设最主要元素的个数大于数组长度的一半。
 * 思路：由于最主要元素的个数大于数组长度的一半，可以用一个变量count来存储当前数字的个数。
 * 如遇见相同的，count加1，不同的就减1，如果count为0，则证明最主要元素到目前为止个数未占优势，在剩余的数组中 最主要元素还是最主要的。
 * 
 * @author qiuyi
 *
 */
public class solution169 {
	public int majorityElement(int[] nums) {
		int result = 0;
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (count == 0) {
				result = nums[i];
				count = 1;
			} else if (result == nums[i]) {
				count++;
			} else {
				count--;
			}
		}
		return result;
	}
}
