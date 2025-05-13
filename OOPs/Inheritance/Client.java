package OOPs.Inheritance;

public class Client {
    public static void main(String[] args) {
        // Case 1
        // P obj = new P();
        // System.out.println(obj.d);
        // System.out.println(obj.d2);
        // obj.fun();
        // obj.fun2();



        
        // Case 2
        P obj1 = new C();
        // System.out.println(obj1.d);
        // System.out.println(obj1.d2);
        // System.out.println(obj1.d1);  // give error
        // System.out.println(((C) obj1).d1);
        // System.out.println(((C) obj1).d);
        // obj1.fun();
        // obj1.fun2();
        // ((C) (obj1)).fun1();




        // Case 3
        // C obj2 = new P();   // Type mismatch: cannot convert from P to C
        // System.out.println(obj2.d);
        // System.out.println(obj2.d2);




        // Case 4 - Inheritance
        // C obj3 = new C();
        // System.out.println(obj3.d);
        // // System.out.println(((P)(obj3)).d);
        // System.out.println(obj3.d1);
        // System.out.println(obj3.d2);
        // obj3.fun();
        // ((P)(obj3)).fun();  // always child class ka hi method chalega, even type cast karne ke baad bhi
        // obj3.fun1();
        // obj3.fun2();

    }
}
