import java.util.ArrayList;
import java.util.List;

/**
 * 解题思路：
 * 自己的做法是用两个列表保存根节点到两个节点的路径，再进行比较。
 * 其实可以使用更简单的递归方法。做树的递归操作时一定要正确分析递归情况。
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null)
            return root;
        return left != null ? left : right;
    }

    // public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    //     List<List<TreeNode>> result = new ArrayList<>();
    //     getPath(root, p, new ArrayList<>(), result);
    //     getPath(root, q, new ArrayList<>(), result);
    //     List<TreeNode> list1 = result.get(0);
    //     List<TreeNode> list2 = result.get(1);
    //     int i = 0, j = 0;
    //     int len1 = list1.size(), len2 = list2.size();
    //     while (i < len1 && j < len2) {
    //         if (list1.get(i) != list2.get(j)) {
    //             return list1.get(i-1);
    //         }
    //         ++i;
    //         ++j;
    //     }
    //     if (i == len1) return list1.get(i-1);
    //     return list2.get(j-1);
    // }
    //
    // private void getPath(TreeNode root, TreeNode p, List<TreeNode> content, List<List<TreeNode>> result) {
    //     if (root == null) return;
    //     content.add(root);
    //     if (root == p) {
    //         result.add(new ArrayList<>(content));
    //         content.remove(content.size() - 1);
    //         return;
    //     }
    //     getPath(root.left, p, content, result);
    //     getPath(root.right, p, content, result);
    //     content.remove(content.size() - 1);
    // }
}
