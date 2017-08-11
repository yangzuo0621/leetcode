/**
 * 解题思路：
 * 前序遍历，添加标志位表示是否插入空括号。
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public String tree2str(TreeNode t) {
        if (t == null) return "";
        StringBuilder builder = new StringBuilder();
        helper(t, builder, false);
        String result = builder.toString();
        return result.substring(1, result.length()-1);
    }

    private void helper(TreeNode node, StringBuilder builder, boolean flag) {
        if (flag) {
            builder.append("()");
        } else {
            if (node == null) return;
            builder.append("(").append(node.val);
            if (node.left == null && node.right != null)
                helper(node.left, builder, true);
            else
                helper(node.left, builder, false);
            helper(node.right, builder, false);
            builder.append(")");
        }
    }
}