/**
 * 解题思路：
 * 想到了动态规划，却局限于一维的思维定势中。
 * 若要使用动态规划，这是一个二维的动态规划。
 * 即dp[i][j]表示i到j的子串。
 * 当s[i] == s[j]，那么根据s[i+1]与s[j-1]来确定是否是回文。
 *
 * TODO 除了动态规划，有更快的方法
 */
public class Solution {
    public String longestPalindrome(String s) {

        if (s == null || s.length() == 0) return "";
        if (s.length() == 1) return s;
        int length = s.length();
        boolean[][] dp = new boolean[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i >= j)
                    dp[i][j] = true;
                else
                    dp[i][j] = false;
            }
        }

        int maxLen = 1;
        int j = 0;
        int start = 0, end = 0;
        for (int k = 1; k < length; k++) {
            for (int i = 0; i + k < length; i++) {
                j = i + k;
                if (s.charAt(i) != s.charAt(j)) {
                    dp[i][j] = false;
                } else {
                    dp[i][j] = dp[i+1][j-1];
                    if (dp[i][j] == true) {
                        if (k + 1 > maxLen) {
                            maxLen = k + 1;
                            start = i;
                            end = j;
                        }
                    }
                }
            }
        }
        return s.substring(start, end+1);
    }
}
