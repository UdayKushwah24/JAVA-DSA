package DivideAndConquer;

public class MergeTwoSortedArray {
    public static void Sort(int[] arr1, int[] arr2, int[] sortedArr) {
        int m = arr1.length;
        int n = arr2.length;
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if(arr1[i] < arr2[j]) {
                sortedArr[k] = arr1[i];
                i++;
            } else {
                sortedArr[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < m) {
            sortedArr[k] = arr1[i];
            i++;
            k++;
        }
        while (j < n) {
            sortedArr[k] = arr2[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        int[] arr1 = { 2, 5, 7, 8, 12, 18 };
        int[] arr2 = { 3, 4, 5, 7, 9, 10, 12, 15, 19, 20 };
        int[] sortedArr = new int[arr1.length + arr2.length];
        Sort(arr1, arr2, sortedArr);
        for (int i = 0; i < sortedArr.length; i++) {
            System.out.print(sortedArr[i] + " ");
        }
    }

    /* 
    public static int[] Merge(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int[] mergedArr = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                mergedArr[k] = arr1[i];
                i++;
                k++;
            } else {
                mergedArr[k] = arr2[j];
                k++;
                j++;
            }
        }
        while (i < m) {
            mergedArr[k] = arr1[i];
            i++;
            k++;
        }
        while (j < n) {
            mergedArr[k] = arr2[j];
            j++;
            k++;
        }
        return mergedArr;
    }

    public static void main(String[] args) {
        int[] arr1 = { 2, 5, 7, 8, 12, 18 };
        int[] arr2 = { 3, 4, 5, 7, 9, 10, 12, 15, 19, 20 };
        int[] mergedArr = Merge(arr1, arr2);
        for (int k2 = 0; k2 < mergedArr.length; k2++) {
            System.out.print(mergedArr[k2] + " ");
        }
    }
     */

}
