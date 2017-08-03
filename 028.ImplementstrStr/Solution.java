/**
 * 解题思路：
 * 看了别人提交的答案，我惊讶了，直接调用Java API !!!
 * 而我一年前使用的字符串匹配算法的速度来做题速度确实最慢的 !!!
 */
public class Solution {

    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

//    public int strStr(String haystack, String needle) {
//        if (needle.length() == 0) return 0;
//
//        int [] pi = compute(needle);
//        int k = 0;
//        for (int i = 0; i < haystack.length(); i++) {
//            while (k > 0 && haystack.charAt(i) != needle.charAt(k)) k = pi[k-1];
//            if (haystack.charAt(i) == needle.charAt(k)) k++;
//            if (k == needle.length()) {
//                return i - k + 1;
//            }
//        }
//        return -1;
//    }
//
//    public int[] compute(String str) {
//        int len = str.length();
//        int []pi = new int[len];
//        pi[0] = 0;
//        int k = 0;
//        for (int i = 1; i < len; i++) {
//            while (k > 0 && str.charAt(i) != str.charAt(k)) k = pi[k-1];
//            if (str.charAt(i) == str.charAt(k)) k++;
//            pi[i] = k;
//        }
//        return pi;
//    }
}