/**
 * 解题思路：
 * 利用二分法进行解搜索。注意溢出情况。
 */
class Solution {
    public boolean isPerfectSquare(int num) {
        if (num <= 0) return false;
        long target = num;
        long left = 1, right = num;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (mid * mid == target) return true;
            else if (mid * mid < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}