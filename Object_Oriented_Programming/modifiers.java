package Object_Oriented_Programming;
class Employees{
    private int salary;
    private String name;

    public void setsalary(int s){
        this.salary = s;  // salary = s;
    }
    public int getsalary(){
        return salary;
    }
    public void setname(String n){
        this.name = n;   // name = n;
    }
    public String getname(){
        return name;
    }
    
}

public class modifiers {
    public static void main(String[] args) {
    Employees uday = new Employees();
    // Employees kamal = new Employees();
    
    // uday.name="Mr. Uday Kushwah";
    // uday.salary = 30000;   --> throws an error due to private access modifier
    
    uday.setname("Uday Kushwah");
    uday.setsalary(9044);
    System.out.println(uday.getname());
    System.out.println(uday.getsalary());
    
    }
}
