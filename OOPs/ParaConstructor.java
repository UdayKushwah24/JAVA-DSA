package OOPs;

public class ParaConstructor {
    public static void main(String[] args) {
        Students s1 = new Students("Uday Kushwah",34);
        System.out.println(s1.name);
        System.out.println(s1.age);

    }
}

class Students  {
    String name ;
    int age ;
    //Parameterised constructor
    Students (String name,int age ) {
        this.name = name ;
        this.age = age;
    }
}
