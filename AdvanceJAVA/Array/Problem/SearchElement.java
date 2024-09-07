/* 
Return the index of 
 */

package AdvanceJAVA.Array.Problem;

public class SearchElement {
    public static int SearchEle(int arr[] , int key) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key)  return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        //given array to be search the key element
        int arr[] = {21,63,51,47,86,45,88}; 
        // key to be search in array
        int key = 86;              
        System.out.println(SearchEle(arr, key));
    }
}
