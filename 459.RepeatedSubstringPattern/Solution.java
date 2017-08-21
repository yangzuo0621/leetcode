/**
 * 解题思路：
 * 穷举法。
 */
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int length = s.length();
        for (int i = length / 2; i >= 1; --i) {
            if (length % i == 0) {
                int step = length / i;
                StringBuilder tmp = new StringBuilder();
                String token = s.substring(0, i);
                for (int j = 0; j < step; ++j) {
                    tmp = tmp.append(token);
                }
                if (s.equals(tmp.toString())) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().repeatedSubstringPattern("bb"));
    }
}