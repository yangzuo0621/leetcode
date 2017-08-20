/**
 * 解题思路：
 * 保存数组之间字符的映射关系，同时考虑不能让两个字符映射到同一个字符上。
 */
class Solution {
    public boolean isIsomorphic(String s, String t) {
        final int[] map1 = new int[256];
        final int[] map2 = new int[256];
        for (int i = 0; i < s.length(); i++) {
            if (map1[s.charAt(i)] != map2[t.charAt(i)])
                return false;
            map1[s.charAt(i)] = i + 1;
            map2[t.charAt(i)] = i + 1;
        }
        return true;
    }
}