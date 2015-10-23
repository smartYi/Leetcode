package array;

import java.util.*;
/**
 * Leetcode 228: Summary ranges.
 * 题目的原意在于给定一个不含duplicates定有序数组，找出其中的连续有序区间。
 * 思路很简单，两个指针，一个指向start，一个指向end。若start和end位置所存储的数据之差
 * 和它俩之间距离不同，就要输出一个区间。若start和end相同，则这个区间不存在剪头表示。 每次计算完一个区间后，更新start。
 * 
 * @author qiuyi
 *
 */
public class solution228 {
	public List<String> summaryRanges(int[] nums) {
		int length = nums.length;
		List<String> result = new ArrayList<String>();
		if (length == 0)
			return result;
		if ((nums[length - 1] - nums[0] + 1) == length) {
			if (length != 1) {
				result.add(nums[0] + "->" + nums[length - 1]);
				return result;
			} else {
				result.add(nums[0] + "");
				return result;
			}
		}

		int index = 0;
		String temp = String.valueOf(nums[index]);
		for (int i = 0; i < length; i++) {
			if (nums[index] + (i - index) != nums[i]) {
				if ((index + 1) == i) {
					result.add(temp);
					index = i;
					temp = "" + nums[index];
				} else {
					temp = temp + "->" + nums[i - 1];
					result.add(temp);
					index = i;
					temp = "" + nums[index];
				}
			}
		}
		if (index == length - 1) {
			result.add(temp);
		} else {
			result.add(nums[index] + "->" + nums[length - 1]);
		}
		return result;
	}

}
