/**
 * 解题思路：
 * 利用快速排序的思想，寻找关键字所在数组位置的下标是否跟第k大一致
 * 从而进行划分解决。
 */
class Solution {
    public int findKthLargest(int[] nums, int k) {
        return findKthLargest(nums, 0, nums.length - 1, k);
    }

    private int findKthLargest(int[] nums, int left, int right, int k) {
        if (left <= right) {
            int index = partition(nums, left, right);
            if (index == k - 1) return nums[index];
            if (index > k - 1) return findKthLargest(nums, left, index - 1, k);
            return findKthLargest(nums, index + 1, right, k);
        }
        return 0;
    }

    private int partition(int[] nums, int left, int right) {
        int key = nums[right];
        int pos = left - 1;
        for (int i = left; i <= right; ++i) {
            if (nums[i] >= key) {
                int tmp = nums[i];
                nums[i] = nums[++pos];
                nums[pos] = tmp;
            }
        }
        return pos;
    }
}
