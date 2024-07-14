package Two_DArrays;

public class DiagonalSum_BestCase {
    public static void diagonalSum(int matrix[][]) {
        int priSum = 0;
        int secSum = 0;
        //Time Complexity = O(n)   (Best Case) --> Optimised Code
        for (int i = 0; i < matrix.length; i++) {
            priSum += matrix[i][i];
            if(i != (matrix.length-1-i))
            secSum += matrix[i][matrix.length-1-i];
        }
        System.out.println("Sum of Primary Diagonal Element : "+priSum);
        System.out.println("Sum of Secondary Diagonal Element : "+secSum);
        System.out.println("Sum of Diagonals elements : "+(priSum+secSum));
    }
    public static void main(String[] args) {
        int matrix[][] = {{ 1, 2, 3},
                          { 5, 6, 7},
                          { 9,10,11}};
        /* int matrix[][] = {{ 1, 2, 3, 4},
                          { 5, 6, 7, 8},
                          { 9,10,11,12},
                          {13,14,15,16}}; */
        System.out.println(matrix.length);
        diagonalSum(matrix);
    }
}
