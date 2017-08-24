/**
 * 解题思路：
 * 二分查找
 * 注意区分左右半区为奇数偶数的情况。
 */
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if ((mid - left) % 2 == 0) {
                if (nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1])
                    return nums[mid];
                if (nums[mid] == nums[mid-1])
                    right = mid - 2;
                else
                    left = mid + 2;
            } else {
                if (nums[mid] == nums[mid-1])
                    left = mid + 1;                
                else
                    right = mid - 1;
            }
        }
        return nums[left];
    }
}