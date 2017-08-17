/**
 * 解题思路：
 * 因为数组已经有序，为了让构建的BST平衡，
 * 先插入数组的中间值，然后递归的创建左子树和右子树。
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildTree(nums, 0, nums.length-1);
    }

    private TreeNode buildTree(int[] nums, int i, int j) {
        if (i > j) return null;
        int mid = i + (j - i) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left =  buildTree(nums, i, mid-1);
        node.right = buildTree(nums, mid+1, j);
        return node;
    }
}