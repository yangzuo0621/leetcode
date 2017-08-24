import java.util.ArrayList;
import java.util.List;

/**
 * 解题思路：
 * 正负替换。当第一次出现时修改值为负数，判断数组值是否为负数来确定
 * 是否出现两次。
 */
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if (nums.length <= 1) return result;

        for (int i = 0; i < nums.length; ++i) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) result.add(index + 1);
            else nums[index] = -nums[index];
        }
        return result;
    }
}