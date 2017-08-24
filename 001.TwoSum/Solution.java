/**
 * 解题思路：
 * 使用一个Map，保存数组元素及其索引的键值对。
 */
public class Solution {

    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<>(len);
        for (int i = 0; i < len; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[] {map.get(diff), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
}
