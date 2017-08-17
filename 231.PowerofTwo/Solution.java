/**
 * 解题思路：
 * 2的幂次的二进制表示中只有一个1。
 */
public class Solution {
    public boolean isPowerOfTwo(int n) {
        return (n > 0 && ((n - 1) & n) == 0);
    }
}