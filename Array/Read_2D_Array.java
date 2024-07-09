package Array;

import java.util.Scanner;

public class Read_2D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows that you want : ");
        int rows = sc.nextInt();
        System.out.print("Enter no. of columns that you want : ");
        int columns = sc.nextInt();
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter Value of "+(i+1)+" row and "+(j+1)+" column : ");
                
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println(matrix.length);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns ; j++) {
                // System.out.println("Value of "+(i+1)+" row and "+(j+1)+" column : "+matrix[i][j]);
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
