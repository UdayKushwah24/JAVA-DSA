package Tree.TwoTree_Equal ;

public class Client {
    public static void main(String[] args) {

        // Input : 1 true 2 true 3 false false true 4 false false true 2 true 4 false false true 3 false false
        Tree tree = new Tree();
        System.out.println("Enter Tree 1 : ");
        Tree.Node root1 = tree.CreateTree();

        System.out.println("Enter Tree 2 : ");
        Tree.Node root2 = tree.CreateTree();

        System.out.println("Tree 1 : ");
        tree.Display(root1);
        
        System.out.println("Tree 2 : ");
        tree.Display(root2);
 
        boolean areEqual = tree.TreeEqual(root1, root2);
        System.out.println(areEqual);
    }
}
