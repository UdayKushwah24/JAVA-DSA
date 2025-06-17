package Leetcode.AllQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GoupAnagram_49 {

	public static String Sort(String str) {
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		return new String(arr);
	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> list = new ArrayList<>();
		String[] temp = new String[strs.length];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = Sort(strs[i]);
		}

		 
		for (int i = 0; i < temp.length; i++) {
			List<String> ll = new ArrayList<>();
			for (int j = i+1; j < temp.length; j++) {

				if (temp[i].equals(temp[j ])) {
					ll.add(temp[j]);
					 
				}
			}

			list.add(ll);
		}

		return list;
	}

	public static void main(String[] args) {
		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.println(groupAnagrams(strs));
	}
}
