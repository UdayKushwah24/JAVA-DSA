package AdvanceJAVA.Basic;

public class DataTypes {
    public static void main(String[] args) {
        byte b = (byte)(-5999);
        // short s = 68;
        int i = (2099999942);
        long l = 48999884899l;

        int a = 072;    //If a number is start with is zero it is treat as octal(0-7).
        System.out.println(a);
        System.out.println(i);
        System.out.println(b);
        System.out.println(l);

        double d = 6.8;
        float f = 38.38f;
        System.out.println(d);
        System.out.println(f);

        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1);
        System.out.println(b2);

        // int a = 038;   //   compilation error

        //Char Datatypes:
        char ch = 'a';
        System.out.println((int)(ch));
        ch++;  //b
        ch += 1; //Internal Type casting ch = (char)(ch+1);           Op : c
        ch = (char)(ch + 1);  //explicit type casting
        System.out.println(ch);


    }
}
