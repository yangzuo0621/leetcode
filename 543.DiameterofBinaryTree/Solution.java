/**
 * 解题思路：
 * 后序遍历
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    private int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        max = 0;
        treeHeight(root);
        return max;
    }

    private int treeHeight(TreeNode root) {
        if (root == null) return 0;
        int left = treeHeight(root.left) + 1;
        int right = treeHeight(root.right) + 1;
        max = Math.max(left + right - 2, max);  // 这里需要减2
        return Math.max(left, right);
    }
}