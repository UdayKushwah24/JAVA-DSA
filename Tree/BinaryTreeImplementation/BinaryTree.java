package Tree.BinaryTreeImplementation;
import java.util.*;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {
    class Node {
        int val;
        Node left;
        Node right;
    }

    private Node root;
    Scanner sc = new Scanner(System.in);

    // Constructor
    public BinaryTree() {
        root = CreateTree();
    }

    // <-------------------------| Creation of Tree |------------------------------>
    private Node CreateTree() {
        int item = sc.nextInt();
        Node nn = new Node();
        nn.val = item;
        boolean hasLeftChild = sc.nextBoolean(); // has left child
        if (hasLeftChild) {
            nn.left = CreateTree();
        }
        boolean hasRightChild = sc.nextBoolean(); // has right child
        if (hasRightChild) {
            nn.right = CreateTree();
        }
        return nn;

    }

    // <-------------------------| Display |------------------------------>
    public void Display() {
        Display(root);
    }

    private void Display(Node nn) {
        if (nn == null) {
            return;
        }
        String str = "<--" + nn.val + "-->";
        if (nn.left != null) {
            str = nn.left.val + str;
        } else {
            str = "." + str;
        }
        if (nn.right != null) {
            str = str + nn.right.val;
        } else {
            str = str + ".";
        }
        System.out.println(str);
        Display(nn.left);
        Display(nn.right);
    }

    // <-------------------------| Height of Tree |------------------------------>
    public int heightTree() {
        return heightTree(root);
    }

    public int heightTree(Node nn) {

        if (nn == null) {
            return -1;
        }

        int leftHeight = heightTree(nn.left);
        int rightHeight = heightTree(nn.right);
        return (Math.max(leftHeight, rightHeight) + 1);
    }

    /* 
        Tree Traversal

     1. Pre-Order
     2. In-Order
     3. Post-Order
     4. Level-Order
     */
    // <-------------------------| Pre-Order |------------------------------>
    public void PreOrder() {
        PreOrder(root);
    }

    public void PreOrder(Node nn) {
        if (nn == null) {
            return;
        }
        System.out.print(nn.val + " ");
        PreOrder(nn.left);
        PreOrder(nn.right);
    }

    // <-------------------------| In-Order |------------------------------>
    public void InOrder() {
        InOrder(root);
    }

    public void InOrder(Node nn) {
        if (nn == null) {
            return;
        }
        InOrder(nn.left);
        System.out.print(nn.val + " ");
        InOrder(nn.right);
    }

    // <-------------------------| Post-Order |------------------------------>
    public void PostOrder() {
        PostOrder(root);
    }

    public void PostOrder(Node nn) {
        if (nn == null) {
            return;
        }
        PostOrder(nn.left);
        PostOrder(nn.right);
        System.out.print(nn.val + " ");
    }

    // <-----------------------| Level-Order Traversal |-------------------------->
    public void LevelOrder() {
        LevelOrder(root);
    }

    public void LevelOrder(Node nn) {
        if (nn == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node n = q.poll();
            System.out.print(n.val+" ");
            if(n.left != null) {
                q.add(n.left);
            }
            if(n.right != null) {
                q.add(n.right);
            }

        }

    }
}
