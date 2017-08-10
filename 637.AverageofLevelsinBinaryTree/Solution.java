import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

/**
 * 解题思路：
 * 树的层次遍历。注释部分是自己的实现，在本地可以通过，在leetcode上不能通过。
 * 所以参照网上的实现。同时发现树的层次遍历可以使用<em>size</em>来标记层次。
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {

    public List<Double> averageOfLevels(TreeNode root) {
        if (root == null) return new ArrayList<>();

        List<Double> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int n = queue.size();
            double sum = 0.0;
            for (int i = 0; i != n; i++) {
                TreeNode cur = queue.remove();
                sum += cur.val;
                if (cur.left != null) queue.add(cur.left);
                if (cur.right != null) queue.add(cur.right);
            }
            result.add(sum / n);
        }
        return result;
    }

//    public List<Double> averageOfLevels(TreeNode root) {
//        if (root == null) return new ArrayList<>();
//
//        List<Double> result = new ArrayList<>();
//        Queue<TreeNode> queue = new LinkedList<>();
//        TreeNode last = root;
//        queue.add(root);
//        int sum = 0, cnt = 0;
//        while (!queue.isEmpty()) {
//            TreeNode cur = queue.remove();
//            sum += cur.val;
//            cnt++;
//
//            if (cur.left != null) queue.add(cur.left);
//            if (cur.right != null) queue.add(cur.right);
//
//            if (cur == last) {
//                result.add((double) sum / cnt);
//                sum = 0;
//                cnt = 0;
//                if (cur.right != null) {
//                    last = cur.right;
//                    continue;
//                }
//                if (cur.left != null) {
//                    last = cur.left;
//                }
//            }
//        }
//
//        return result;
//    }
}