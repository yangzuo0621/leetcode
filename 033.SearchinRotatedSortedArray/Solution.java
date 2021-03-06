/**
 * 解题思路：
 * 二分法，正确确定区间。
 */
class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = low + ((high - low) >> 1);
            if (nums[mid] == target) return mid;
            if (nums[mid] < nums[high]) {
                if (nums[mid] < target && nums[high] >= target)
                    low = mid + 1;
                else
                    high = mid - 1;
            } else {
                if (nums[low] <= target && nums[mid] > target)
                    high = mid - 1;
                else
                    low = mid + 1;
            }
        }
        return -1;
    }
}
