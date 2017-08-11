/**
 * 解题思路：
 * 用字符数组统计magazine字符频率，ransomNote从字符数组中取走字符
 * 当字符数组都大于等于0时，返回true，否则false
 */
public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] table = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            table[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            table[ransomNote.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (table[i] < 0)
                return false;
        }
        return true;
    }
}