/**
 * 解题思路：
 * 使用层次遍历或树的遍历来解决。
 * 可以使用递归。
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean findTarget(TreeNode root, int k) {
        if (root == null) return false;

        Set<Integer> set = new HashSet<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (! queue.isEmpty()) {
            TreeNode node = queue.remove();
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
            int diff = k - node.val;
            if (set.contains(diff)) {
                return true;
            } else {
                set.add(node.val);
            }
        }

        return false;
    }
}