package BinarySearchTree;

import java.nio.file.Path;

import Arrays_List.static_var;

public class RootToLeafPaths {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
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

    public static void Path(Node root, String path) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            path = path + root.data;
            System.out.println(path);
        }

        Path(root.left, path + root.data + " -> ");
        Path(root.right, path + root.data + " -> ");
    }

    public static void main(String[] args) {
        int[] values = { 8, 5, 3, 1, 4, 6, 10, 11, 14  };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        Path(root, "");
    }
}
