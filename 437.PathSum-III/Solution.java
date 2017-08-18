/**
 * 解题思路：
 * 利用两个递归来求解。
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int count = 0;
    public int pathSum(TreeNode root, int sum) {
        count = 0;
        dfs(root, sum);
        return count;
    }

    private void dfs(TreeNode node, int target) {
        if (node == null) return;
        helper(node, 0, target);
        dfs(node.left, target);
        dfs(node.right, target);
    }

    private void helper(TreeNode root, int sum, int target) {
        if (root == null) return;
        if (sum + root.val == target) {
            count++;
        }
        helper(root.left, root.val + sum, target);
        helper(root.right, root.val + sum, target);
    }
}