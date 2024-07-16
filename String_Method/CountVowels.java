/* 
Count how many times lowercase vowels occurred in a String entered by the user
*/
package String;

public class CountVowels {
    public static void countvowel(String str){
        int count = 0;
        for(int i = 0;i<str.length();i++) {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.print(count);
    }
    public static void main(String[] args) {
        String str = "I am Genius";
        countvowel(str);
    }
}
