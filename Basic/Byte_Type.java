package Basic;

public class Byte_Type {
    public static void main(String[] args) {
        // ERROR : Type mismatch: cannot convert from int to byte
        /* byte b = 5;
        b = 2*b;
        System.out.println(b); */

        byte b = 5;
        b = (byte) (2*b);
        System.out.println(b);

        int $ = 87;
        System.out.println($);
    }
}
