package AdvanceJAVA.Array;

public class ArrCreation {
    public static void main(String[] args) {
        int arr[] = new int[5];
        System.out.println(arr);   // [I@4517d9a3
        int other[] = arr;
        System.out.println(other); // [I@4517d9a3

        //To get the length of array
        System.out.print("Length of a array : ");
        System.out.println(other.length);

        arr[0] = 4;
        arr[1] = 9;
        arr[2] = 87;
        arr[3] = 9;
        arr[4] = 56;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
    }
}
