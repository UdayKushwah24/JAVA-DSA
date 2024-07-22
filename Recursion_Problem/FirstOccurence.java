/* 
Write a Java code to find the first occuremce of an element in an aaray
input : array = {8, 3, 6, 9, 5, 10, 2, 5, 3}
output : 4
 */
package Recursion_Problem;

public class FirstOccurence {
    public static int occurence(int arr[], int key, int i){
        if(i == arr.length-1){
            return -1;
        }
        if(arr[i] == key) {
            return i;
        }
        return occurence(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3}; 
        System.out.println(occurence(arr, 5, 0));
    }
}
