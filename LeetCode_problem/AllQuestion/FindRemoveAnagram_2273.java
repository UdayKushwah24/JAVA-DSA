package Leetcode.AllQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindRemoveAnagram_2273 {
	public static String Sort(String str) {
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		return new String(arr);
	}

	public static List<String> removeAnagrams(String[] words) {
		List<String> list = new ArrayList<>();
		String[] temp = new String[words.length];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = Sort(words[i]);
		}

		for (int i = 0; i < temp.length; i++) {
			if (!list.contains(temp[i])) {
				list.add(temp[i]);
			}
		}
		return list;
	}

	public static void main(String[] args) {
		String[] words = { "abba", "baba", "bbaa", "cd", "cd" };
		System.out.println(removeAnagrams(words));
	}
}
