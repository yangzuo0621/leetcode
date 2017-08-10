/**
 * 解题思路：
 * 使用字符数组来减少开销。
 */
public class Solution {
    public String reverseWords(String s) {
        if (s == null || s.length() == 0) return "";

        char[] chars = s.toCharArray();
        int start = 0, end = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                reverse(chars, start, end);
                start = i + 1;
            } else {
                end = i;
            }
        }
        if (end > start)
            reverse(chars, start, end);

        return new String(chars);
    }

    private void reverse(char[] chars, int start, int end) {
        while (end > start) {
            char tmp = chars[end];
            chars[end] = chars[start];
            chars[start] = tmp;
            end--;
            start++;
        }
    }
}