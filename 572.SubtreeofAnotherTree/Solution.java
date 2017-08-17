/**
 * 解题思路：
 * 想通过中序或后序遍历来判断序列结果是否重叠。有问题。
 * 通过为null结点插入一个占位符#来可以确定序列。
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        StringBuilder ss = new StringBuilder();
        StringBuilder ts = new StringBuilder();
        postOrder(s, ss.append(","));
        postOrder(t, ts.append(","));
        return ss.toString().contains(ts.toString());
    }

    private void postOrder(TreeNode s, StringBuilder builder) {
        if (s == null) {
            builder.append("#,");
            return;
        }
        builder.append(s.val).append(",");
        postOrder(s.left, builder);
        postOrder(s.right, builder);
    }
}