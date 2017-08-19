/**
 * 解题思路：
 * 考虑边界情况。
 */
class Solution {
    public int countSegments(String s) {
        int cnt = 0;
        boolean isWhite = true;
        for (int i = 0; i < s.length(); i++) {
            if (! Character.isWhitespace(s.charAt(i))) {
                if (isWhite) cnt++;
                isWhite = false;
            } else {
                isWhite = true;
            }
        }
        return cnt;
    }
}