/**
 * 解题思路：
 * 找出两个字符串的最长前缀，再用这个前缀循环找出数组中的所有最长前缀。
 * 最开始解法使用了一个辅助函数来找出两个字符串的最长前缀。
 */
public class Solution {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if ("".equals(prefix)) {
                    return "";
                }
            }
        }
        return prefix;
    }

}