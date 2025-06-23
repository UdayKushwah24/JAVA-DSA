package Leetcode.LogicalQuestion;

public class MakeStringGreat_1544 {

    public static String makeGood(String s) {

        for (int i = 0; i < s.length(); i++) {
            
            while (i < s.length()-1 &&( (int) (s.charAt(i)) - (int) (s.charAt(i + 1)) == 32 || (int)(s.charAt(i))   - (int) (s.charAt(i + 1)) == -32)){
                s = s.replace(s.charAt(i) + "" + s.charAt(i + 1), "");
                i++;
            }
        }
        for (int i = 1; i < s.length(); i++) {
            while (i < s.length()  && ((int) (s.charAt(i-1)) - (int) (s.charAt(i )) == 32
                    || (int) (s.charAt(i-1)) - (int) (s.charAt(i )) == -32)) {
                s = s.replace(s.charAt(i-1) + "" + s.charAt(i ), "");
                i++;
            }
        }
       
        return s;
    }

    public static void main(String[] args) {
        String s = "abBAcC";
        System.out.println(makeGood(s));
        // System.out.println('A' - 'a');
    }
}
