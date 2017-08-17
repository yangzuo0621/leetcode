/**
 * 解题思路：
 * 分情况讨论。
 */
public class Solution {
    public boolean checkRecord(String s) {
        int aCnt = 0, bCnt = 0;
        boolean isContinue = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'A') {
                aCnt++;
                if (aCnt == 2) return false;
                isContinue = false;
                continue;
            }
            if (c == 'L') {
                if (isContinue) {
                    bCnt++;
                    if (bCnt == 3) return false;
                } else {
                    bCnt = 1;
                    isContinue = true;
                }
                continue;
            }
            isContinue = false;
        }
        return true;
    }
}