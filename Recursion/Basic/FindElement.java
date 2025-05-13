// Time Complexity : O(n)

package Recursion.Basic;

public class FindElement {

    // public static void find(int[] arr, int key, int i) {

    //     // Base case or hault
    //     if (i == arr.length) {
    //         System.out.println(-1);
    //         return;
    //     }

    //     if (key == arr[i]) {
    //         System.out.println(i);
    //         return;
    //     }
    //     find(arr, key, i + 1);
    // }

    public static int find(int[] arr, int key, int i) {

        // Base case or hault case
        if (i == arr.length) {
            return -1;
        }

        if (key == arr[i]) {
            return i;
        }
        return find(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 4, 3, 7 };
        int key = 7;
        System.out.println(find(arr, key, 0));
    }
}
