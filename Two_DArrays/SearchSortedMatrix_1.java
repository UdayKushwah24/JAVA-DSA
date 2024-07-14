package Two_DArrays;

public class SearchSortedMatrix_1 {
    public static void stairCaseSearch(int matrix[][],int key) {
        int row = 0, col  = matrix[0].length-1;
        //start from the top-right corner
        while(row < matrix.length && col>=0) {
            if(matrix[row][col] == key){
                System.out.println("Key found at ("+(row+1)+","+(col+1)+")");
                return;  //Exit the method once the key is found
            }
            else if (key<matrix[row][col]) {
                col--;  //Move Left
            }
            else {
                row++;  //Move down
            }
        }
        //This line will be reached if the key is not found
        System.out.println("Key not found .");

    }
    public static void main(String[] args) {
        int matrix[][] = {{10, 20, 30, 40},
                         {15, 25, 35, 45},
                         {27, 29, 37, 48},
                         {32, 33, 39, 50}};
        int key = 33;
        stairCaseSearch(matrix,key);
    }
}
