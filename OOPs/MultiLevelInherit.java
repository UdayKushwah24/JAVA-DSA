package OOPs;

public class MultiLevelInherit {
    public static void main(String[] args) {
        Dog Oggy = new Dog();
        Oggy.eat();
        Oggy.legs = 4;
        System.out.println(Oggy.legs);

        Oggy.breed = "Lebra";
        System.out.println(Oggy.breed);
    }
}
//Parent class or Base class
class Animals {
    String color;

    void eat() {
        System.out.println("Eats");
    }
    void breathe () {
        System.out.println("Breathes");
    }
}

//Child class or Derived class or subclass
class Mammal extends Animals {
    int legs;
}

//Child class or Derived class or subclass
class Dog extends Mammal {
    String breed;
}