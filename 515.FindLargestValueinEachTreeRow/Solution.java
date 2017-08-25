/**
 * 解题思路：
 * 层次遍历。
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        TreeNode cur = root, pre = root;
        int largest = Integer.MIN_VALUE;
        while(! queue.isEmpty()) {
            TreeNode node = queue.poll();
            largest = Math.max(node.val, largest);
            if (node.left != null) {
                queue.add(node.left);
                cur = node.left;
            }
            if (node.right != null) {
                queue.add(node.right);
                cur = node.right;
            }
            if (node == pre) {
                result.add(largest);
                largest = Integer.MIN_VALUE;
                pre = cur;
            }
        }
        return result;
    }
}
