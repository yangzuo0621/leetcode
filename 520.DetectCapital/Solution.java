/**
 * 解题思路：
 * 使用字符进行比较效率应该更高。这里采用Java API进行解答。
 */
public class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.equals(word.toUpperCase()))
            return true;
        if (word.equals(word.toLowerCase()))
            return true;
        if (word.equals(word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase()))
            return true;
        return false;
    }
}