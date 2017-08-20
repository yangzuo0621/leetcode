/**
 * 解题思路：
 * 用一个数据累加。
 */
class NumArray {

    private int[] arrs;
    public NumArray(int[] nums) {
        arrs = new int[nums.length + 1];
        for (int i = 1; i < arrs.length; i++) {
            arrs[i] = arrs[i-1] + nums[i-1];
        }
    }

    public int sumRange(int i, int j) {
        return arrs[j] - arrs[i-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */