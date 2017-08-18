/**
 * 解题思路：
 * 最开始想复杂了。
 * 利用一个辅助数组来记录。
 * 当计数为2时是重复的数，
 * 当计数为0时是缺失的数。
 */
public class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ints = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ints[nums[i]-1]++;
        }
        int repeat = 0, missing = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == 2) repeat = i+1;
            if (ints[i] == 0) missing = i+1;
        }
        return new int[] { repeat, missing };
    }
}