package Object_Oriented_Programming;
class Square{
    int side;
    public void area(){
        System.out.println("Area is : "+(side*side));
    }
    public void perimeter(){
        System.out.println("Perimeter is : "+(4*side));
    }
}
public class Practice_03 {
    public static void main(String[] args) {
        Square square = new Square();
        square.side = 3;
        square.area();
        square.perimeter();
    }
}
