package Leetcode.AllQuestion;

public class RearrangeEleBySign_2149 {
	/* public static int[] rearrangeArray(int[] nums) {
		int i = 0;
		int j = 0;
		while (i < nums.length && j < nums.length) {
			if (nums[i] > 0 && i % 2 == 0) {
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
				i += 1;
			} else {
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
				j += 1;
	
			}
		}
		return nums;
	} */


	public static int[] rearrangeArray(int[] nums) {
		 
		int n = nums.length;
		int[] ans = new int[n];
		int even = 0;
		int odd = 1;
		for (int i = 0; i < n; i++) {
			if (nums[i] > 0) {
				ans[even] = nums[i];
				even += 2;
			} else {
				ans[odd] = nums[i];
				odd += 2;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int[] nums = { 3, 1, -2, -5, 2, -4 };
		int[] ans = rearrangeArray(nums);
		for (int e : ans) {
			System.out.print(e+" ");
		}
	}
}
