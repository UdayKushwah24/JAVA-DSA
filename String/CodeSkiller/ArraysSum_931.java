/* 
Arrays-Sum Of Two Arrays
Take as input N, the size of array. Take N more inputs and store that in an array. Take as input M, the size of second array and take M more inputs and store that in second array. Write a function that returns the sum of two arrays. Print the value returned.


Example 1

Input

4
1 0 2 9
5
3 4 5 6 7


Output

3, 5, 5, 9, 6, END


Explanation

Sum of [1, 0, 2, 9] and [3, 4, 5, 6, 7] is [3, 5, 5, 9, 6] and the first digit represents carry over , if any (0 here ) .


Constraints

Length of Array should be between 1 and 1000.
 */

package String.CodeSkiller;
import java.util.*;
public class ArraysSum_931 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		for(int i=0;i < n;i++) {
			arr1[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] arr2 = new int[m];
		for(int i=0;i < m;i++) {
			arr2[i] = sc.nextInt();
		}
		int i = n-1;
        int j = m-1;
        int carry = 0;
        while (i >= 0 && j >= 0) {
            int sum = (arr1[i]+arr2[j]+ carry);
            int remain = sum%10;
            list.add(remain);
            carry = sum/10;
            i--;
            j--;
        }
        while (i >= 0) {
            int sum =  arr1[i] + carry;
            int remain = sum%10;
            list.add(remain);
            carry = sum/10;
            i--;
        }
        while (j >= 0) {
            int sum = arr2[j]+ carry;
            int remain = sum%10;
            list.add(remain);
            carry = sum/10;
            j--;
        }
        if(carry > 0) {
            list.add(carry);
        }
        for (int k = list.size()-1; k >= 0; k--) {
            System.out.print(list.get(k)+", ");
        }
        System.out.println("END");   
        sc.close();     
    }
}
