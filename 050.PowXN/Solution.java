/**
 * 解题思路：
 * 利用二分法，不然会超时。
 * 一般这种情况都会应用到二分法。
 */
class Solution {
    public double myPow(double x, int n) {
        if (n < 0) {
            return 1.0 / power(x, -n);
        } else {
            return power(x, n);
        }
    }

    private double power(double x, int n) {
        if (n == 0) return 1;
        double p = power(x, n / 2);
        if (n % 2 == 0) {
            return p * p;
        } else {
            return p * p * x;
        }
    }
}
