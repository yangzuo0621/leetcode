/**
 * 解题思路：
 * 非快乐数有个特点，循环的数字中必定会有4。网上查到。
 */
public class Solution {
    public boolean isHappy(int n) {
        while (n != 1 && n != 4) {
            int sum = 0;
            while (n != 0) {
                int num = n % 10;
                sum += num * num;
                n = n / 10;
            }
            n = sum;
        }
        return n == 1;
    }
}