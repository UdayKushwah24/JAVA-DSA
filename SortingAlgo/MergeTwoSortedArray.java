package SortingAlgo;

public class MergeTwoSortedArray {

    public static int[] Merge_Two_Sorted_Array(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] sortedArray = new int[m+n];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n && j < m) {
            if(arr1[i] < arr2[j]) {
                sortedArray[k] = arr1[i];
                i++;
            } else {
                sortedArray[j] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < n) {
            sortedArray[i] = arr1[k];
            k++;
            i++;
        }
        while (j < m) {
            sortedArray[j] = arr2[k];
            k++;
            j++;
        }
        return sortedArray;
    }
    public static void main(String[] args) {
        int[] arr1 = {2,3,5,7,8};
        int[] arr2 = {1,3,5,8,9,11,13};
        int[] sortedArray = Merge_Two_Sorted_Array(arr1, arr2);
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] +" ");
        }
    }
}
