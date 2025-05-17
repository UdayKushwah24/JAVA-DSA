package Tree.BinaryTreeImplement;

public class Client {

    // Input : 10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.Display();
        System.out.println("Maximum Node : "+  bt.max());
        System.out.println("Minimum Node : "+  bt.min());
        System.out.println(bt.find(300));
        System.out.println(bt.Height());
        bt.PreOrder();
        System.out.println();
        bt.InOrder();
        System.out.println();
        bt.PostOrder();
        System.out.println();
        bt.LevelOrder();
    }
}
