package Array;
// import java.util.Arrays;
public class Max_sum_subarray {
    public static void main(String[] args) {
        /* int[]  arr = {1,-2,3,4};
        // int sum = 0;
        int maxsum = 0;
        for (int left = 0; left < arr.length; left++) {
            int sum = 0;
            for (int tick = 0; tick < arr.length; tick++) {
                sum += arr[tick];
                if(sum>maxsum){
                    maxsum = sum;
                }
            }
        }
        System.out.println(maxsum); */

        int[]  arr = {1,-2,3,4,};
        // int sum = 0;
        int maxsum = 0;
        int csum = 0;
        for (int i = 0; i < arr.length; i++) {
            csum += arr[i];
            if(csum>maxsum){
                maxsum = csum;
            }
            if(csum < 0){
                csum = 0;
            }
        }
        // kaden's Algorithm
        System.out.println(csum);
    }
}
