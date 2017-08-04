/**
 * 解题思路：
 * 维护一个为0的区域，当数组元素部位0时跟为0区域的第一个位置进行交换。
 */
public class Solution {

    public static void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) return;
        int pos = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int tmp = nums[++pos];
                nums[pos] = nums[i];
                nums[i] = tmp;
            }
        }
    }
}