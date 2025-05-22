package BinarySearchTree;

public class PrintInRange {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }

    }

    public static void Print_in_range(Node root, int k1, int k2) {

        if (root == null) {
            return;
        }
        if(k1 <= root.data && root.data <= k2) {
            Print_in_range(root.left, k1, k2);
            System.out.print(root.data+" ");
            Print_in_range(root.right, k1, k2);
        } else if (root.data < k1) {
            Print_in_range(root.right, k1, k2);
        } else {
            Print_in_range(root.left, k1, k2);
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            // left subtree
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void main(String[] args) {
        int[] values = { 8, 5, 3, 1, 4, 6, 10, 11, 14  };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        // Print_in_range(root, 5, 12);
        Print_in_range(root, 9, 13);

    }
}
