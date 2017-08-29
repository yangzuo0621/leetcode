/**
 * 解题思路：
 * 找到最中间的数字即为最终到达的数字状态。
 */
public class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid = nums[nums.length / 2];
        int count = 0;
        for (int i = 0; i < nums.length; ++i) {
            count += Math.abs(mid - nums[i]);
        }
        return count;
    }
}
