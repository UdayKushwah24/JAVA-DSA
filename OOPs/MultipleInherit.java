package OOPs;

public class MultipleInherit {
    public static void main(String[] args) {
        Bear b1 = new Bear();
        b1.EatGrass();
        b1.EatMeat();
    }
}

interface Hervibore {
    void EatGrass() ;
}

interface Carnivore {
    void EatMeat() ;
}
class Bear implements Hervibore,Carnivore {
    public void EatGrass(){
        System.out.println("I am eating grass.");
    }
    public void EatMeat(){
        System.out.println("I am eating Meat.");
    }
}