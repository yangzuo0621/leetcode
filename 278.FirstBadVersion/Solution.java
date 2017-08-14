/**
 * 解题思路：
 * 二分查找
 * 考虑全为真的时候
 */
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
public class Solution {
    public int firstBadVersion(int n) {
        if (n <= 0) return 1;

        int left = 1, right = n;
        while (left < right) {
            int mid = left + (right - left) / 2; // 避免溢出
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        if (right == n && !isBadVersion(right)) return right + 1;

        return right;
    }
}