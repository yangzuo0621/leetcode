/**
 * 解题思路：
 * 利用相同的两个数异或运算为0的性质，直接对数组的所有元素进行异或。
 */
public class Solution {
    public int singleNumber(int[] nums) {
        if (nums == null || nums.length % 2 == 0) throw new IllegalArgumentException();
        int result = nums[0];
        for (int i = 1; i < nums.length; i++)
            result ^= nums[i];
        return result;
    }
}