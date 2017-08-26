/**
 * 解题思路：
 * 利用递归的思想，不断交换。
 */
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permuteHelper(nums, 0, result);
        return result;
    }

    private void permuteHelper(int[] nums, int i, List<List<Integer>> result) {
        if (i == nums.length) {
            List<Integer> content = new ArrayList<>();
            for (int j = 0; j < nums.length; ++j)
                content.add(nums[j]);
            result.add(content);
        } else {
            for (int j = i; j < nums.length; ++j) {
                swap(nums, i, j);
                permuteHelper(nums, i + 1, result);
                swap(nums, i, j);
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
