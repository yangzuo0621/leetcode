/**
 * 解题思路：
 * 末尾0的个数跟2和5的个数有关。
 * 同时2的个数会比5的个数多，因此看有多少个5。
 * 还要考虑25，125等5的幂次的情况。
 */
class Solution {
    public int trailingZeroes(int n) {
        int cnt = 0;
        while (n > 0) {
            cnt += n / 5;
            n = n / 5;
        }
        return cnt;
    }
}