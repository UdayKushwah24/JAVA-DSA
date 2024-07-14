package Two_DArrays;

import java.util.Scanner;

public class SearchLargeElement {
    public static void searchMax(int matrix[][]) {
        int maxNum = matrix[0][0]; 
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]>maxNum) {
                    maxNum = matrix[i][j];
                }
            }
        }
        System.out.println("Maximum Element :"+ maxNum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No. of row : ");
        int row = sc.nextInt();
        System.out.print("Enter No. of column : ");
        int col = sc.nextInt();
        int matrix[][] = new int[row][col];

        //input matrix element 
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        //Display Matrix 
        System.out.println("Matrix : ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        //call method
        searchMax(matrix);
        sc.close();
    }
}
