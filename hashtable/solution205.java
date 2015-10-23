package hashtable;

import java.util.*;
/**
 * Leetcode205: Isomorphic Strings 题目： 检查两个单词是否可以通过替换来完成转变。注意一个字符只能映射一个字符
 * 思路：这个和word pattern一样。建立两个hashmap，一个作为key，一个作为value。
 * 
 * @author qiuyi
 *
 */
public class solution205 {
	public boolean isIsomorphic(String s, String t) {
		char[] s1 = s.toCharArray();
		char[] t1 = t.toCharArray();
		HashMap<Character, Character> map1 = new HashMap<Character, Character>();
		HashMap<Character, Character> map2 = new HashMap<Character, Character>();
		for (int i = 0; i < s1.length; i++) {
			if (!map1.containsKey(s1[i])) {
				map1.put(s1[i], t1[i]);
			} else {
				if (map1.get(s1[i]) != t1[i])
					return false;
				else
					continue;
			}
		}
		for (int i = 0; i < s1.length; i++) {
			if (!map2.containsKey(t1[i])) {
				map2.put(t1[i], s1[i]);
			} else {
				if (map2.get(t1[i]) != s1[i])
					return false;
				else
					continue;
			}
		}
		return true;
	}
}
