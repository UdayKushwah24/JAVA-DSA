package Leetcode.AllQuestion;

public class PartitionArrayGivenPivot_2161 {
	public static int[] pivotArray(int[] nums, int pivot, int k) {
		int si = 0;
		k -= 1;
		int idx = si;
		for (int i = 0; i < k; i++) {
			if (nums[i] < pivot) {
				int temp = nums[i];
				nums[i] = nums[idx];
				nums[idx] = temp;
				idx++;
			}
		}
		int temp = nums[k-1];
		nums[k-1] = nums[idx];
		nums[idx] = temp;
		return nums;
	}
	
	public static void main(String[] args) {
		int[] nums = { 9, 12, 5, 10, 14, 3, 10 };
		int pivot = 10;
		int i = 0;
		int j = nums.length - 1;
		while (i < j+1) {
			if (nums[i] == pivot) {
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
				j--;
			} else {
				i++;
			}
		}
		 
	
		System.out.println(i);
		// int l = 0;
		// for (int j2 = 0; j2 < nums.length; j2++) {
		// 	if (nums[j2] == pivot) {
		// 		l = j2;
		// 		break;
		// 	}
		// }
		// System.out.println(l);
	
		int[] ans = new int[nums.length];
		for (int k = i; k < nums.length; k++) {
	
			ans = pivotArray(nums, nums[k],k);
		}
		for (int idx = 0; idx < ans.length; idx++) {
			System.out.print(ans[idx] + " ");
		}
		System.out.println();
		 
	}  
		


	
	/* 
	public static int[] pivotArray(int[] nums, int pivot) {
		int[] ans = new int[nums.length];
		int index = 0;
	
		// Part 1: Add elements less than pivot
		for (int num : nums) {
			if (num < pivot) {
				ans[index++] = num;
			}
		}
	
		// Part 2: Add elements equal to pivot
		for (int num : nums) {
			if (num == pivot) {
				ans[index++] = num;
			}
		}
	
		// Part 3: Add elements greater than pivot
		for (int num : nums) {
			if (num > pivot) {
				ans[index++] = num;
			}
		}
	
		return ans;
	}
	
	public static void main(String[] args) {
		int[] nums = { 9, 12, 5, 10, 14, 3, 10 };
		int pivot = 10;
		int[] result = pivotArray(nums, pivot);
	
		for (int num : result) {
			System.out.print(num + " ");
		}
	} */
}
