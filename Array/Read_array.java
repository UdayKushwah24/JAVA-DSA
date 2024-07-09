// Read an array as input from the user .
package Array;

import java.util.Scanner;

public class Read_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the "+(i+1)+" element of array : ");
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }

        sc.close();
    }
}
