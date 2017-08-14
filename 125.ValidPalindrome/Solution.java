/**
 * 解题思路：
 * 忽略不是字母数字的字符，使用前后两个游标。
 */
public class Solution {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) return true;

        char[] lowers = s.toLowerCase().toCharArray();
        int left = 0, right = lowers.length - 1;
        while (left < right) {
            while (left < right && !Character.isAlphabetic(lowers[left]) && !Character.isDigit(lowers[left])) left++;
            while (left < right && !Character.isAlphabetic(lowers[right]) && !Character.isDigit(lowers[right])) right--;
            if (lowers[left] != lowers[right])
                return false;
            left++;
            right--;
        }

        return true;
    }
}