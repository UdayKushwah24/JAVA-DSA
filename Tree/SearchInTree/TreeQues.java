package Tree.MaxMin_Tree;

import java.util.Scanner;

public class TreeQues {
    class Node {
        int val;
        Node left;
        Node right;
    }

    private Node root;
    Scanner sc = new Scanner(System.in);

    // Constructor
    public TreeQues() {
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

   /*  public void Display() {
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
    } */


    public boolean find(int item) {
        return find(root,item);
    }

    private boolean find(Node nn, int item) {
        if(nn == null) {
            return false;
        }
        if(nn.val == item) {
            return true;
        }
        boolean left = find(nn.left, item);
        boolean right = find(nn.right, item);
        return left || right;
    }
}
