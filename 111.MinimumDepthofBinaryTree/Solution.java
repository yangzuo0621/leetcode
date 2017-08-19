import java.util.LinkedList;
import java.util.Queue;

/**
 * 解题思路：
 * 层次遍历。
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 1;
        TreeNode pre = root, cur = root;
        while (! queue.isEmpty()) {
            TreeNode node = queue.remove();
            if (node.left == null && node.right == null) return level;
            if (node.left != null) {
                queue.add(node.left);
                cur = node.left;
            }
            if (node.right != null) {
                queue.add(node.right);
                cur = node.right;
            }
            if (node == pre) {
                level++;
                pre = cur;
            }
        }
        return level;
    }
}