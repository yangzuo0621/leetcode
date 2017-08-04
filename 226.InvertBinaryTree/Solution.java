/**
 * 解题思路：
 * 利用递归分别交换结点的左子树和右子树，最后再交换结点自身。
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        invertTree(root.left);
        invertTree(root.right);
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left = right;
        root.right = left;
        return root;
    }
}