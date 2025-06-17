package Leetcode.Tree;

import java.util.*;

public class EvenOddTree_1609 {
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
        public boolean isEvenOddTree(TreeNode root) {
            return LevelOrderTraversal(root);
        }

        public boolean CheckIncreasing(List<Integer> ll, int level) {
            boolean flag = true;
            if(level % 2 != 0) {
                flag = false;
            }
            if (ll.get(0) % 2 == 0) {
                flag = false;
            }
            for (int i = 1; i < ll.size(); i++) {
                if (ll.get(i - 1) >= ll.get(i) || ll.get(i) % 2 == 0) {
                    flag = false;
                }

            }
            return flag;
        }

        public boolean CheckDecreasing(List<Integer> ll, int level) {
            boolean flag = true;
            if (level% 2 == 0) {
                flag = false;
            }
            if (ll.get(0) % 2 != 0) {
                flag = false;
            }
            for (int i = 1; i < ll.size(); i++) {
                if (ll.get(i - 1) <= ll.get(i) || ll.get(i) % 2 != 0) {
                    flag = false;
                }
            }
            return flag;
        }

        public boolean LevelOrderTraversal(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            boolean flag = true;
            boolean ans = true;
            int level = -1;
            while (!queue.isEmpty()) {
                List<Integer> ll = new ArrayList<>();
                int size = queue.size();
                int sum = 0;
                level += 1;
                for (int i = 0; i < size; i++) {
                    TreeNode rv = queue.remove();
                    ll.add(rv.val);
                    if (rv.left != null) {
                        queue.add(rv.left);
                    }
                    if (rv.right != null) {
                        queue.add(rv.right);
                    }
                }
                if(flag && CheckIncreasing(ll, level)) {
                    ans = false;
                } else {
                    ans = false;
                }
                flag = !flag;
            }
            return ans;
        }
    }
}
