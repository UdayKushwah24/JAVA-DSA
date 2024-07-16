package String;

public class String_builder {
    //Time Complexity = O(26)
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char ch = 'a';ch <= 'z';ch++) {
            sb.append(ch);   //append the character at the end of a string
        }
        System.out.println(sb);
        // o|p : abcdefghijklmnopqrstuvwxyz
    }
}
