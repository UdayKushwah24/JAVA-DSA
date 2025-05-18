package Tree.SymmetricTree;

public class Client {
    public static void main(String[] args) {

        // Input : 1 true 2 true 3 false false true 4 false false true 2 true 4 false false true 3 false false
        Tree bt = new Tree();
        bt.Display();
        System.out.println(bt.Symmetric());
    }
}
