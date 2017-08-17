/**
 * 解题思路：
 * 对数换底是个不错的思路。
 * 判断一个数是不是整数：a - int(a) == 0
 */
public class Solution {
    public boolean isPowerOfThree(int n) {
        return n > 0 && (int)(Math.log10(n) / Math.log10(3)) - Math.log10(n) / Math.log10(3) == 0;
    }
}