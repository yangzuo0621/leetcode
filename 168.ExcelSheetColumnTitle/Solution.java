/**
 * 解题思路：
 * 找出数字与A-Z之间的关系。跟十进制类似，这里进制数变成26.
 */
public class Solution {
    public String convertToTitle(int n) {
        StringBuilder builder = new StringBuilder();
        while (n > 0) {
            int remainder = n % 26;
            n = n / 26;
            if (remainder == 0) {
                builder.append('Z');
                n--;
            } else {
                builder.append((char) (remainder - 1 + 'A'));
            }
        }
        return builder.reverse().toString();
    }
}