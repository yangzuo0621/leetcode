/**
 * 解题思路：
 * 用字符数组统计字符出现的频率并进行比较。
 */
public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] table1 = new int[26];
        int[] table2 = new int[26];
        for (int i = 0; i < s.length(); i++) table1[s.charAt(i) - 'a']++;
        for (int i = 0; i < s.length(); i++) table2[t.charAt(i) - 'a']++;
        for (int i = 0; i < 26; i++) {
            if (table1[i] != table2[i]) return false;
        }
        return true;
    }
}