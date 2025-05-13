/* 
1. Binary Search
2. Recursion

Time Complexity : O(n x logn)
Space Complexity : O(n)
*/

package DivideAndConquer;

public class Merge_Sort {

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

    public static int[] Sort(int[] arr, int si, int ei) {
        if (si == ei) {
            int[] sa = new int[1]; // sa -> sorted array
            sa[0] = arr[si];
            return sa;
        }
        int mid = (si + ei) / 2;
        int[] fhsa = Sort(arr, si, mid); // fhsa -> first half sorted array
        int[] shsa = Sort(arr, mid + 1, ei); // shsa -> second half sorted array
        return Merge(fhsa, shsa);
    }

    public static void main(String[] args) {
        int[] arr = { 7, 5, 1, 4, 3 };
        int[] sortArr = Sort(arr, 0, arr.length - 1);
        for (int i = 0; i < sortArr.length; i++) {
            System.out.print(sortArr[i] + " ");
        }
    }
}
