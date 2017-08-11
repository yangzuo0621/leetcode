/**
 * 解题思路：
 * 通过罗列例子来找规律。
 */
public class Solution {
    public int addDigits(int num) {
        return 1 + (num - 1) % 9;
    }
}