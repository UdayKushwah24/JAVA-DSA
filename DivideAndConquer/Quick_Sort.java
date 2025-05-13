/* 
1. array ke kisi element ko pivot element mante hai
2. fir uske pivot element ke corresponding, small elment pivot element ke left mai rakhenge
and  large elment pivot element ke right mai rakhenge
here we take the pivot element is last element.
 */

package DivideAndConquer;

public class Quick_Sort {

    public static int Partition(int[] arr, int si, int ei) {
        int item = arr[ei];
        int idx = si;
        for (int i = si; i < ei; i++) {
            if (arr[i] < item) {
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
                idx++;
            }
        }
        int temp = arr[ei];
        arr[ei] = arr[idx];
        arr[idx] = temp;
        return idx;
    }

    public static void Sort(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int idx = Partition(arr, si, ei);
        Sort(arr, si, idx - 1);
        Sort(arr, idx + 1, ei);
    }

    public static void main(String[] args) {
        int[] arr = { 7, 5, 1, 4, 3 };
        Sort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
