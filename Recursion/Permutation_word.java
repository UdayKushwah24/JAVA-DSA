package Recursion;

public class Permutation_word {
    public static void Print_Permutation (String str , String permutation){
        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }
        for(int i =0 ; i<str.length();i++){
            char curchar = str.charAt(i);
            String newstring = str.substring(0, i) + str.substring(i+1);
            Print_Permutation(newstring, permutation+curchar);
        }
    }
    public static void main(String[] args) {
        String str = "abcz";
        Print_Permutation(str, "");
    }
}
