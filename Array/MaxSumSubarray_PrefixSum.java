package Array;

public class MaxSumSubarray_PrefixSum {
    public static void subarray(int arr[]){
        // int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i = 1;i<arr.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                int currSum ;
                // Ternary Operator
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];  
                System.out.println(currSum);
                if(currSum>maxSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum Sum of subArray : "+maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        subarray(arr);
    }
}
