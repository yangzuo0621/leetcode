/**
 * 解题思路：
 * 如果是一个回文，那么相同的字符需为偶数，并且有且仅有一个字符能为奇数。
 * 字符'Z'和'a'之间相差6个字符。
 */
public class Solution {
    public int longestPalindrome(String s) {
        int[] table = new int[58];
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            table[chars[i] - 'A']++;
        }
        int cnt = 0;
        boolean flag = false;
        for (int i = 0; i < 58; i++) {
            if (table[i] % 2 == 1) {
                cnt += (table[i] - 1);
                flag = true;
            } else {
                cnt += table[i];
            }
        }
        if (flag) cnt++;

        return cnt;
    }
}
