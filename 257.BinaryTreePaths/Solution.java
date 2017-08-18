/**
 * 解题思路：
 * 先序遍历。
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> resultList = new ArrayList<>();
        dfs(root, "", resultList);
        return resultList;
    }

    private void dfs(TreeNode node, String path, List<String> paths) {
        if (node == null) return;
        if (node.left == null && node.right == null) {
            paths.add(path + node.val);
        } else {
            dfs(node.left, path + node.val + "->", paths);
            dfs(node.right, path + node.val + "->", paths);
        }
    }
}