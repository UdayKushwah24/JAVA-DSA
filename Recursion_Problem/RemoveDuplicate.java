/* 
Input : appnnacollege
Output: apncoleg
 */
package Recursion_Problem;

public class RemoveDuplicate {
    public static void removeduplicates(String s, int index, StringBuilder newstr, boolean map[]){
        //base case
        if(index == s.length()-1) {
            System.out.println(newstr);
            return;
        }

        char currchar = s.charAt(index);
        if(map[currchar - 'a'] == true){
            //duplicate
            removeduplicates(s, index+1, newstr, map);
        } else {
            map[currchar - 'a'] = true;
            removeduplicates(s, index+1, newstr.append(currchar), map);
        }
    }
    public static void main(String[] args) {
        String s = "appnnacollege";
        boolean map[] = new boolean[26];
        StringBuilder sb = new StringBuilder("");
        removeduplicates(s, 0, sb ,map);
        // removeduplicates(s, 0,new StringBuilder(""), new boolean[26]);
        
    }
}
