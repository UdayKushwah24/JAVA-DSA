package String;

public class EqualFunc {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        String s3 =new String("Java");
        if(s1 == s2){
            System.out.println("Both are Equal.");
        } else {
            System.out.println("Both are not Equal.");
        }
        if(s1 == s3){
            System.out.println("Both are Equal.");
        } else {
            System.out.println("Both are not Equal.");
        }
        if(s1.equals(s3)){
            System.out.println("Both are Equal.");
        } else {
            System.out.println("Both are not Equal.");
        }
    }
}
