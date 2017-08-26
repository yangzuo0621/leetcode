/**
 * 解题思路：
 * 使用动态规划
 * dp[i][j]表示字符串s[i..j]是否为回文的情况。
 * 当s[i]==s[j]时, s[i..j]是否为回文需根据dp[i+1][j-1]来进行判断。
 * 当s[i]!=s[j]时, s[i..j]不是回文。
 */
class Solution {
    public int countSubstrings(String s) {
        int len = s.length();
        boolean[][] matrix = new boolean[len][len];
        for (int row = 0; row < len; ++row) {
            for (int col = 0; col < len; ++col) {
                if (row >= col) matrix[row][col] = true;
                else matrix[row][col] = false;
            }
        }

        int count = 0;
        for (int k = 1; k < len; ++k) {
            for (int i = 0; i + k < len; ++i) {
                int j = i + k;
                if (s.charAt(i) == s.charAt(j))
                    matrix[i][j] = matrix[i+1][j-1];
                else
                    matrix[i][j] = false;
                if (matrix[i][j]) ++count;
            }
        }
        count += s.length();

//        int count = 0;
//        for (int row = 0; row < len; ++row) {
//            for (int col = row; col < len; ++col) {
//                if (matrix[row][col]) ++count;
//            }
//        }
        return count;
    }
}
