/**
 * 解题思路：
 * 要用两个指针才能完成层次遍历。
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) return new LinkedList<>();

        LinkedList<List<Integer>> result = new LinkedList<>();
        List<Integer> content = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        TreeNode level = root, pre = root;
        queue.addLast(root);
        while (! queue.isEmpty()) {
            TreeNode node = queue.removeFirst();
            if (node.left != null) {
                queue.addLast(node.left);
                level = node.left;
            }
            if (node.right != null) {
                queue.addLast(node.right);
                level = node.right;
            }
            content.add(node.val);
            if (node == pre) {
                result.addFirst(content);
                content = new ArrayList<>();
                pre = level;
            }
        }

        return result;
    }
}