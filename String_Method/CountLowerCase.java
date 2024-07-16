package String;

public class CountLowerCase {
    public static void countLower(String str){
        int count = 0;
        for(int i = 0;i<str.length();i++) {
            if(Character.toLowerCase(str.charAt(i)) == str.charAt(i) && str.charAt(i) != ' ') {
                count++;
            }
        }
        System.out.print(count);
    }
    public static void main(String[] args) {
        String str = "I am Genius";
        countLower(str);
    }
}
