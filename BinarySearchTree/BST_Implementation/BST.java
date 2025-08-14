package BinarySearchTree.BST_Implementation;
 
public class BST {
    class Node {
        int val;
        Node left;
        Node right;

        Node() {
            
        }
        Node(int val) {
            this.val =val;
        }
    }

    private Node root;

    public BST(int[] arr) {
        root = CreateBST(arr, 0, arr.length - 1);
    }

    public Node CreateBST(int[] arr, int si, int ei) {
        if (si > ei) {
            return null;
        }
        int mid = (si + ei) / 2;
        Node nn = new Node();
        nn.val = arr[mid];
        nn.left = CreateBST(arr, si, mid - 1);
        nn.right = CreateBST(arr, mid + 1, ei);
        return nn;
    }

   /*  public void Display() {
        Display(root);
    }

    private void Display(Node node) {
        if (node == null) {
            return;
        }

        String s = "";
        s += "<--" + node.val + "-->";
        if (node.left != null) {
            s = node.left.val + s;
        } else {
            s = "." + s;
        }
        if (node.right != null) {
            s += node.right.val ;
        } else {
            s += ".";
        }
        System.out.println(s);
        Display(node.left);
        Display(node.right);
    } */
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


    public void insertIntoBST(int val) {
        root = insertIntoBST(root, val);
    }
    public Node insertIntoBST(Node root, int val) {
        if (root == null) {
            
            return new Node(val);
        }
        if (root.val < val) {
            root.right = insertIntoBST(root.right, val);
        } else {
            root.left = insertIntoBST(root.left, val);
        }
        return root;
    }
}
