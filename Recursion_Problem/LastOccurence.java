/* 
Write a Java code to find the last occuremce of an element in an aaray
input : array = {8, 3, 6, 9, 5, 10, 2, 5, 3}
output : 7
*/
package Recursion_Problem;

public class LastOccurence {
    public static int lastoccurence(int arr[], int key , int i){
        int n = arr.length-1;
        if(i == n){
            return -1;
        }
        if(arr[n-i] == key) return (n-i);

        return lastoccurence(arr, key, i+1);
    }
    public static void main(String[] args){
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        System.out.println(lastoccurence(arr, 5, 0));
    }
}
