package Leetcode.AllQuestion;

public class NumberOfSubStrings_1513 {
	public static int numSub(String s) {
		long ans = 0;
		for (int i = 0; i < s.length(); i++) {
			int c = 0;
			while (i < s.length() && s.charAt(i) == '1') {
				i++;
				c++;
			}
			ans += (c * (c + 1)) / 2;
			 
		}
		return (int)ans;
	}
	public static void main(String[] args) {
		String s = "0110111";
		System.out.println(numSub(s));
	}
}
