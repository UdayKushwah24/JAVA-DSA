package Leetcode.AllQuestion;

import java.util.ArrayList;
import java.util.List;

public class PrintWordsVertically_1324 {
	/* public static List<String> printVertically(String s) {
		List<String> ll = new ArrayList<>();
		String[] arr = s.split(" ");
		int MaxLen = 0;
		for (int i = 0; i < arr.length; i++) {
			// System.out.print(arr[i] +" ");
			if (arr[i].length() > MaxLen) {
				MaxLen = arr[i].length();
			}
		}
	
		for (int i = 0; i < MaxLen; i++) {
			String empty = "";
			for (int j = 0; j < arr.length; j++) {
				if (i < arr[j].length() && arr[j].charAt(i) >= 65 && 90 >= arr[j].charAt(i)) {
	
					empty += arr[j].charAt(i);
				} else {
					empty += " ";
				}
			}
	
			int end = empty.length() - 1;
			while (end > 0 && empty.charAt(end) == ' ') {
				end--;
			}
			// System.out.println(empty.length() - end-1); // trailing spaces
			ll.add(empty.substring(0, end + 1));
			// ll.add(empty.trim());
		}
		return ll;
	
	} */



	public static List<String> printVertically(String s) {
		List<String> ll = new ArrayList<>();
		String[] arr = s.split(" ");
		int MaxLen = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() > MaxLen) {
				MaxLen = arr[i].length();
			}
		}


		for (int i = 0; i < MaxLen; i++) {
			StringBuilder sb = new StringBuilder();
			for (String word : arr) {
				if (i < word.length()) {
					sb.append(word.charAt(i));
				} else {
					sb.append(" ");
				}
			}

			int end = sb.length()-1;
			while (end > 0 && sb.charAt(end) == ' ') {
				end--;
			}
			 
			ll.add(sb.substring(0, end+1));

		}

		return ll;
	 

	}

	public static void main(String[] args) {
		// String s = "CONTEST IS COMING";
		// String s = "HOW ARE YOU";
		String s = "TO BE OR NOT TO BE";
		List<String> ll = printVertically(s);
		// System.out.println(ll);
		for (int i = 0; i < ll.size(); i++) {
			System.out.println("\"" + ll.get(i) + "\"");
		}
	}
}
