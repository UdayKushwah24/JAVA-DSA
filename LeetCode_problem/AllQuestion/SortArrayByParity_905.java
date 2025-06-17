package Leetcode.AllQuestion;

 
public class SortArrayByParity_905 {
	public static int[] sortArrayByParity(int[] arr) {
		
		int si = 0;
		int ei = arr.length - 1;
		int[] ans = new int[arr.length];
		for (int i = 0; i < ans.length; i++) {
			if (arr[i] % 2 == 0) {
				ans[si++] = arr[i];
				// si++;
			} else {
				ans[ei--] = arr[i];
				// ei--;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] nums = { 4, 2, 5, 7 };
		int[] ans = sortArrayByParity(nums);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}
}
