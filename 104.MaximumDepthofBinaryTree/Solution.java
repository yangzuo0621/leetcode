class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

/**
 * 解题思路：
 * 利用递归分别求左子树和右子树的最大深度。
 * 一年前的写法跟今天的写法竟然一模一样。改用下面简洁的写法。
 *
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

//    public int maxDepth(TreeNode root) {
//        if (root == null) return 0;
//        if (root.left == null && root.right == null) return 1;
//        int left = 0;
//        if (root.left != null)
//            left = maxDepth(root.left) + 1;
//        int right = 0;
//        if (root.right != null)
//            right = maxDepth(root.right) + 1;
//        return Math.max(left, right);
//    }
}