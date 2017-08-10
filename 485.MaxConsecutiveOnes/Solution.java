/**
 * 解题思路：
 * 统计连续1的个数，在遇到0时置统计值为0.
 */
public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums == null) return 0;

        int max = 0, cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                cnt++;
            } else {
                cnt = 0;
            }
            max = Math.max(cnt, max);
        }
        return max;
    }
}