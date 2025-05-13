/* 
Time Complexity : O(n*k)
this is a brute force
 */

package SlidingWindow;

public class MaxSubArray_K_size {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 1, 5, 7, 8, 4, 2, 3 };
        int k = 3;
        int max = Integer.MIN_VALUE;
        System.out.println("Possible SubArray of size " + k);
        for (int i = 0; i < arr.length - k + 1; i++) {
            int sum = 0;
            for (int j = i; j < k + i; j++) {
                System.out.print(arr[j] + " ");
                sum += arr[j];
            }
            System.out.println();
            max = Math.max(max, sum);
        }
        System.out.println("===========================");
        System.out.println(max);
    }
}
