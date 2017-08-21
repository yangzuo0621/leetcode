import java.util.ArrayList;
import java.util.List;

/**
 * 解题思路：
 * 利用中序遍历BST有序，同时使用变量来保存当前访问到的数值情况。
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int[] findMode(TreeNode root) {
        result = new ArrayList<>();
        maxCount = 0;
        count = 0;
        inOrder(root);
        int[] res = new int[result.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = result.get(i);
        }
        return res;
    }

    private void inOrder(TreeNode root) {
        if (root == null) return;
        inOrder(root.left);
        ++count;
        if (root.val != currentVal) {
            currentVal = root.val;
            count = 1;
        }
        if (count > maxCount) {
            maxCount = count;
            result.clear();
            result.add(root.val);
        } else if (count == maxCount) {
            result.add(root.val);
        }

        inOrder(root.right);
    }

    private List<Integer> result;
    private int currentVal;
    private int maxCount;
    private int count;
}