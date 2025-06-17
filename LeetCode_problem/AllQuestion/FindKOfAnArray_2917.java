package Leetcode.AllQuestion;

public class FindKOfAnArray_2917 {
	public static int findKOr(int[] nums, int k) {
		int count1 = 0;
		for (int i = 0; i < nums.length; i++) {
			count1 = count1 | nums[i];
		}
		return count1;
	}
	public static void main(String[] args) {
		int[] nums = {7,12,9,8,9,15};
		int k = 4;
		System.out.println(findKOr(nums, k));
	}
}
