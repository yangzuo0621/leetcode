import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 解题思路：
 * 利用队列保存树的层次结构。
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        TreeNode cur = root;
        TreeNode level = root;
        List<Integer> content = new ArrayList<>();
        while (! queue.isEmpty()) {
            TreeNode head = queue.poll();
            content.add(head.val);
            if (head.left != null) {
                queue.add(head.left);
                cur = head.left;
            }
            if (head.right != null) {
                queue.add(head.right);
                cur = head.right;
            }
            if (head == level) {
                result.add(content);
                content = new ArrayList<>();
                level = cur;
            }
        }
        return result;
    }
}