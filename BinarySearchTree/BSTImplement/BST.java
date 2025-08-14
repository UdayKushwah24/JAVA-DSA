package BinarySearchTree.BSTImplement;

public class BST {
    class Node {
        int val;
        Node left;
        Node right;
    }

    private Node root;
    public BST(int[] arr) {
        root = CreateBST(arr, 0, arr.length - 1);
    }

    private Node CreateBST(int[] arr, int start, int end) {

        if (end < start) {
            return null;
        }
        int mid = (start + end) / 2;
        Node nn = new Node();
        nn.val = arr[mid];
        nn.left = CreateBST(arr, start, mid - 1);
        nn.right = CreateBST(arr, mid + 1, end);
        return nn;
        
    }
    public void Display() {
        Display(root,"", true);
    }

    private void Display(Node node, String prefix, boolean isLeft) {
        if (node == null) {
            return;
        }

        // Right subtree first (so it goes on top)
        Display(node.right, prefix + (isLeft ? "│   " : "    "), false);

        // Print current node
        System.out.println(prefix + (isLeft ? "└── " : "┌── ") + node.val);

        // Left subtree
        Display(node.left, prefix + (isLeft ? "    " : "│   "), true);
    }

}
