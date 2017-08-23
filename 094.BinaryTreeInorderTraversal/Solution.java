import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 解题思路：
 * 利用栈保存入访问结点的顺序。
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        LinkedList<TreeNode> stack = new LinkedList<>();

        TreeNode node = root;
        stack.addLast(node);
        while (node.left != null) {
            stack.addLast(node.left);
            node = node.left;
        }

        while (! stack.isEmpty()) {
            TreeNode top = stack.pollLast();
            result.add(top.val);
            if (top.right != null) {
                stack.addLast(top.right);
                top = top.right;
                while (top.left != null) {
                    stack.addLast(top.left);
                    top = top.left;
                }
            }

        }

        return result;
    }

//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> res = new ArrayList<Integer>();
//        if (root == null)
//            return res;
//        Stack<TreeNode> stack = new Stack<TreeNode>();
//        TreeNode cur = root;
//        while (cur != null || !stack.empty()) {
//            if (cur != null) {
//                stack.push(cur);
//                cur = cur.left;
//            } else {
//                cur = stack.pop();
//                res.add(cur.val);
//                cur = cur.right;
//            }
//        }
//        return res;
//    }
}