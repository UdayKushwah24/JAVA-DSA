package BinarySearchTree;

import java.util.*;

public class CreateTreeUsingLevelOrder {
    class Node {
        int val;
        Node left;
        Node right;
    }

    static private Node root;

    public CreateTreeUsingLevelOrder() {
        createTree();
    }

    private static void createTree() {
        Scanner sc = new Scanner(System.in);
        Queue<Node> q = new LinkedList<>();
        Node nn = new Node();
        nn.val = sc.nextInt();
        root = nn;
        q.add(nn);
        while (!q.isEmpty()) {
            Node r = q.poll();
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            if (c1 != -1) {
                Node node = new Node();
                node.val = c1;
                r.left = node;
                q.add(node);
            }
            if (c2 != -1) {
                Node node = new Node();
                node.val = c2;
                r.right = node;
                r.left = node;
                q.add(node);
            }
        }

    }


    public void Display() {
        Display(root, "", true);
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

    public static void main(String[] args) {
        crea
    }
}
