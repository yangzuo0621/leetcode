import java.util.Arrays;

/**
 * 解题思路：
 * 排序后统计差值为1的数的情形
 * 注意边界情况
 */
class Solution {
    public int findLHS(int[] nums) {
        int[] work = Arrays.copyOf(nums, nums.length);
        Arrays.sort(work);
        int max = 0, lowerCnt = 1, upperCnt = 0;
        boolean flag = false;
        for (int i = 1; i < work.length; i++) {
            if (work[i] == work[i-1]) {
                lowerCnt++;
            } else {
                if (flag)
                    max = Math.max(max, lowerCnt + upperCnt);

                if (work[i] - work[i-1] == 1) {
                    upperCnt = lowerCnt;
                    flag = true;
                } else {
                    flag = false;
                }
                lowerCnt = 1;
            }
        }
        if (flag)
            max = Math.max(max, lowerCnt + upperCnt);

        return max;
    }
}