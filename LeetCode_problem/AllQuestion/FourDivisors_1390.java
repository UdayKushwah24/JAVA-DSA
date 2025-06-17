package Leetcode.AllQuestion;

public class FourDivisors_1390 {

	public static int[] CheckFourDivisors(int n) {
		// 'ans' array index 0 kept the n has four divisor or not if have four divisorn , the second index kept the sum of diviors
		int[] ans = { 0, 0 };
		int count = 0;
		int sum = 0;
		for (int j = 1; j <= n; j++) {
			if (n % j == 0) {
				count++;
				sum += j;
			}
			if (count > 5) {
				break;
			}
		}
		if (count == 4) {
			ans[0] = 1;
			ans[1] = sum;
		}
		

		return ans;
	}

	public static int sumFourDivisors(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			int[] ans = CheckFourDivisors(nums[i]);
			if (ans[0] == 1) {
				sum += ans[1];
			}
		}
		return sum;
	}


	public static void main(String[] args) {
		int[] nums = { 21, 4, 7 };
		System.out.println(sumFourDivisors(nums));
	}
}
