/**
 * 解题思路：
 * 先序遍历。
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        return dfs(root, sum, 0);
    }

    private boolean dfs(TreeNode node, int sum, int count) {
        if (node == null) return false;

        if (node.left == null && node.right == null) {
            return node.val + count == sum;
        }

        return dfs(node.left, sum, count + node.val) || dfs(node.right, sum, count + node.val);
    }
}