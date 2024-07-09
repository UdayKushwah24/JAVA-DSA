package Recursion;

public class Sorted_Array {
    public static boolean isSorted(int[] arr,int ind){
        if(ind == arr.length-1){
            return true;
        }
        if(arr[ind]<arr[ind+1]){
            return isSorted(arr, ind+1);
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,5};
        int ind = 0;
        System.out.println(isSorted(arr , ind));
    }
}
