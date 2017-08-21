/**
 * 解题思路：
 * 穷举法。
 */
class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num == 1) return false;
        int sum = 1;
        for (int i = 2; i <= (int)Math.sqrt(num); ++i) {
            if (num % i == 0) {
                sum += i + (i * i == num ? 0 : num / i);
            }
        }
        return sum == num;
    }
}