/**
 * 解题思路：
 * 递归的思想。
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        if (root.left != null && root.left.left == null && root.left.right == null) {
            return root.left.val + sumOfLeftLeaves(root.right);
        }
        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }

//    private int sum = 0;
//    public int sumOfLeftLeaves(TreeNode root) {
//        helper(root, false);
//        return sum;
//    }
//
//    private void helper(TreeNode root, boolean isLeft) {
//        if (root == null) return;
//        if (root.left == null && root.right == null) {
//            if (isLeft) sum += root.val;
//        }
//        helper(root.left, true);
//        helper(root.right, false);
//    }
}