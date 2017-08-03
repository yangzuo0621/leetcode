import java.util.Arrays;

/**
 * 解题思路：
 * 动态规划，假设str的前[0, i]的最大无重复子串为s。
 * 当str[i+1]在s中无重复且s与str[i+1]相临近，则最大无重复子串为s + str[i+1]；
 * 当str[i+1]在s中有重复，假设重复的索引为j，那么最大无重复子串为max{maxStr, curStr.sub(j+1)+str[i+1]}
 */
public class Solution {

    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int[] charIndex = new int[256];
        Arrays.fill(charIndex, -1);

        for (int head = 0, tail = 0; tail < s.length(); tail++) {
            char c = s.charAt(tail);
            int lastIndex = charIndex[c];
            if (lastIndex != -1) {
                if (lastIndex >= head) {
                    head = lastIndex + 1;
                }
            }
            charIndex[c] = tail;
            maxLen = Math.max(maxLen, tail - head + 1);
        }
        return maxLen;
    }

//    public int lengthOfLongestSubstring(String s) {
//        String max = "";
//        String current = "";
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            int index = current.indexOf(c);
//            if (index == -1) {
//                current = current + c;
//            } else {
//                current = current.substring(index+1) + c;
//            }
//            if (max.length() < current.length())
//                max = current;
//        }
//        return max.length();
//    }
}
