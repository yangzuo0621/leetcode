/**
 * 解题思路：
 * 利用一个辅助数组记录字符出现的频率。
 */
public class Solution {
    public int firstUniqChar(String s) {
        if (s == null) return 0;
        int[] table = new int[26];
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            table[chars[i] - 'a']++;
        }
        for (int i = 0; i < chars.length; i++) {
            if (table[chars[i] - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
