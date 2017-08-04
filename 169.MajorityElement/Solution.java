/**
 * 解题思路：
 * 一次取两个数进行比较，若不同则丢弃，若相同则保留。
 * 最后保留的球即为出现次数大于一半以上的数。
 */
public class Solution {

    public int majorityElement(int[] nums) {
        int count = 0;
        int majority = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                majority = nums[i];
                count++;
            } else {
                if (majority == nums[i]) count++;
                else count--;
            }
        }
        return majority;
    }
}