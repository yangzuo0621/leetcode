import java.util.Arrays;

/**
 * 解题思路：
 * 利用一个排序的辅助数组，找到开始和结束的需要重排的间隔。
 */
class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int start = nums.length, end = 0;
        int[] work = Arrays.copyOf(nums, nums.length);
        Arrays.sort(work);
        for (int i = 0; i < nums.length; ++i) {
            if (work[i] != nums[i]) {
                start = Math.min(start, i);
                end = Math.max(end, i);
            }
        }
        return end - start >= 0 ? end - start + 1 : 0;
    }
}