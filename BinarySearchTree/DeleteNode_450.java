package BinarySearchTree;

public class DeleteNode_450 {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {

       /*  
        public int max(TreeNode root) {
            if (root == null) {
                return Integer.MIN_VALUE;
            }
        
            int max = max(root.right);
            return Math.max(root.val, max);
        }
        
        public TreeNode deleteNode(TreeNode root, int key) {
            if (root == null) {
                return null;
            }
            if (root.val < key) {
                root.right = deleteNode(root.right, key);
            } else if (root.val > key) {
                root.left = deleteNode(root.left, key);
            } else {
                // 1 or 0 child
                if (root.left == null) {
                    return root.right;
                } else if (root.right == null) {
                    return root.left;
                } else {
                    // if node have both child
                    int max = max(root.left);
                    root.left = deleteNode(root.left, max);
                    root.val = max;
                }
            }
            return root;
        }
       */ 
    
       
       public int min(TreeNode root) {
            if (root == null) {
                return Integer.MAX_VALUE;
            }

            int min = min(root.left);
            return Math.min(root.val, min);
        }

        public TreeNode deleteNode(TreeNode root, int key) {
            if (root == null) {
                return null;
            }
            if (root.val < key) {
                root.right = deleteNode(root.right, key);
            } else if (root.val > key) {
                root.left = deleteNode(root.left, key);
            } else {
                // 1 or 0 child
                if (root.left == null) {
                    return root.right;
                } else if (root.right == null) {
                    return root.left;
                } else {
                    // if node have both child
                    int min = min(root.right);
                    root.right = deleteNode(root.right, min);
                    root.val = min;
                }
            }
            return root;
        }
    }
    
}
