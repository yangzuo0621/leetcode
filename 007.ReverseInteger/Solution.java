/**
 * 解题思路：
 * 需考虑溢出情况。这里使用了long来替代int进行计算。
 */
public class Solution {

    public static int reverse(int x) {
        int sign = 1;
        if (x < 0) {
            sign = -1;
            x = -x;
        }

        long result = 0;
        while (x != 0) {
            result = result * 10 + x % 10;
            x /= 10;
        }

        if (result > Integer.MAX_VALUE) return 0;
        return (int)result * sign;
    }

    public static void main(String[] args) {

        System.out.println(reverse(-2147483648));
    }
}
