import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 解题思路：
 * 利用map统计每个数字出现的频率。
 * 利用辅助数组，数组下标代表频率，因此辅助数组大小不超过原数组大小，
 * 辅助数字是相同频率数字的链表。
 */
class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; ++i)
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

        List[] count = new ArrayList[nums.length + 1];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (count[entry.getValue()] == null) {
                count[entry.getValue()] = new ArrayList<Integer>();
            }
            count[entry.getValue()].add(entry.getKey());
        }

        List<Integer> result = new ArrayList<>();
        for (int i = count.length - 1; i >= 0 && k > 0; --i) {
            if (count[i] != null) {
                for (int j = 0; j < count[i].size() && k > 0; ++j, --k) {
                    result.add((Integer) count[i].get(j));
                }
            }
        }
        return result;
    }
}
