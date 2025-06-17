package Leetcode.AllQuestion;

public class AppendCharToMakeSubS_2486 {

 
	/* public static boolean isSubsequence(String s, String t) {
		int i = 0;
		int j = 0;
		while (i < s.length() && j < t.length()) {
			if (s.charAt(i) == t.charAt(j)) {
				i++;
			}
			j++;
		}
		return i == s.length();
	}

	public static int idxTillSeq(String s, String t) {
		int i = 0;
		int j = 0;
		while (i < s.length() && j < t.length()) {
			if (s.charAt(i) == t.charAt(j)) {
				i++;
			}
			j++;
		}
		return i;
	}

	public static int appendCharacters(String s, String t) {
		if (isSubsequence(t, s)) {
			return 0;
		}

		int idx = idxTillSeq(t, s);

		return t.length() - idx;
	}

	public static void main(String[] args) {
		// String s = "coaching", t = "coding";
		String s = "z", t = "abcde";
		// System.out.println(idxTillSeq(t, s));.
		System.out.println(appendCharacters(s, t));
	}
 */



	public static int[] isSubsequence(String s, String t) {
		// the array 0th index tell that the string s is subSequence or not
		// and 1st index tells about the index till the string s is subSequence of String "t"
		int[] arr = new int[2];
		int i = 0;
		int j = 0;
		while (i < s.length() && j < t.length()) {
			if (s.charAt(i) == t.charAt(j)) {
				i++;
			}
			j++;
		}
		if (i == s.length()) {
			arr[0] = 1;
		}
		arr[1] = i;
		return arr;
		
	}

	 
	public static int appendCharacters(String s, String t) {
		int[] arr = isSubsequence(t, s);
		if (arr[0] == 1) {
			return 0;
		}
		int idx = arr[1];
		return t.length() - idx;
	}

	public static void main(String[] args) {
		// String s = "coaching", t = "coding";
		String s = "z", t = "abcde";
		// System.out.println(idxTillSeq(t, s));.
		System.out.println(appendCharacters(s, t));
	}
}
