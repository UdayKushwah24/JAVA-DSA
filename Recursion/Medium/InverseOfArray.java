/* 
Input : n = 5        
        0 2 4 1 3
Output : 0 3 1 4 2
 */

package Recursion.Medium;
import java.util.*;
public class InverseOfArray {

    public static int[] InverseArray(int[] arr,int[] ans,int ind) {
        if(ind == arr.length){
            return ans;

        }
        int ele = arr[ind];
        ans[ele] = ind;
        return InverseArray(arr, ans, ind+1);

    }
    public static void main(String[] args) {
        // int arr[] = {0,2,4,1,3};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans[] = new int[arr.length];
        int[] inversearray = InverseArray(arr,ans,0);
        for (int i = 0; i < inversearray.length; i++) {
            System.out.print(inversearray[i]+" ");
        }

    }
}
