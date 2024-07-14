/* 
Print the number of 7’s that are inthe 2d array.
Example :
Input - int[][] array = {{4,7,8},{8,8,7}};
Output - 2
*/
package Two_DArrays;

public class RepeatElement {
    public static void countElement (int array[][]) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if(array[i][j] == 7) {
                    count++;
                }
            }
        }
        System.out.println("Number of 7's element repeated : "+count);
    }
    public static void main(String[] args) {
        int array[][] = { {4,7,8},{8,8,7} };
        countElement(array);
    }
}
