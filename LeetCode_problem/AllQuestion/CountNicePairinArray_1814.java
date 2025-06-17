package Leetcode.AllQuestion;

public class CountNicePairinArray_1814 {

	public static int Reverse(int n) {
		int rev = 0;
		while (n > 0) {
			int last = n % 10;
			rev = rev * 10 + last;
			n /= 10;
		}
		return rev;
	}

	public static int countNicePairs(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (Reverse(nums[i]) + nums[j] == Reverse(nums[j]) + nums[i]) {
					count++;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// int[] nums = { 42, 11, 1, 97 }; // 2
		int[] nums = { 13, 10, 35, 24, 76 }; // 4
		System.out.println(countNicePairs(nums));
	}
}
