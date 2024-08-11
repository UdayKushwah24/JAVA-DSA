package Recursion_Problem;


public class practice {
    public static void duplicates(String str, int num, boolean alphabet[],StringBuilder newstr){
        char currchar = str.charAt(num);
        if(num == str.length()-1) {
            System.out.println(newstr);
            return;
        }
        if(alphabet[currchar - 'a'] == true){
            duplicates(str, num+1, alphabet, newstr);
        }
        else {
            alphabet[currchar - 'a'] = true;
            duplicates(str, num+1, alphabet, newstr.append(currchar));
        }
    }
    public static void main(String[] args) {
        String str = "udayKushwah";
        boolean alphabet[] = new boolean[26];
        StringBuilder newstr = new StringBuilder();
        duplicates(str.toLowerCase(), 0, alphabet, newstr);
    }
}
