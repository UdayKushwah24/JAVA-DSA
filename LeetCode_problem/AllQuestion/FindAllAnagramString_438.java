package Leetcode.AllQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramString_438 {

	public static boolean isAnagram(String s, String t) {
		char[] chararray_s = s.toCharArray();
		Arrays.sort(chararray_s);
		char[] chararray_t = t.toCharArray();
		Arrays.sort(chararray_t);

		s = new String(chararray_s);
		t = new String(chararray_t);
		return s.equals(t);
	}

	public static List<Integer> findAnagrams(String s, String p) {
		List<Integer> ll = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i ; j < s.length(); j++) {
				String str = s.substring(i, j + 1);
				 
				if (isAnagram(str, p)) {
					ll.add(i);
				}
			}
		}
		return ll;
	}

	public static void main(String[] args) {
		// String s = "abab", p = "ab";
		String s = "acdcaeccde", p = "c";
		// String s = "cbaebabacd", p = "abc";
		System.out.println(findAnagrams(s, p));
	}
}
