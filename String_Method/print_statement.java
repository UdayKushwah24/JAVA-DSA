package String_Method;

public class print_statement {
    public static void main(String[] args) {
        String a = "Uday Kushwah";
        System.out.println(a);
        System.out.print(a);
        System.out.println("  ***");
        System.out.println();
        int x = 45;
        float y = 4.87698f;
        System.out.printf("The value of x is %d and value of y is %f",x,y);
        System.out.println();
        System.out.format("The value of x is %d and value of y is %f",x,y);
        System.out.println();
        //8.2f use ==> taking the space of 8 and 2 value after decimal
        System.out.format("The value of x is %d and value of y is %8.3f",x,y);
    }
}
