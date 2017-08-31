import java.util.ArrayList;
import java.util.List;

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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        preOrder(root, new ArrayList<>(), result, sum);
        return result;
    }

    private void preOrder(TreeNode node, List<Integer> content, List<List<Integer>> result, int sum) {
        if (node == null) return;
        content.add(node.val);
        if (node.left == null && node.right == null) {
            if (node.val == sum) {
                result.add(new ArrayList<>(content));
                content.remove(content.size() - 1);
                return;
            }
        }
        preOrder(node.left, content, result, sum - node.val);
        preOrder(node.right, content, result, sum - node.val);
        content.remove(content.size() - 1);
    }
}
