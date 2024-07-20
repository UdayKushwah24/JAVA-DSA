package OOPs;

public class HierarchyAbstract {
    public static void main(String[] args) {
        Mustang myhorse = new Mustang();
        //Animal -> Horse -> Mustang
        
        System.out.println(myhorse.equals(myhorse));
    }
}
//Base class
abstract class Animals2 {
    //Constructor
    Animals2(){
        System.out.println("Animal constructor called.......");
    }
}
//Derived class
class Horses extends Animals2 {
    //Constructor
    Horses() {
       System.out.println("Horse costructor called.........");
    }
}
//Derived class
class Mustang extends Horses {
    //Constructor
    Mustang() {
       System.out.println("Mustang costructor called.......");
    }
}
