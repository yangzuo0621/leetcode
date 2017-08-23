/**
 * 解题思路：
 * 利用一个返回的数组，构造一个不包括自己乘积的零时状况
 * 再反向将结果保存到结果数组中去。
 */
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = 1;
        for (int i = 1; i < nums.length; ++i)
            result[i] = result[i-1] * nums[i-1];

        int cumulate = 1;
        for (int i = nums.length - 1; i >= 0; --i) {
            result[i] = result[i] * cumulate;
            cumulate *= nums[i];
        }
        return result;
    }
}