/**
 * 解题思路：
 * 将所有的数异或结果为两个出现一次的数字的异或的结果。
 * 由于异或的特性是相同位上不同的数位为1，因此根据异或结果中二进制为1的地方
 * 必定这两个数字在这一位上不同。从而根据这一位将原数据划分为两部分分别进行异或
 * 最后得到两个只出现一次的数字。
 */
class Solution {

    public int[] singleNumber(int[] nums) {
        if (nums.length < 2) throw new IllegalArgumentException();

        int xor = nums[0];
        for (int i = 1; i < nums.length; ++i) xor ^= nums[i];

        int mask = xor & (~(xor - 1));

        int[] result = new int[2];
        for (int i = 0; i < nums.length; ++i) {
            if ((mask & nums[i]) == 0) {
                result[0] ^= nums[i];
            } else {
                result[1] ^= nums[i];
            }
        }
        return result;
    }

//    public int[] singleNumber(int[] nums) {
//        int[] result = new int[2];
//        if (nums.length < 2) return result;
//
//        int xor = nums[0];
//        for (int i = 1; i < nums.length; ++i) xor ^= nums[i];
//
//        int mask = 1;
//        while ((mask & xor) == 0) mask <<= 1;
//
//        int j = -1;
//        for (int i = 0; i < nums.length; ++i) {
//            if ((mask & nums[i]) == 0) {
//                int tmp = nums[i];
//                nums[i] = nums[++j];
//                nums[j] = tmp;
//            }
//        }
//
//        result[0] = getMissingOne(nums, 0, j);
//        result[1] = getMissingOne(nums, j+1, nums.length-1);
//        return result;
//    }
//
//    private int getMissingOne(int[] nums, int left, int right) {
//        int xor = nums[left];
//        for (int i = left + 1; i <= right; ++i) xor ^= nums[i];
//        return xor;
//    }

    public static void main(String[] args) {
        new Solution().singleNumber(new int[]{1,2,1,3,2,5});
    }
}