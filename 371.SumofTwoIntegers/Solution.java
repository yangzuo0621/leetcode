/**
 * 解题思路：
 * 两个数的加法分为两步，对应位相加和进位。
 */
public class Solution {
    public int getSum(int a, int b) {
        if (a == 0) return b;
        int x = a ^ b;
        int c = (a & b) << 1;
        return getSum(c, x);
    }
}