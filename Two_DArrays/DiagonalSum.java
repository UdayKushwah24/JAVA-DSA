package Two_DArrays;

public class DiagonalSum {
    public static void diagonalSum(int matrix[][]) {
        int priSum = 0;
        int secSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            if((matrix.length%2)==0){
            //Sum of Primary Diagonal
            for (int j=0;j<matrix.length;j++) {
                if(i==j) {
                    priSum += matrix[i][j];
                }
            }
            //Sum of Secondary Diagonal
            for (int j = matrix.length-1; j>=0; j--) {
                if(i+j == matrix.length-1) {
                    secSum += matrix[i][j];
                }
            }
            } else {
                //Sum of Primary Diagonal
            for (int j=0;j<matrix.length;j++) {
                if(i==j ) {
                    priSum += matrix[i][j];
                }
            }
            //Sum of Secondary Diagonal
            for (int j = matrix.length-1; j>=0; j--) {
                if(i+j == matrix.length-1) {
                    if(i!=j) {
                    secSum += matrix[i][j];
                    }
                }
            }
            }
        }
        System.out.println("Sum of Primary Diagonal Element : "+priSum);
        System.out.println("Sum of Secondary Diagonal Element : "+secSum);
        System.out.println("Sum of Diagonals elements : "+(priSum+secSum));
    }
    public static void main(String[] args) {
        int matrix[][] = {{ 1, 2, 3},
                          { 5, 6, 7},
                          { 9,10,11}};
        System.out.println(matrix.length);
        diagonalSum(matrix);
    }
}
