import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 解题思路：
 * 利用栈保存左右子树顺序。
 * 注意先入右子树再左子树。
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        LinkedList<TreeNode> stack = new LinkedList<>();
        stack.addLast(root);
        while (! stack.isEmpty()) {
            TreeNode top = stack.pollLast();
            result.add(top.val);
            if (top.right != null) stack.addLast(top.right); // 先右
            if (top.left != null) stack.addLast(top.left); // 再左
        }

        return result;
    }
}