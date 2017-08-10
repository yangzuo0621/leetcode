/**
 * 解题思路：
 * 寻找num的掩码，例如5的二进制为101，掩码为111
 */
public class Solution {
    public int findComplement(int num) {
        int mask = 1, temp = num;
        while (temp != 0) {
            mask = mask << 1;
            temp = temp >> 1;
        }
        return num ^ (mask - 1);
    }
}