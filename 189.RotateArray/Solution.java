/**
 * 解题思路：
 * 旋转前n-k个数，旋转后k个数，旋转整个n个数。
 */
public class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int n = k % len;
        if (n == 0) return;

        reverse(nums, 0, len - n - 1);
        reverse(nums, len - n, len - 1);
        reverse(nums, 0, len - 1);
    }

    private void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int tmp = nums[i];
            nums[i++] = nums[j];
            nums[j--] = tmp;
        }
    }

//    public void rotate(int[] nums, int k) {
//        k = k % nums.length;
//        int res[] = new int[nums.length];
//        System.arraycopy(nums, 0, res, k, nums.length - k);
//        System.arraycopy(nums, nums.length - k, res, 0, k);
//        System.arraycopy(res, 0, nums, 0, nums.length);
//    }
}