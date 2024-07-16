package String;

public class Substring {
    public static String substring(String str,int si,int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        int si = 3;    //Starting Index
        int ei = 7;    //Ending Index
        System.out.println(substring(str,si,ei));

        //In-built method
        System.out.println(str.substring(si, ei));
    }
}
