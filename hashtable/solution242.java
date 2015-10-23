package hashtable;

import java.util.*;
/**
 * Leetcode242: Valid Anagram 题目： check两个字符串是不是异构 思路： 排序后比较即可。
 * 
 * @author qiuyi
 *
 */
public class solution242 {
	public boolean isAnagram(String s, String t) {
		char[] sArray = s.toCharArray();
		char[] tArray = t.toCharArray();
		Arrays.sort(sArray);
		Arrays.sort(tArray);
		s = new String(sArray);
		t = new String(tArray);
		return s.equals(t);
	}
}
