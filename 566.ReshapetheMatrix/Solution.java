/**
 * 解题思路：
 * 以行为单位进行转换。
 */
public class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if (nums == null) return null;
        int row = nums.length, col = nums[0].length;
        if (row * col != r * c) return nums;

        int[][] result = new int[r][c];
        int n = 0, m = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[m][n++] = nums[i][j];
                if (n >= c) {
                    n = 0;
                    m++;
                }
            }
        }
        return result;
    }
}