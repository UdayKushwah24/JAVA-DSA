package OOPs;

public class HierarchialInherit {
    public static void main(String[] args) {
        Mammal Human = new Mammal();
        Human.eat();
        Human.walk();
        System.out.println("---------------");

        Fish Catla = new Fish();
        Catla.eat();
        Catla.swim();
        Catla.breathe();
        System.out.println("---------------");

        Bird Sparrow = new Bird();
        Sparrow.eat();
        Sparrow.fly();

    }
}

//Derived class
class ANIMALS{
String color;

    void eat() {
        System.out.println("Eats");
    }
    void breathe () {
        System.out.println("Breathes");
    }
}

//Child class or Derived class or subclass
class Mammal extends  ANIMALS {
    void walk() {
        System.out.println("Walk.....");
    }
}

//Child class or Derived class or subclas
class Fish extends ANIMALS {
    void swim() {
        System.out.println("Swim.....");
    }
}

//Child class or Derived class or subclas
class Bird extends ANIMALS {
    void fly() {
        System.out.println("Fly.....");
    }
}
