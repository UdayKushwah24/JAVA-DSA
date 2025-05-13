// Time Complexity : O(n)

package Recursion.Basic;

public class IsSorted {

    public static boolean CheckSorted(int[] arr, int i ) {
        if(i == arr.length-1) {
            return true;
        }
        
        if(arr[i]>arr[i+1]) {
            return false;
        }
        return CheckSorted(arr, i+1);
    }
    public static void main(String[] args) {
        int[] arr = {3,5,8,9,12,16};
        System.out.println(CheckSorted(arr, 0));
    }
}
