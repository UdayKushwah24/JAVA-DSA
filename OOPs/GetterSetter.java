package OOPs;

public class GetterSetter {
    public static void main(String[] args) {
        pencil p1 = new pencil();
        p1.setColor("blue");
        System.out.println(p1.getColor());

        p1.setTip(9);
        System.out.println(p1.getTip());
    }
}

class pencil {
    private String color;
    private int tip;
    void setColor(String newcolor) {
        this.color = newcolor;
    }
    String getColor() {
        return this.color;
    }
    void setTip(int newtip) {
        this.tip = newtip;
    }
    int getTip() {
        return tip;
    }
}