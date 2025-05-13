package Recursion.RecursionPractice;

public class q11_KeypadCombination {

    static String[] key = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public static void Combination(String ques, String ans) {
        if (ques.length() == 0) {
            System.out.print(ans+" ");
            return;
        }
        char ch = ques.charAt(0);
        int n = ch-'0';
        String press = key[n];
        for (int i = 0; i < press.length(); i++) {
            Combination(ques.substring(1), ans+press.charAt(i));
        }          
    }
    public static void main(String[] args) {
        String press = "23";
        Combination(press, "");
    }
}
