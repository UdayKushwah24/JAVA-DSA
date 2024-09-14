//Question URL : https://codeforces.com/problemset/problem/339/A

/* 
A. Helpful Maths
time limit per test2 seconds
memory limit per test256 megabytes
Xenia the beginner mathematician is a third year student at elementary school. She is now learning the addition operation.

The teacher has written down the sum of multiple numbers. Pupils should calculate the sum. To make the calculation easier, the sum only contains numbers 1, 2 and 3. Still, that isn't enough for Xenia. She is only beginning to count, so she can calculate a sum only if the summands follow in non-decreasing order. For example, she can't calculate sum 1+3+2+1 but she can calculate sums 1+1+2 and 3+3.

You've got the sum that was written on the board. Rearrange the summans and print the sum in such a way that Xenia can calculate the sum.

Input
The first line contains a non-empty string s — the sum Xenia needs to count. String s contains no spaces. It only contains digits and characters "+". Besides, string s is a correct sum of numbers 1, 2 and 3. String s is at most 100 characters long.

Output
Print the new sum that Xenia can count.

Examples
Input
3+2+1
Output
1+2+3
Input
1+1+3+1+3
Output
1+1+1+3+3
Input
2
Output
2

 */

package AdvanceJAVA.CodeForcesProblem;

import java.util.Scanner;

public class HelpfulMaths {

    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(str.length() == 1) {
            System.out.println(str);
            return ;
        }
        int arr[] = new int[(str.length()/2)+1];
        int ind = 0;
        for (int i = 0; i < str.length(); i+=2) {
            char ch = str.charAt(i);
            arr[ind] = Integer.valueOf((ch)-48);
            ind++;

        }
        selectionSort(arr);
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }
       StringBuilder Newstr = new StringBuilder("");
       for (int i = 0; i < arr.length-1; i++) {
            Newstr.append(arr[i]+"+");
          
       }
        Newstr.append(arr[arr.length-1]);
        System.out.println(Newstr);
    }
}
