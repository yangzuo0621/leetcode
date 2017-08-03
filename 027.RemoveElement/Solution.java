/**
 * 解题思路：
 * 将需要移除的数字移至数组的末端。
 */
public class Solution {

    public static int removeElement(int[] nums, int val) {
        int pos = nums.length;
        int cnt = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == val) {
                int tmp = nums[--pos];
                nums[pos] = nums[i];
                nums[i] = tmp;
                cnt++;
            }
        }
        return nums.length - cnt;
    }

}