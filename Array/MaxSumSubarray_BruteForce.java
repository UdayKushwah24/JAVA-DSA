package Array;

public class MaxSumSubarray_BruteForce {
    public static void subarray(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currSum = 0;
                for(int k = start; k <= end; k++){
                    // System.out.print(arr[k]+" ");
                    currSum = currSum + arr[k];
                }
                System.out.println(currSum);
                if(currSum>maxSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum Sum of subArray : "+maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {-2,-4,-6,-8,-10};
        subarray(arr);
    }
}
