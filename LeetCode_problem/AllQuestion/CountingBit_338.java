package Leetcode.AllQuestion;

public class CountingBit_338 {
	/* 	public static int countBits(int n) {
		int count1 = 0;
		while (n > 0) {
			int rem = n % 2;
			if (rem == 1) {
				count1 += 1;

			}
			n /= 2;
		}
		return count1;
	}
	public static void main(String[] args) {
		int n = 5;
		int[] ans = new int[n + 1];
		ans[0] = 0;
		for (int i = 1; i <= n; i++) {
			ans[i] = countBits(i);
		}
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
	} */

	public static void main(String[] args) {
		int n = 5;
		int[] ans = new int[n + 1];
		ans[0] = 0;
		for (int i = 1; i <= n; i++) {
			int temp = i;
			int count1 = 0;
			while (temp > 0) {
				int rem = temp % 2;
				if (rem == 1) {
					count1 += 1;

				}
				temp /= 2;
			}
			ans[i] = count1;
		}
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}
}
