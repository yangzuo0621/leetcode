import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 解题思路：
 * 利用辅助数据作排名之间的映射。
 */
public class Solution {
    public String[] findRelativeRanks(int[] nums) {
        int len = nums.length;
        int[] table = Arrays.copyOf(nums, len);
        Arrays.sort(table);
        Map<Integer, Integer> map = new HashMap<>(len);
        for (int i = len - 1; i >= 0; i--) {
            map.put(table[i], len - i);
        }

        String[] result = new String[len];
        for (int i = 0; i < len; i++) {
            switch (map.get(nums[i])) {
                case 1: result[i] = "Gold Medal"; break;
                case 2: result[i] = "Silver Medal"; break;
                case 3: result[i] = "Bronze Medal"; break;
                default: result[i] = map.get(nums[i]) + "";
            }
        }
        return result;
    }
}
