import java.util.ArrayList;
import java.util.List;

/**
 * 解题思路：
 * 先求出树高，构造一个全为空字符串的结果矩阵
 * 递归更新。
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<List<String>> printTree(TreeNode root) {
        int height = height(root);
        int width = (int) Math.pow(2, height) - 1;
        List<List<String>> result = new ArrayList<>(height);
        for (int i = 0; i < height; ++i) {
            List<String> content = new ArrayList<>(width);
            for (int j = 0; j < width; ++j) {
                content.add("");
            }
            result.add(content);
        }
        DFS(root, 0, 0, width-1, result);
        return result;
    }

    private void DFS(TreeNode root, int height, int l, int r, List<List<String>> result) {
        if (root != null) {
            int mid = l + (r - l) / 2;
            result.get(height).set(mid, String.valueOf(root.val));
            DFS(root.left, height + 1, l, mid - 1, result);
            DFS(root.right, height + 1, mid + 1, r, result);
        }
    }

    private int height(TreeNode root) {
        if (root == null) return 0;
        return Math.max(height(root.left), height(root.right)) + 1;
    }
}
