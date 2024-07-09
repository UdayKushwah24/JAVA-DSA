package Array;

public class MergeSort {
    public static void conquer(int[] arr,int si, int mid ,int ei){
        int[] merged = new int[ei-si+1];
        int ind1 = si;
        int ind2 = mid + 1;
        int x = 0;
        while(ind1<=mid && ind2<=ei){
            if(arr[ind1]<= arr[ind2]){
                merged[x++] = arr[ind1++];
                // x++; ind++;
            } else {
                merged[x] = arr[ind2];
                x++;
                ind2++;
            }
        }
        while(ind1 <= mid){
            merged[x++] = arr[ind1++];
        }
        while(ind2 <= ei){
            merged[x] = arr[ind2];
            x++;
            ind2++;
        }
    }
    public static void divide (int[] arr,int si , int ei){
        if(si>=ei){
            return ;
        }
        int mid = si+(ei-si)/2;  // (si+ei)/2 gives sometime problem
        divide(arr,si,mid);
        divide(arr,mid,ei);
        conquer(arr,si,mid,ei);
    } 
    public static void main(String[] args) {
        int[] arr = {3,6,2,8,9,5};
        int n = arr.length;
        divide(arr, 0, n);

    }
}
