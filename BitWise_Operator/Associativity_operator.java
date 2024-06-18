package BitWise_Operator;

public class Associativity_operator {
    public static void main(String[] args) {
        int p = 6*5-34/2;  //Precedence
        /* 
        highest precedence goes to * and /. They are evaluated on the basis
        of left to right associative
            = 30 - 34/2
            = 30 - 17
            = 13
        */
        System.out.println(p);
        int q = 60/5-34*2;
        /* 
            = 12 - 34*2
            = 12 - 68
            = -56
        */
        System.out.println(q);

        // Quick Quiz
        int x = 6;              //  = 6*1/3
        int y = 3;              //  = 6/3
        int k = x*1/y;          //  = 2
        System.out.println(k);

        int b = 1;
        int c = 4;
        int a = 5;
        int f = b*b - (4*a*c)/(2*a);
        System.out.println(f);
    }
}
