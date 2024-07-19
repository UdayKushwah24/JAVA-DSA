package OOPs;

public class Hybrid_Inheritance {
    
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
    class Mammal extends  ANIMAL {
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
    class Dog extends  Mammal {
        void tail () {
            System.out.println("Having.....");
        }
    }
    