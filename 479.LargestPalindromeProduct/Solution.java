/**
 * 解题思路：
 * 枚举。
 */
class Solution {
    public int largestPalindrome(int n) {
        if (n == 1) return 9;
        int high = (int) Math.pow(10, n) - 1, low = high / 10;
        for (int i = high; i > low; --i) {
            long palindrome = makePalindrome(i);
            for (int j = high; j > low; --j) {
                if (palindrome / j > high)
                    break;
                if (palindrome % j == 0)
                    return (int) (palindrome % 1337);
            }
        }
        return 0;
    }

    private long makePalindrome(long n) {
        String str = n + new StringBuilder(Long.toString(n)).reverse().toString();
        return Long.parseLong(str);
    }
}