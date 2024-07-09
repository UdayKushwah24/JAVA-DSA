package Loop;

public class Reverse_no {
    public static void main(String[] args) {
        /* int num = 10899;
        String s = num+"";
        String reverse = "";
        int n = s.length();
        System.out.println(n);
        System.out.println(s.charAt(n));
        for(int i = n;i>0;i--){
            reverse = reverse+s.charAt(i);
        }
        System.out.println(reverse); */
        int num = 10899;
        for (int i = 0; i < 5; i++) {
            int lastDigit = num%10;
            num /= 10;
            System.out.print(lastDigit);
        }
        
    }
}
