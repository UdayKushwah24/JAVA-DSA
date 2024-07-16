package String;

public class string_object {
    public static void main(String[] args) {
        String name = new String("Uday Kushwah");
        System.out.println(name);

        String x = "Kamal Kushwah";
        System.out.println(x);
        
        // Reverse the String
        String r = new StringBuilder(x).reverse().toString();
        System.out.println(r);
    }
}
