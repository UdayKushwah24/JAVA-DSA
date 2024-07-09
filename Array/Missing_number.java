package Array;

public class Missing_number {
    public static void main(String[] args) {
        int N = 9; //maximum number
        int arr[] = {1,2,3,4,5,6,7,9,8};  // given array
        int expected_sum = N*(N+1)/2;
        int actual_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            actual_sum += arr[i];
        }
        int missing = expected_sum-actual_sum;
        if(missing == 0) System.out.println("No number is missing");
        else System.out.println(missing);
    }
}
