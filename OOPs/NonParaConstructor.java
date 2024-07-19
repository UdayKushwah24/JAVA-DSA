package OOPs;

public class NonParaConstructor {
    public static void main(String[] args) {
        Faculty f1 = new Faculty();
        System.out.println(f1.department);
    }
}
class Faculty{
    int salary;
    String department;
    //Non-parameterised constructor
    Faculty(){
        System.out.println("Constructor called...");
    }
}
