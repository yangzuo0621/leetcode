/**
 * 解题思路：
 * 交换的思想。
 */
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        n = ((n >>> 1) & 0x55555555) | ((n & 0x55555555) << 1);
        n = ((n >>> 2) & 0x33333333) | ((n & 0x33333333) << 2);
        n = ((n >>> 4) & 0x0F0F0F0F) | ((n & 0x0F0F0F0F) << 4);
        n = ((n >>> 8) & 0x00FF00FF) | ((n & 0x00FF00FF) << 8);
        n = (n >>> 16) | (n << 16);
        return n;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().reverseBits(43261596));
    }
}