package BitWise_Operator;

public class Incre_decre_ment {
    public static void main(String[] args) {
        //int a = 45+4;  //int = int+int;
        //System.out.println(a);
 
        int b = 10;
        System.out.println(b++); // First print then increases
        System.out.println(b);
        System.out.println("************");
        int c = 20;
        System.out.println(++c); // First increases then print 
        System.out.println("************");
        
        
        int i = 12;
        int x = i++; //first x is assigned i then i is incremented (20)
        System.out.println(x);
        System.out.println(i);
        System.out.println("************");

        int j = 12;
        int k = ++j; //first j is incremented  then k is  assigned j (20)
        System.out.println(j);
        System.out.println(k);
    }
}
