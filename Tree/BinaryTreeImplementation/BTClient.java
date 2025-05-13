package Tree.BinaryTreeImplementation;

public class BTClient {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.Display();

        // 10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false

        System.out.println(bt.heightTree());
        bt.PreOrder();
        System.out.println();

        bt.InOrder();
        System.out.println();

        bt.PostOrder();
        System.out.println();

        bt.LevelOrder();
         
       
    }
}
 