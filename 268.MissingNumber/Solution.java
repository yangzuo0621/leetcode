/**
 * 解题思路：
 * 利用相同的两个数异或操作为0。
 */
public class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int result = 0;
        for (int i = 0; i <= n; i++) result ^= i;
        for (int i = 0; i < n; i++) result ^= nums[i];
        return result;
    }
}