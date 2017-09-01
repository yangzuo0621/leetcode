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
    public void flatten(TreeNode root) {
        if (root == null) return;
        LinkedList<TreeNode> stack = new LinkedList<>();
        if (root.right != null) stack.addLast(root.right);
        if (root.left != null) stack.addLast(root.left);
        TreeNode work = root;
        while (! stack.isEmpty()) {
            TreeNode node = stack.pollLast();
            if (node.right != null) stack.addLast(node.right);
            if (node.left != null) stack.addLast(node.left);
            work.right = node;
            work.left = null;
            work = node;
        }
    }
}
