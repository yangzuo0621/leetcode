import java.util.Arrays;

/**
 * 解题思路：
 * 排序后按一个方向统计满足条件的个数。
 */
public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = g.length - 1, j = s.length - 1;
        int cnt = 0;
        while (i >= 0 && j >= 0) {
            if (g[i] <= s[j]) {
                cnt++;
                i--;
                j--;
            } else {
                i--;
            }
        }
        return cnt;
    }
}