import java.util.HashMap;
import java.util.Map;

/**
 * 解题思路：
 * 要考虑重复值的问题。
 * 如：输入nums=[1,0,1,1], k=1
 */
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k) return true;
                else map.put(nums[i], i);
            } else {
                map.put(nums[i], i);
            }
        }
        return false;
    }
}