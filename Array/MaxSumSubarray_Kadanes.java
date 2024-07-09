package Array;
// import java.util.Arrays;
public class MaxSumSubarray_Kadanes {
    public static void main(String[] args) {
         
        int[]  arr = {1,-2,3,4,};
        // int sum = 0;
        int maxsum = 0;
        int csum = 0;
        for (int i = 0; i < arr.length; i++) {
            csum += arr[i];
            if(csum < 0){
                csum = 0;
            }
            if(csum>maxsum){
                maxsum = csum;
            }
        }
        // kadane's Algorithm
        System.out.println(csum); 
    }
}
