/**
 * 解题思路：
 * 记录每个连续的k个数值的和，并保留最大值。
 */
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if (nums.length < k) return 0;
        int max = 0, cur = 0;
        for (int i = 0; i < k; i++)
            cur += nums[i];
        max = cur;
        for (int i = k; i < nums.length; i++) {
            cur = cur + nums[i] - nums[i-k];
            max = Math.max(max, cur);
        }
        return (double) max / k;
    }
}