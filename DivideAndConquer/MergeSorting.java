/* 
Time Complexity : O(n*Logn)
*/

package DivideAndConquer;

public class MergeSorting {
    public static void printarr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }

    //Divide the problem into sub-problem
    public static void mergesortAlgo(int arr[],int si, int ei) {
         //Base Case
        if( si >= ei ) {
            return;
        }

        int mid = (si+ei)/2;        // mid = (si+ei)/2   :gives error for large error
        mergesortAlgo(arr, si, mid);       //For left part
        mergesortAlgo(arr, mid+1, ei);     //For right part
        merging(arr, si,  mid,  ei);
    }

    //Conquer the sub-problem
    public static void merging(int arr[],int si, int mid, int ei) {

        int temp[] = new int[ei-si+1];
        int i = si;                    //iterator for left part
        int j = mid+1;                 //iterator for right part
        int k = 0;                     //iterator for temp array
        while(i <= mid && j <= ei) {
            if(arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
                // k++;
            } 
            else {
                temp[k] = arr[j];
                j++;
                // k++;
            }
            k++;
        }

        //Left part
        while(i <= mid){
            // temp[k] = arr[i];
            // k++;
            // i++;
            temp[k++] = arr[i++];
        }

        //Right Part
        while(j <= ei) {
            // arr[k] = arr[j];
            // k++;
            // j++;
            temp[k++] = arr[j++];
        }
    
    //copy temp to original arr
        for(k=0,i = si ; k<temp.length;k++,i++){
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,8,4,7,9,5,3,4,6,7};
        mergesortAlgo(arr, 0, arr.length-1);
        printarr(arr);
    }
}
