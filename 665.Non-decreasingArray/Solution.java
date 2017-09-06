/**
 * 解题思路：
 * 考虑交错出现的情况。
 */
class Solution {
    public boolean checkPossibility(int[] nums) {
        int times = 0;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] < nums[i-1])
                ++times;
            if (times == 2) return false;
            if (i != 1 && i != nums.length - 1) {
                if (nums[i-1] > nums[i+1] && nums[i] < nums[i-2])
                    return false;
            }
        }
        return true;
    }
}
