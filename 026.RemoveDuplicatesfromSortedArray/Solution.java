/**
 * 解题思路：
 * 将重复的数字往数组后端移动。
 */
public class Solution {

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int pos = 0;
        int cur = nums[0];
        int cnt = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != cur) {
                cur = nums[i];
                int tmp = nums[++pos];
                nums[pos] = nums[i];
                nums[i] = tmp;
            } else {
                cnt++; // 在这里统计重复的数字个数
            }
        }
        return nums.length - cnt;
    }
}