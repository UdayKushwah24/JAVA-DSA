package Object_Oriented_Programming;
class Employee{
    int salary;
    String name;
    public String getsalary(String name,int salary){
        return name+"'s salary is $"+salary;
    }
    public void setname(String n){
        name = n;
    }
    public String getname(){
        return ""+name;
    }

}

public class Practice_01 {
    public static void main(String[] args) {
    Employee uday = new Employee();
    Employee kamal = new Employee();
    
    uday.setname("Mr. Uday Kushwah");
    uday.salary = 30000;

    kamal.setname("Mr. Kamal Rajput");
    kamal.salary = 54000;

    System.out.println(uday.getsalary(uday.name,uday.salary));
    System.out.println(uday.getsalary(kamal.name,kamal.salary));
    
    System.out.println(uday.getname());
    System.out.println(kamal.getname());
    }
}
