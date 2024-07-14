/* 
Write a program to Find Transpose of a Matrix.
Ques) What is Transpose ?
Ans) Transpose of a matrix is the process ofswapping therows to columns. 
For a 2x3 matrix,

Matrix :
a11    a12    a13
a21    a22    a23

Transposed Matrix :
a11    a21
a12    a22
a13    a23
 */
package Two_DArrays;


public class Transpose {
    public static void main(String[] args) {
        int row = 2, column = 3;
        int[][] matrix = { {2, 3, 7}, {5, 6, 7} };

        // Display original matrix
        printMatrix(matrix);

        // Transpose the matrix
        int[][] transpose = new int[column][row];
        for(int i = 0; i<row; i++) {
            for (int j = 0; j<column; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // print the transposed matrix
        printMatrix(transpose);
        }
        
    public static void printMatrix(int[][] matrix) {
        System.out.println("The matrix is: ");
        for(int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
        
}
