package Leetcode.AllQuestion;

public class CountHomoGenousString_1759 {
	 


	public static int countHomogenous(String s) {
		 
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			int c = 1;
			while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
				c++;
				i++;
			}
			count += (c * (c + 1)) / 2;
		}
		return count;
	}
	public static void main(String[] args) {
		String s = "abbcccaa";
		System.out.println(countHomogenous(s));
	}
}
