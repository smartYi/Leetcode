package array;

/**
 * Leetcode88: Merge Sorted Array
 * 题目：给定两个有序数组，将其merge得到新的数组，依然有序。假设其中一个数组有足够空间容纳merge后的数字。
 * 思路：开辟新空间固然可以；但更好的方法是原地merge。原地merge的方法是从后往前比较，遇到大的就存入。
 * 
 * @author qiuyi
 *
 */
public class solution88 {
	public void sortedMerge(int[] des, int[] src, int length) {
		int newLength = length - 1;
		int size = des.length - 1;
		int index = src.length - 1;
		while (index >= 0) {
			if (src[index] > des[newLength]) {
				des[size] = src[index];
				index--;
				size--;
			} else {
				des[size] = des[newLength];
				newLength--;
				size--;
			}
		}
		return;
	}
}
