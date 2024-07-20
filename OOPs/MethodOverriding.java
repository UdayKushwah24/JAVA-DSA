package OOPs;

public class MethodOverriding {
    public static void main(String[] args) {
        Buffalo b1 = new Buffalo();
        b1.eat();
    }
}
//Base-class
class Animal1 {
   void eat() {
    System.out.println("Eat anything .......");
   }
}
//Derived-class
class Buffalo extends Animal1 {
    void eat() {
        System.out.println("Eat grasses........");
    }
}