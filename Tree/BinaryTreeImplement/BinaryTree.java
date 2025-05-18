package Tree.BinaryTreeImplement;

import java.util.LinkedList;
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

    // <------------|| Maximum Node of Tree ||------------>
    public int max() {
        return max(root);
    }

    private int max(Node node) {

        if (node == null) {
            return Integer.MIN_VALUE;
        }
        int lmax = max(node.left);
        int rmax = max(node.right);
        return Math.max(node.val, Math.max(lmax, rmax));

    }

    // <------------|| Minimum Node of Tree ||------------>
    public int min() {
        return min(root);
    }

    private int min(Node node) {

        if (node == null) {
            return Integer.MAX_VALUE;
        }
        int lmin = min(node.left);
        int rmin = min(node.right);
        return Math.min(node.val, Math.min(lmin, rmin));

    }

    // <------------|| Search Node in a Tree ||------------>
    public boolean find(int item) {
        return find(this.root, item);
    }

    private boolean find(Node node, int item) {
        if (node == null) {
            return false;
        }
        if (node.val == item) {
            return true;
        }
        boolean leftfound = find(node.left, item);
        boolean rightfound = find(node.right, item);

        return (leftfound || rightfound);
    }

    // <------------|| Height of a Tree ||------------>
    public int Height() {
        return Height(root);
    }

    private int Height(Node node) {
        if (node == null) {
            return -1;
        }
        int leftHeight = Height(node.left);
        int rightHeight = Height(node.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    // <------------|| Types of Traversal in Tree ||------------>
    // <------------|| 1. Pre-Order ||------------>
    public void PreOrder() {
        PreOrder(root);
    }

    private void PreOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.val + " ");
        PreOrder(node.left);
        PreOrder(node.right);
    }

    // <------------|| 2. In-Order ||------------>
    public void InOrder() {
        InOrder(root);
    }

    private void InOrder(Node node) {
        if (node == null) {
            return;
        }
        InOrder(node.left);
        System.out.print(node.val + " ");
        InOrder(node.right);
    }

    // <------------|| 3. Post-Order ||------------>
    public void PostOrder() {
        PostOrder(root);
    }

    private void PostOrder(Node node) {
        if (node == null) {
            return;
        }
        PostOrder(node.left);
        PostOrder(node.right);
        System.out.print(node.val + " ");
    }

    // <------------|| 4. Level-Order ||------------>
    public void LevelOrder() {
        // LinkedList<Node> queue = new LinkedList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node rv = queue.remove();
            System.out.print(rv.val+" ");
            if(rv.left != null) {
                queue.add(rv.left);
            }
            if(rv.right != null) {
                queue.add(rv.right);
            }
        }

    }


    
    // <------------|| Path Sum ||------------>
    public boolean PathSum(int target) {
        return PathSum(root, target);
    }

    private boolean PathSum(Node root, int targetSum) {
        if (root == null ) {
            return false;
        }
        if(root.left == null && root.right == null) {
            return targetSum-root.val == 0;
        }
        
        boolean left = PathSum(root.left, targetSum-root.val);
        boolean right = PathSum(root.right, targetSum-root.val);
        return left || right;
    }

}
