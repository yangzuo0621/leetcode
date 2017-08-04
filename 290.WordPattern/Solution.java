import java.util.HashSet;
import java.util.Set;

/**
 * 解题思路：
 * 第一次解题时使用HashMap，并未考虑模式重复的情况，
 * 即pattern=abba, str=dog dog dog dog。
 * 同时在解决模式重复时采用了暴力的形式，遍历map的values是否有重复。效率低。
 * 通过使用set来过滤重复以及字符数组来提高速度。
 */
public class Solution {

    public boolean wordPattern(String pattern, String str) {
        String[] tokens = str.split(" ");
        if (tokens.length != pattern.length()) return false;

        String[] mapping = new String[26];
        Set<String> set = new HashSet<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (mapping[c - 'a'] == null) {
                if (set.contains(tokens[i])) return false;
                mapping[c - 'a'] = tokens[i];
                set.add(tokens[i]);
            } else {
                if (! mapping[c - 'a'].equals(tokens[i])) return false;
            }
        }
        return true;
    }
}