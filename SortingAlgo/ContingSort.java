package SortingAlgo;

public class ContingSort {

    public static int MaxEle(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    public static void SortAlgo(int[] arr) {
        int[] count_ele = new int[MaxEle(arr)+1];
        for (int i = 0; i < arr.length; i++) {
            count_ele[arr[i]]++;
        }
        int j = 0;
        for (int i = 0; i < count_ele.length; i++) {
            while (count_ele[i] > 0) {
                arr[j] = i;
                j++;
                count_ele[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,7,4,1,5,9,4,8};
        SortAlgo(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
