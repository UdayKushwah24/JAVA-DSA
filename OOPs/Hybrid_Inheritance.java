package OOPs;

public class Hybrid_Inheritance {
    public static void main(String[] args) {
        
    }
}
//Derived class
class ANIMAL{
    String color;
    
        void eat() {
            System.out.println("Eats");
        }
        void breathe () {
            System.out.println("Breathes");
        }
    }
    
    //Child class or Derived class or subclass
    class Mammals extends  ANIMAL {
        void walk() {
            System.out.println("Walk.....");
        }
    }
    
    //Child class or Derived class or subclas
    class Fish extends ANIMAL {
        void swim() {
            System.out.println("Swim.....");
        }
    }

    //Child class or Derived class or subclass
    class Dog extends  Mammals {
        void tail () {
            System.out.println("Having.....");
        }
    }
    