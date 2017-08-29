/**
 * 解题思路：
 * 动态规划：
 * 假设T[i, j]表示当前区间内找到的回文最大子串长度。
 * 当s[i] == s[j]时, 那么T[i, j] = T[i+1, j-1] + 2
 * 当s[i] != s[j]时, 那么T[i, j] = max(T[i+1, j], T[i, j-1])
 */
public class Solution {
    public int longestPalindromeSubseq(String s) {
        int len = s.length();
        int[][] dp = new int[len][len];
        for (int i = 0; i < len; ++i) dp[i][i] = 1;

        for (int k = 1; k < len; ++k) {
            for (int i = 0; i + k < len; ++i) {
                int j = i + k;
                if (s.charAt(i) == s.charAt(j))
                    dp[i][j] = dp[i+1][j-1] + 2;
                else
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
            }
        }
        return dp[0][len-1];
    }
}
