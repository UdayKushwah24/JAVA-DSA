package BinarySearchTree;
// 333
public class MaxSumBST_1373 {
    
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

        class BstPair {
            boolean isbst = true;
            long max = Long.MIN_VALUE;
            long min = Long.MAX_VALUE;
            int sum = 0;
            int ans = 0; // only maximum bst part ka sum

        }

        public int MaxBST_Sum(TreeNode root) {
            return ValidBST(root).ans;
        }

        public BstPair ValidBST(TreeNode root) {
            if (root == null) {
                return new BstPair();
            }
            BstPair lbp = ValidBST(root.left);
            BstPair rbp = ValidBST(root.right);
            BstPair sbp = new BstPair();
            sbp.min = Math.min(lbp.min, Math.min(rbp.min, root.val));
            sbp.max = Math.max(lbp.max, Math.max(rbp.max, root.val));
            sbp.sum = lbp.sum + rbp.sum + root.val;
            sbp.isbst = lbp.isbst && rbp.isbst && lbp.max < root.val && rbp.min > root.val;
            if (sbp.isbst) {
                sbp.ans = Math.max(lbp.ans, Math.max(rbp.ans, sbp.sum));
            } else {
                sbp.ans = Math.max(lbp.ans, rbp.ans);
            }
            return sbp;
        }
    }

    public static void main(String[] args) {

    }
}
