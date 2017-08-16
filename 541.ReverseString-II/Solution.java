/**
 * 解题思路：
 * 判断极端情况。
 */
public class Solution {
    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < chars.length; i = i + 2 * k) {
            if (i + 2 * k - 1 >= chars.length) {
                builder.append(reverse(chars, i, chars.length - 1, k));
            } else {
                builder.append(reverse(chars, i, i + 2 * k - 1, k));
            }
        }
        return builder.toString();
    }

    private String reverse(char[] chars, int start, int end, int k) {
        StringBuilder builder = new StringBuilder();
        int num = end - start + 1;
        if (num < k) {
            for (int i = end; i >= start; i--) builder.append(chars[i]);
        } else if (num >= k) {
            for (int i = start + k - 1; i >= start; i--) builder.append(chars[i]);
            for (int i = start + k; i <= end; i++) builder.append(chars[i]);
        }
        return builder.toString();
    }
}
