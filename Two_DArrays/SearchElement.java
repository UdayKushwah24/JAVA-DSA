package Two_DArrays;
import java.util.Scanner;
public class SearchElement {
    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == key) {
                    System.out.println("Element is found : ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Element not found.");
        return false;
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

        //Output
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        //call method
        System.out.print("Enter element for search : ");
        int key = sc.nextInt();
        search(matrix, key);
        

        sc.close();
    }
}
