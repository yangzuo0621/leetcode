/**
 * 解题思路：
 * 边界情况是字符串后面由空格组成。
 */
public class Solution {

    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ') i--;

        int cnt = 0;
        for (; i >= 0; i--) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'z') {
                cnt++;
            } else {
                break;
            }
        }
        return cnt;
    }

}