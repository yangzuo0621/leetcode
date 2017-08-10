/**
 * 解题思路：
 */
public class Solution {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        int[] result = new int[findNums.length];
        for (int i = 0; i < findNums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (findNums[i] == nums[j]) {
                    j++;
                    while (j < nums.length && findNums[i] > nums[j]) j++;
                    if (j < nums.length)
                        result[i] = nums[j];
                    else
                        result[i] = -1;
                    break;
                }
            }
        }
        return result;
    }
}
