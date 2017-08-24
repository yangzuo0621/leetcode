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
    public int findBottomLeftValue(TreeNode root) {
        if (root == null) throw new IllegalArgumentException();
        Queue<TreeNode> queue = new LinkedList<>();
        int result = root.val;
        queue.add(root);
        TreeNode pre = root, cur = root;
        while (! queue.isEmpty()) {
            TreeNode head = queue.poll();
            if (head.left != null) {
                queue.add(head.left);
                cur = head.left;
            }
            if (head.right != null) {
                queue.add(head.right);
                cur = head.right;
            }
            if (pre == head) {
                pre = cur;
                if (! queue.isEmpty()) result = queue.peek().val;
            }
        }
        return result;
    }
}