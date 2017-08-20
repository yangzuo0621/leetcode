/**
 * 解题思路：
 * 用求和公式计算最大不超过n的整数。
 * [-b +/- sqrt(b * b - 4 * a * c)] / 2
 * m * m + m - 2 * n = 0
 */
class Solution {
    public int arrangeCoins(int n) {
        if (n <= 0) return 0;
        return (int)((Math.sqrt(1.0 + 8.0 * n) - 1) / 2);
    }
}