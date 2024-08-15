/* 
Given an array of size n, find the majority element. The majority element is the element that appears more than n/2 times.

You may assume that the array is non-empty and the majority element always exist in the array.

Input Format
First line contains integer N (size of the array) followed by N more integers.

Constraints
Output Format
Majority Element of array

Sample Input
3
1 1 2
Sample Output
1
Explanation
Number of 1's in the array is more than 3/2 , Hence majority element is 1
 */
package AdvanceJAVA.SuperAssignment.Assignment_01;
import java.util.Scanner;
public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if(element == arr[j]) {
                    count++;
                }
            }
            if(count > N/2) {
                System.out.println(element);
                return;
            }
        }
        
    }
}
