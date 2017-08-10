/**
 * 解题思路：
 * 1. 排序后取偶数位置的数，时间复杂度为O(nlogn)。
 * 2. 应该存在更好的算法。果然存在！
 * 通过一个数组来维持元素的有序的相对位置。时间复杂度O(n)
 */
public class Solution {

    public int arrayPairSum(int[] nums) {
        int bound = 10000;
        int[] table = new int[2 * bound + 1];
        for (int i = 0; i < nums.length; i++) {
            table[nums[i]+bound]++;
        }

        int cnt = 0;
        boolean take = true;
        for (int i = 0; i < table.length; i++) {
            if (table[i] != 0) {
                table[i]--;
                if (take) {
                    cnt += i - bound;
                }
                i--;
                take = !take;
            }
        }
        return cnt;
    }

//    public int arrayPairSum(int[] nums) {
//        Arrays.sort(nums);
//        int cnt = 0;
//        for (int i = 0; i < nums.length; i += 2) {
//            cnt += nums[i];
//        }
//        return cnt;
//    }
}