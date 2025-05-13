package Tree.MaxMin_Tree;

import java.util.Scanner;

public class Tree  {
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

   
    public int maximum() {
        return maximum(root);
    }

    private int maximum(Node nn) {
        if(nn == null) {
            return Integer.MIN_VALUE;
        }
         
        int left_max = maximum(nn.left);
        int right_max = maximum(nn.right);
        return Math.max(nn.val,Math.max(left_max, right_max));
    }
}
