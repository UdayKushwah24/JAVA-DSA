package Recursion.Medium;

import java.util.ArrayList;
import java.util.List;

public class LetterCombination_17 {

    static String[] key = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public static void LetterCombination(String ques,String ans, List<String> lst) {
        if(ques.length() ==0){
            lst.add(ans);
            return;
        }

        char ch = ques.charAt(0);
        String getString = key[ch-'0'];
        for (int i = 0; i < getString.length(); i++) {
            LetterCombination(ques.substring(1), ans+getString.charAt(i),lst);
            
        }
    }
    public static void main(String[] args) {
        String ques = "2345678";
        List<String> lst = new ArrayList<>();
        LetterCombination(ques, "",lst);
        System.out.println(lst);

    }
}
// 242785  -> 