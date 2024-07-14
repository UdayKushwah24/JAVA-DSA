package Two_DArrays;

public class SearchSortedMatrix_2 {
    public static void stairCaseSearch(int matrix[][],int key) {
        int row = matrix.length-1, col = 0;
        //start with Left-Bottom corner
        while(row >=0 && col < matrix[0].length) {
            if(matrix[row][col] == key) {
                System.out.println("Key found at cell : ("+row+","+col+")");
                return;   //Exit the method once the key is found
            } 
            else if (key>matrix[row][col]) {
                col++;   //Move Right
            }
            else {
                row--;   //Move Up
            }
        }
         //This line will be reached if the key is not found
        System.out.println("Element not found.");
    }
    public static void main(String[] args) {
        int matrix[][] = {{10, 20, 30, 40},
                         {15, 25, 35, 45},
                         {27, 29, 37, 48},
                         {32, 33, 39, 50}};
        int key = 31;
        stairCaseSearch(matrix,key);
    }
}
