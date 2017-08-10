import java.util.ArrayList;
import java.util.List;

/**
 * 解题思路：
 * 将出现的数字放置到对应的数组下标处，通过将值取为对应的负值保持信息不变。
 */
public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) nums[index] = -nums[index];
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) result.add(i + 1);
        }
        return result;
    }
}