package Array;

import java.util.Scanner;

public class LargestElement {
    public static void largeElement(int numbers[]){
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]<min){
                min = numbers[i];
            }
            if(numbers[i]>max){
                max = numbers[i];
            }
        }
        System.out.println("Smallest element in array is : "+min);
        System.out.println("Largest  element in array is : "+max);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the "+(i+1)+" element of array : ");
            numbers[i] = sc.nextInt();
        }
        largeElement(numbers);
        sc.close();
    }
}
