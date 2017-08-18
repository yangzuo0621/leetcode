import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 解题思路：
 * 字符串反转实现。
 * 最开始使用一个数组去记录元音字符出现的位置，然后在一个StringBuilder里面进行替换
 * 为什么不直接用前后两个指针去操作呢？
 * 同时为了避免过多的charAt操作，可以使用toCharArray方法呀。
 */
class Solution {
    public String reverseVowels(String s) {
        Set<Character> set = new HashSet<>(Arrays.asList('a', 'i', 'e', 'o', 'u', 'A', 'I', 'E', 'O', 'U'));
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            while (left < right && !set.contains(chars[left])) left++;
            while (left < right && !set.contains(chars[right])) right--;

            if (left < right) {
                char tmp = chars[left];
                chars[left] = chars[right];
                chars[right] = tmp;
            }

            left++;
            right--;
        }
        return new String(chars);
    }
}