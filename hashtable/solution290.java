package hashtable;

import java.util.HashMap;
/**
 * Leetcode202: Word pattern. 题目： 给定一个字符串和一串以空格隔开定单词，判定字符串定pattern和单词pattern是否一致
 * 比如： "abba" "cat dog dog cat"是一样定pattern； 而"abba" 和 "cat dog cat dog"
 * 不是一样的pattern。 思路： 做两次hashmap，
 * 第一次用字符串里面的char作为key，单词作为value；第二次用value作为key，char作为value。
 * 两次hashmap若都成功，则返回true，否则就是false。
 * 
 * @author qiuyi
 *
 */
public class solution290 {
	public boolean wordPattern(String pattern, String str) {
		return helper1(pattern, str) && helper2(pattern, str);
	}

	public boolean helper1(String pattern, String str) {
		HashMap<Character, String> char2str = new HashMap<Character, String>();
		int length1 = pattern.length();
		String[] strArray = str.split(" ");
		int length2 = strArray.length;
		if (length1 != length2)
			return false;
		for (int i = 0; i < length1; i++) {
			if (char2str.containsKey(pattern.charAt(i))) {
				if (!char2str.get(pattern.charAt(i)).equals(strArray[i]))
					return false;
			} else {
				char2str.put(pattern.charAt(i), strArray[i]);
			}
		}
		return true;
	}

	public boolean helper2(String pattern, String str) {
		HashMap<String, Character> str2char = new HashMap<String, Character>();
		int length1 = pattern.length();
		String[] strArray = str.split(" ");
		int length2 = strArray.length;
		if (length1 != length2)
			return false;
		for (int i = 0; i < length1; i++) {
			if (str2char.containsKey(strArray[i])) {
				if (str2char.get(strArray[i]) != pattern.charAt(i))
					return false;
			} else {
				str2char.put(strArray[i], pattern.charAt(i));
			}
		}
		return true;
	}
}
