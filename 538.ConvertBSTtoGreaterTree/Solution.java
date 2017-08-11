/**
 * 解题思路：
 * 后序遍历。
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    private int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        sum = 0;
        helper(root);
        return root;
    }

    private void helper(TreeNode node) {
        if (node == null) return;
        helper(node.right);
        sum = sum + node.val;
        node.val = sum;
        helper(node.left);
    }
}