/**
 * 解题思路：
 * 将一个整数反转，注意溢出情况，同时负数不是回文数字。
 */
public class Solution {

    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        long result = 0;
        int y = x;
        while (y != 0) {
            result = result * 10 + y % 10;
            if (result > Integer.MAX_VALUE) return false;
            y /= 10;
        }

        if (result == x) return true;
        return false;
    }
}