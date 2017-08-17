/**
 * 解题思路：
 * 这是一个动态规划！！！
 * dp[n] = dp[n-1] + dp[n-2]
 */
public class Solution {
    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        int[] steps = new int[n];
        steps[0] = 1;
        steps[1] = 2;
        for (int i = 2; i < n; i++) steps[i] = steps[i-1] + steps[i-2];
        return steps[n-1];
    }
//
//    public int climbStairs(int n) {
//        int a = 1, b = 1;
//        while (n-- > 0) {
//            b += a;
//            a = b - a;
//        }
//        return a;
//    }
}