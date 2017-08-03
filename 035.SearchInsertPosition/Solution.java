/**
 * 解题思路：
 * 使用二分查找来确定插入位置。
 */
public class Solution {

    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2; // 避免相加溢出
            if (target == nums[mid]) {
                return mid;
            }
            if (target < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

//    public int searchInsert(int[] nums, int target) {
//        int len = nums.length;
//        if (nums[len] < target) return len + 1;
//
//        int low = 0, high = nums.length;
//        int mid = 0;
//        while (low <= high) {
//            mid = low + (high - low) / 2; // 避免相加溢出
//            if (nums[mid] == target) return mid;
//            if (nums[mid] < target) {
//                low = mid + 1;
//            } else {
//                high = mid - 1;
//            }
//        }
//        return mid;
//    }

}