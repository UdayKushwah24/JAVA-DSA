/* 
Take an matrix as input from the user . 
Search for a given number x and print the indices at which it occurs.
 */
package Array;

import java.util.Scanner;

public class search_matrix {
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
        System.out.print("Enter the element that you are searching in matrix : ");
        int x = sc.nextInt();
        // System.out.println(matrix.length);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns ; j++) {
                if(matrix[i][j]  == x){
                System.out.print("The element is in "+(i+1)+" row and "+(j+1)+" column .");
                break;
            }
                
            }
            
        }
        sc.close();
    }
}
