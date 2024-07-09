/* 
Print all possible combination of a given string.
*/
package Recursion;

public class BackTracking {
    public static void PrintPermutation (String str , String permut , int ind ){
        if(str.length() == 0){
            System.out.println(permut);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
        char currChar = str.charAt(i);
        String newstr = str.substring(0,i) + str.substring(i+1);

        PrintPermutation(newstr, permut+currChar, ind+1);
        }
    }
    public static void main(String[] args) {
        String str = "ABC";
        PrintPermutation(str, "", 0);
    }
}
