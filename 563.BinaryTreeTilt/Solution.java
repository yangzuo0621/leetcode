/**
 * 解题思路：
 * 后序遍历。
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {

    private int tilt = 0;
    public int findTilt(TreeNode root) {
        tilt = 0;
        helper(root);
        return tilt;
    }

    public int helper(TreeNode node) {
        if (node == null) return 0;
        int left = helper(node.left);
        int right = helper(node.right);
        tilt += Math.abs(left - right);
        return left + right + node.val;
    }

}
