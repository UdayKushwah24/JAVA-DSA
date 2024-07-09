package Recursion;

public class Reverse_string { 
    public static void ReverseString(String str ,int index){
        if(index == 0){
            System.out.println(str.charAt(0));
            return;
        }
        System.out.print(str.charAt(index));
        ReverseString(str, index-1);
    }
    public static void main(String[] args) {
        String s = "Uday Kushwah";
        ReverseString(s,s.length()-1);
    }
}
