/**
 * 解题思路：
 * 每次让n & (n-1)使得二进制中1的个数减少1。
 */
public class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n &= (n - 1);
        }
        return count;
    }
}