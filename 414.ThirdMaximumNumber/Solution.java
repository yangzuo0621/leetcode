import java.util.HashSet;
import java.util.Set;

/**
 * 解题思路：
 * 用两个数分别保存。
 */
class Solution {
    public int thirdMax(int[] nums) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) continue;
            set.add(nums[i]);
            if (nums[i] > first) {
                third = second;
                second = first;
                first = nums[i];
            } else if (nums[i] > second) {
                third = second;
                second = nums[i];
            } else if (nums[i] > third) {
                third = nums[i];
            }
        }

        if (set.size() < 3) return first;
        return third;
    }
}