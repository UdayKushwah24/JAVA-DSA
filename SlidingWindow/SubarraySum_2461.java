package SlidingWindow;

public class SubarraySum_2461 {

    public static long maxSumSubArray(int[] arr, int k) {
        long sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        long ans = sum;
        for (int i = k; i < arr.length; i++) {

            // Window grow
            sum += arr[i];

            // Window shrink
            sum -= arr[i - k];

            // Update answer
            ans = Math.max(ans, sum);

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 3, 4, 7, 2, 6, 4, 5 };
        int k = 3;
        System.out.println(maxSumSubArray(arr, k));
    }
}
