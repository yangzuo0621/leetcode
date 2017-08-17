/**
 * 解题思路：
 * 仍旧是二进制表示中只有一个1，但是需要排除为2的次幂的情况。
 * 可以与上(0x55555555) <==> 1010101010101010101010101010101进行过滤。
 */
public class Solution {
    public boolean isPowerOfFour(int num) {
        return num > 0 && (num & (num - 1)) == 0 && (num & 0x55555555) == num;
    }
}