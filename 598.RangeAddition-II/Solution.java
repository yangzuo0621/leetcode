/**
 * 解题思路：
 * 求操作中a和b的最小值。
 */
public class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        if (ops == null || ops.length == 0) return m * n;

        int minA = Integer.MAX_VALUE;
        int minB = Integer.MAX_VALUE;
        for (int i = 0; i < ops.length; i++) {
            int a = ops[i][0];
            int b = ops[i][1];
            minA = Math.min(a, minA);
            minB = Math.min(b, minB);
        }
        return minA * minB;
    }
}