/**
 * 解题思路：
 * 当一个区间段的数和小于0时，应重新开始统计。
 * 并用一个中间值记录目前找到为止的最大值。
 */
public class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int i = 0;
        int max = nums[0];
        int len = nums.length;
        while (i < len && nums[i] < 0) {
            max = Math.max(max, nums[i]);
            i++;
        }

        if (i != len) {
            max = nums[i];
            int cnt = 0;
            while (i < len) {
                cnt += nums[i];
                max = Math.max(max, cnt);
                cnt = Math.max(cnt, 0); // 关键部分
                i++;
            }
        }

        return max;
    }
}