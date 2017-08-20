import java.util.*;

/**
 * 解题思路：
 * 使用map来统计数字出现的次数。
 */
class Solution {
    public int findPairs(int[] nums, int k) {
        int[] work = Arrays.copyOf(nums, nums.length);
        Arrays.sort(work);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int count = 0;
        if (k == 0) {
            for (Integer val : map.values())
                if (val > 1) count++;
            return count;
        }

        if (k > 0) {
            for (Integer key : map.keySet()) {
                if (map.containsKey(key + k)) count++;
            }
            return count;
        }
        return count;
    }
}
