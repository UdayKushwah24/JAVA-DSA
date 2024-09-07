package AdvanceJAVA.Array.Problem;

public class swap {
    public static void main(String[] args) {
        //call by value 
        int a = 7;
        int b = 8;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a : "+a);
        System.out.println("b : "+b);


        //without using the third variable
        //call by reference

        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("a : "+a);
        System.out.println("b : "+b);


        //without using the third variable
        // call by variable
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a : "+a);
        System.out.println("b : "+b);

        

    }
}
