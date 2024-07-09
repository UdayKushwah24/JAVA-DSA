package Recursion;

public class Keypad_Combination {
    public static String[] keypad =  {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printComb(String str, int ind , String combination){
        if(ind == str.length()){
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(ind);
        String mapping = keypad[currChar-'0'];
        for (int i = 0; i < mapping.length(); i++) {
            printComb(str, ind+1, combination+mapping.charAt(i));
        }
        
    }
    public static void main(String[] args) {
        String s = "023";

        printComb(s, 0, "");
    }
}
