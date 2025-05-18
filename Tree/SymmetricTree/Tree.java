package Tree.SymmetricTree;

import java.util.Scanner;

public class Tree {
    class Node {
        int val;
        Node left;
        Node right;
    }

    private Node root;
    Scanner sc = new Scanner(System.in);

    // Constructor
    public Tree() {
        root = CreateTree();
    }

    private Node CreateTree() {
        int item = sc.nextInt();
        Node nn = new Node();
        nn.val = item;

        // Left Sub Tree
        // hLC -> Has Left Child
        Boolean hLC = sc.nextBoolean();
        if (hLC) {
            nn.left = CreateTree();
        }

        // Right Sub Tree
        // hRC -> Has Right Child
        Boolean hRC = sc.nextBoolean();
        if (hRC) {
            nn.right = CreateTree();
        }
        return nn;
    }

    public void Display() {
        Display(root);
    }

    // Display Tree
    private void Display(Node nn) {
        if (nn == null) {
            return;
        }
        String s = "";
        s = " <--" + nn.val + "--> ";
        if (nn.left != null) {
            s = nn.left.val + s;
        } else {
            s = " ." + s;
        }
        if (nn.right != null) {
            s = s + nn.right.val;
        } else {
            s = s + ". ";
        }
        System.out.println(s);
        Display(nn.left);
        Display(nn.right);
    }

    // Check Symmetry of Tree

    public boolean Symmetric() {
        return Symmetric(root.left, root.right);
    }

    private boolean Symmetric(Node root1, Node root2) {
        if(root1 == null && root2 == null) {
            return true;
        }
        if(root1 == null || root2 == null) {
            return false;
        }
        if(root1.val != root2.val) {
            return false;
        }
        boolean left = Symmetric(root1.left, root2.right);
        boolean right = Symmetric(root1.right, root2.left);
        return left && right;
    }

}
