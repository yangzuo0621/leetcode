/**
 * 解题思路：
 * 中序遍历。
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        if (root == null) throw new IllegalArgumentException();
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode node = root;
        while (node != null) {
            stack.addLast(node);
            node = node.left;
        }
        int count = 0;
        while (! stack.isEmpty()) {
            node = stack.pollLast();
            if (++count == k) return node.val;
            if (node.right != null) {
                stack.addLast(node.right);
                node = node.right;
                while (node.left != null) {
                    stack.addLast(node.left);
                    node = node.left;
                }
            }
        }
        return 0;
    }
}