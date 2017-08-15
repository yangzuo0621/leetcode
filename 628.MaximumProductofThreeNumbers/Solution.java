import java.util.Arrays;

/**
 * 解题思路：
 * 由于存在负数，因此结果为3个正数的乘积与2个负数和1个正数的乘积的最大。
 * 自己的方法利用的排序 O(nlog)
 * 可以使用O(n)，方式时遍历时找出最大的三个数以及最小的两个数
 */
public class Solution {
    public int maximumProduct(int[] nums) {
        if (nums == null || nums.length < 3)
            throw new IllegalArgumentException("parameter array should have three elements at least.");

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        int second_least = Integer.MAX_VALUE;
        int least = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > first) {
                third = second;
                second = first;
                first = nums[i];
            } else if (nums[i] > second) {
                third = second;
                second = nums[i];
            } else if (nums[i] > third) {
                third = nums[i];
            }

            if (nums[i] < least) {
                second_least = least;
                least = nums[i];
            } else if (nums[i] < second_least) {
                second_least = nums[i];
            }
        }

        int max1 = first * second * third;
        int max2 = first * least * second_least;
        return Math.max(max1, max2);
    }

//    public int maximumProduct(int[] nums) {
//        if (nums == null || nums.length < 3)
//            throw new IllegalArgumentException("parameter array should have three elements at least.");
//
//        Arrays.sort(nums);
//        int len = nums.length;
//        int max = nums[len-1] * nums[len-2] * nums[len-3];
//        if (nums[0] < 0) {
//            max = Math.max(nums[0] * nums[1] * nums[len-1], max);
//        }
//        return max;
//    }
}