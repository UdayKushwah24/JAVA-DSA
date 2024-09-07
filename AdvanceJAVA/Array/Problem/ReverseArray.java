package AdvanceJAVA.Array.Problem;

public class ReverseArray {
    // public static void Reverse(int arr[]) {
    //     int n = arr.length-1;
    //     for (int i = 0; i < n; i++) {
    //         int temp = arr[i];
    //         arr[i] = arr[n-i];
    //         arr[n-i] = temp;

    //     }
    // }

    public static void Reverse(int arr[]) {
        int i = 0;
        int j = arr.length-1;
        for (int j2 = 0; j2 < arr.length/2; j2++) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        Reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
