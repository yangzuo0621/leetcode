import java.util.ArrayList;
import java.util.List;

/**
 * 解题思路：
 * 滑动窗口的思想。
 */
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] table = new int[26];
        for (int i = 0; i < p.length(); ++i) ++table[p.charAt(i) - 'a'];
        int left = 0, right = 0, cnt = p.length(), n = s.length();
        List<Integer> result = new ArrayList<>();
        while (right < n) {
            char c = s.charAt(right++);
            if (table[c - 'a']-- >= 1) cnt--;
            if (cnt == 0) result.add(left);
            if (right - left == p.length() && table[s.charAt(left++) - 'a']++ >= 0) ++cnt;
        }
        return result;
    }
}