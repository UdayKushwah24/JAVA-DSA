package DivideAndConquer;


public class InsertLastItemCorrectPos {


    public static void CorrectPos(int[] arr) {
        int si = 0;
        int ei = arr.length-1;
        int item = arr[ei];
        int idx = 0;
        for (int i = si; i < ei; i++) {
            if(arr[i] < item) {
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
                idx++;
            }
        }
        int temp = arr[ei];
        arr[ei] = arr[idx];
        arr[idx] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {5, 7, 2, 3, 8, 1, 4};
        CorrectPos(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
