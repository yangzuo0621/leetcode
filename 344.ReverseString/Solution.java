/**
 * 解题思路：
 * 利用前后两个指针交换首尾字符。
 */
public class Solution {
    public String reverseString(String s) {
        if (s == null || s.length() == 0) return "";
        char[] chars = s.toCharArray();
        int start = 0, end = chars.length - 1;
        while (start < end) {
            char tmp = chars[end];
            chars[end] = chars[start];
            chars[start] = tmp;
            start++;
            end--;
        }
        return new String(chars);
    }
}