package AdvanceJAVA.Array;

import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        // int[] arr1 = {2,4,5,6,7};
        // int[] arr2  = new int[] {1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Display(arr);
        sc.close();
    }

    public static void Display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
}
