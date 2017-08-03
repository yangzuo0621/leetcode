/**
 * 解题思路：
 * 考虑到的边界
 * 1. 溢出
 * 2. 首尾空字符
 * 3. 符号
 *
 * 对应溢出，最开始使用Long类型来计算，在Long溢出时会出问题，改成double。
 */
public class Solution {

    public int myAtoi(String str) {
        if (str == null) return 0;
        String trimStr = str.trim();
        if (trimStr.length() == 0) return 0;

        double result = 0;
        int sign = 1;
        int i = 0;
        if (trimStr.charAt(0) == '-') { sign = -1; i++; }
        if (trimStr.charAt(0) == '+') { i++; }

        for (; i < trimStr.length(); i++) {
            char c = trimStr.charAt(i);
            if (c >= 48 && c <= 57) {
                result = result * 10 + (c - 48);
            } else {
                break;
            }
        }

        result = sign * result;
        if (sign == 1) {
            if (result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        } else {
            if (result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        }

        return (int) result;
    }
}