/* 
Take an array as input from the user . 
Search for a given number x and print the index at which it occurs.
 */
package Array;

import java.util.Scanner;

public class search_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the "+(i+1)+" element of array : ");
            numbers[i] = sc.nextInt();
        }
        //linear search
        System.out.print("Enter the element that you are searching in array : ");
        int x = sc.nextInt();
        for (int i = 0; i < size; i++) {
            if(numbers[i] == x)
            System.out.println("x found at index : "+i);
        }

        sc.close();
    }
}
