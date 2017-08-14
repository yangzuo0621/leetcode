/**
 * 解题思路：
 * 采用中序遍历。
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {

    private int min = Integer.MAX_VALUE;
    private TreeNode pre = null;

    public int getMinimumDifference(TreeNode root) {
        if (root == null) return min;
        getMinimumDifference(root.left);
        if (pre != null) {
            min = Math.min(root.val - pre.val, min);
        }
        pre = root;
        getMinimumDifference(root.right);
        return min;
    }

//    private void dfs(TreeNode root, List<Integer> list) {
//        if (root == null) return;
//        dfs(root.right, list);
//        list.add(root.val);
//        dfs(root.left, list);
//    }
}