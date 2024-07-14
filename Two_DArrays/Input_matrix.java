package Two_DArrays;
import java.util.Scanner;
public class Input_matrix {
    public static void CreateMatrix(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of Row : ");
        int row = sc.nextInt();  
        System.out.print("Enter no. of Column : ");
        int col = sc.nextInt();
        int matrix[][] = new int[row][col];
        // row = matrix.length
        // column = matrix[0].length
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter "+(i+1)+" row, "+(j+1)+" column : ");
                matrix[i][j] = sc.nextInt();
            }
            // System.out.println();
        }
        sc.close();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Matrix "+(i+1)+" row and "+(j+1)+" column : "+matrix[i][j]);
                
            }
        }
    }
    public static void main(String[] args) {
        
        CreateMatrix();
    }
}
