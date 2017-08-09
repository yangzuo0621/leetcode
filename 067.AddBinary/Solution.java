/**
 * 解题思路：
 * 考虑相加溢出进位的情况。
 */
public class Solution {
    public String addBinary(String a, String b) {
        int aLen = a.length();
        int bLen = b.length();
        int maxLen = aLen > bLen ? aLen : bLen;
        char[] result = new char[maxLen];
        boolean carry = false;
        int index = maxLen-1;
        while (aLen > 0 || bLen > 0) {
            char ac = '0', bc = '0';
            if (--aLen >= 0) ac = a.charAt(aLen);
            if (--bLen >= 0) bc = b.charAt(bLen);
            if (ac == '0' && bc == '0') {
                result[index--] = carry ? '1' : '0';
                carry = false;
                continue;
            }
            if (ac == '1' && bc == '1') {
                result[index--] = carry ? '1' : '0';
                carry = true;
                continue;
            }
            result[index--] = carry ? '0' : '1';
        }

        if (!carry) return new String(result);
        return "1" + new String(result);
    }
}