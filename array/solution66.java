package array;

/**
 * Leetcode66: Plus one. 题目：给定一个数组，这个数组表示一个数字，且最高位在数组的头部，即0的位置。将这个数加1，并且返回新数组。
 * 思路：从数字最低位即数组最后面开始加1，若原数组的值为9，设置新数组当前值为0，直到当前数组值不为9，加1跳出即可。
 * 最后要判定数组最高位是否为0，若为0，则有进位到更高一位，需开辟新空间存储最高位数字1. 返回新数组即可。
 * 
 * @author qiuyi
 *
 */
public class solution66 {
	public int[] plusOne(int[] digits) {
		int length = digits.length - 1;
		for (int i = length; i >= 0; i--) {
			if (digits[i] != 9) {
				digits[i]++;
				break;
			} else {
				digits[i] = 0;
			}
		}
		if (digits[0] == 0) {
			int[] newDigits = new int[digits.length + 1];
			newDigits[0] = 1;
			for (int i = 0; i < digits.length; i++) {
				newDigits[i + 1] = digits[i];
			}
			return newDigits;
		}
		return digits;
	}
}
