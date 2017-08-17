/**
 * 解题思路：
 * 利用移位操作。
 */
public class Solution {
    private static final String base = "0123456789abcdef";

    public String toHex(int num) {
        if (num == 0) return "0";
        String result = "";
        while (num != 0) {
            result = base.charAt(num & 0xf) + result;
            num = num >>> 4;
        }
        return result;
    }
}