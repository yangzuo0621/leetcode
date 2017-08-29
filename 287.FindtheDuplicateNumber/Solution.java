/**
 * 解题思路：
 * 利用二分搜索法。
 */
public class Solution {
    public int findDuplicate(int[] nums) {
        int low = 1, high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = 0;
            for (int i = 0; i < nums.length; ++i) {
                if (mid >= nums[i]) ++count;
            }
            if (count <= mid) low = mid + 1;
            else high = mid;
        }
        return low;
    }
}
