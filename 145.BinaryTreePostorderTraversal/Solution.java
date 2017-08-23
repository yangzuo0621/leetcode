import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 解题思路：
 * 使用栈保存入栈顺序。
 * 同时在出栈时要判断是左子树结点还是右子树结点。
 * 需要很仔细实现。
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        LinkedList<TreeNode> stack = new LinkedList<>();
        stack.addLast(null);
        TreeNode node = root;
        stack.addLast(node);
        while (node.left != null) { // 左子树结点入栈
            stack.addLast(node.left);
            node = node.left;
        }

        while (! stack.isEmpty()) {
            node = stack.peekLast();
            if (node.right != null) { // 左子树结点入栈
                stack.addLast(node.right);
                node = node.right;
                while (node.left != null) {
                    stack.add(node.left);
                    node = node.left;
                }
                continue;
            }

            result.add(node.val);
            stack.pollLast();
            TreeNode pre = stack.peekLast();
            while (pre != null && pre.right == node) { // 右子树结点出栈
                node = stack.pollLast();
                result.add(node.val);
                pre = stack.peekLast();
            }

            if (pre == null) stack.pollLast();
        }
        return result;
    }
}