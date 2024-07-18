package OOPs;

public class ClassObject {
    public static void main(String[] args) {
        Pen p1  = new Pen();     //created a Pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.color);

        p1.setTip(9);
        System.out.println(p1.tip);

        Student s1 = new Student();
        s1.name = "Rohan";
        System.out.println(s1.name);

        s1.calcPercent(10, 20, 30);
        System.out.println(s1.percent);
        
    }

}
class Pen{
    String color;    //Properties
    int tip;

    void setColor (String newColor ) {     //functions
        color = newColor;
    }
    void setTip (int newTip) {
        tip = newTip;
    }
}

class Student {
    String name ;
    int age;
    float percent;

    void calcPercent (int phy, int math, int chem) {
        percent = (phy + math + chem)/3;
    }
    void setAge (int newAge) {
        age = newAge;
    }
}