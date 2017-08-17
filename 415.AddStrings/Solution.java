/**
 * 解题思路：
 * 手动实现数字相加的逻辑。
 */
public class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder builder = new StringBuilder(5100);
        int i = num1.length() - 1, j = num2.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int n1 = (i >= 0) ? num1.charAt(i--) - '0' : 0;
            int n2 = (j >= 0) ? num2.charAt(j--) - '0' : 0;
            int sum = n1 + n2 + carry;
            builder.append(sum % 10);
            carry = sum / 10;
        }
        if (carry > 0) builder.append(carry);
        return builder.reverse().toString();
    }
}