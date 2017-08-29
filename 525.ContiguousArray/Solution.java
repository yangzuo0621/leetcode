/**
 * 解题思路：
 * 通过将0替换成1，题目变成找到连续的子数组其和为0。
 */
public class Solution {
    public int findMaxLength(int[] nums) {
        // for (int i = 0; i < nums.length; ++i) {
        //     if (nums[i] == 0) nums[i] = -1;
        // }

        int sum = 0, result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < nums.length; ++i) {
            sum += nums[i] == 0 ? -1 : 1;
            if (map.containsKey(sum)) {
                result = Math.max(result, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }

        return result;
    }
}
