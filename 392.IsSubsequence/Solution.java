/**
 * 解题思路：
 * 子序列是由字符串在原来基础上删除若干个字符并保留字符的顺序组成
 * 因此只需要判断字符串s的所有字符在t中存在并且顺序保持一致。
 */
public class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (j < t.length() && i < s.length()) {
            if (t.charAt(j++) == s.charAt(i)) ++i;
        }
        return i == s.length();
    }
}
