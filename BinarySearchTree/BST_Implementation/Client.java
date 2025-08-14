package BinarySearchTree.BST_Implementation;

public class Client {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80 };
        BST bst = new BST(arr);
        bst.Display();
        bst.insertIntoBST(90);
        bst.Display();
    }
}
