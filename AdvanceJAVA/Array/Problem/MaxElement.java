package AdvanceJAVA.Array.Problem;

public class MaxElement {
    // Method 1


    // public static int SearchMax(int arr[] ) {
    //     int max = arr[0];
    //     for (int i = 1; i < arr.length; i++) {
    //         if(arr[i] > max)  
    //         max = arr[i];
    //     }
    //     return max;
    // }
    // public static void main(String[] args) {
        
    //     int arr[] = {21,63,51,47,86,45,88}; 
                     
    //     System.out.println(SearchMax(arr));
    // }

    public static void main(String[] args) {
        int arr[] = {21,63,51,47,86,45,88}; 
        int max = Integer.MIN_VALUE;             //-2^3
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        System.out.println(max);
    }
}