/**
 * 解题思路：
 * 刚开始也没理解题目意思。
 * 若两字符串不相等，选择较长的字符串返回长度即可。
 * 否则返回-1。
 */
public class Solution {
    public int findLUSlength(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();
        if (a.equals(b))
            return -1;
        return lenA > lenB ? lenA : lenB;
    }
}