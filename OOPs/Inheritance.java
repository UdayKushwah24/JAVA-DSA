package OOPs;

public class Inheritance {
    public static void main(String[] args) {
        Fish Rohu = new Fish();
        Rohu.eat();
        Rohu.swim();
    }
}
//Parent class or Base class
class Animal {
    String color;

    void eat() {
        System.out.println("Eats");
    }
    void breathe () {
        System.out.println("Breathes");
    }
}

//Child class or Derived class or subclass
class Fish extends Animal {
    int fins ;

    void swim() {
        System.out.println("Swims in water....");
    }
}

