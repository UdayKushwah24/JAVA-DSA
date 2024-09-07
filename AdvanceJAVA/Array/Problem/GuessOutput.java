package AdvanceJAVA.Array.Problem;

public class GuessOutput {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1, 7, 9, 8};
        int[] other = {31, 52, 11, 71, 81};
        System.out.println(arr[0] + " " + other[0]);
        Swap(arr, other);
        System.out.println(arr[0] + " " + other[0]);
    }

    public static void Swap(int[] arr, int[] other) {
        int[] temp = arr;
        arr = other;
        other = temp;
    }
}
