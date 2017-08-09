/**
 * 解题思路：
 * 1. 两数进行异或所得结果的二进制表示中1的个数即为汉明码距离
 * 2. 求一个二进制数中1的个数可以通过每次减1与自己与操作来进行统计
 */
public class Solution {

    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int cnt = 0;
        while (xor != 0) {
            cnt++;
            xor = xor & (xor - 1);
        }
        return cnt;
    }
}
