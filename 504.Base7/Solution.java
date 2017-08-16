/**
 * 解题思路：
 * 采用十进制转二进制的方式将进制换为7。
 */
public class Solution {
    public String convertToBase7(int num) {
        String sign = "";
        if (num < 0) {
            sign = "-";
            num = -num;
        }
        StringBuilder builder = new StringBuilder();
        while (num >= 7) {
            builder.append(num % 7);
            num = num / 7;
        }
        builder.append(num);
        return sign + builder.reverse().toString();
    }
}
