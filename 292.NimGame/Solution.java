/**
 * 解题思路：
 * 当n为4的倍数时，无法获胜。
 */
public class Solution {
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}