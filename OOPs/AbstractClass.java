package OOPs;

public class AbstractClass {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
        h1.eat();
        System.out.println(h1.color);
        // System.out.println(h1.changeColor());

        Chicken c1 = new Chicken();
        c1.eat();
        c1.walk();

       //Error - Cannot instantiate the type Animal2 
       //Animal2 a  = new Animal2();
        
       System.out.println(c1.color);
       }
}

abstract class Animal2 {
    String color;

    //Constructor
    Animal2(){
        color = "brown";
    }
    void eat()  {
        System.out.println("Animal Eats........");
    }
    abstract void walk();
}

class Horse extends Animal2 {
    void changeColor() {
        color = "Dark Brown";
    }
    void walk() {
        System.out.println("Walks on four legs.....");
    }
}

class Chicken extends Animal2 {
    void changeColor() {
        color = "Reddish Brown";
    }
    void walk() {
        System.out.println("Walks on two legs");
    }
}