package String;

public class CompareString {

    public static boolean equals(String str1, String str2) {

        if(str1 == str2){
            return true;
        }
        int n1 = str1.length();
        int n2 = str2.length();
        if(n1!=n2) {
            return false;
        }
        for (int i = 0; i < n1; i++) {
            if(str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = new String("hello");
        System.out.println(equals(s1, s2));
    }
}
