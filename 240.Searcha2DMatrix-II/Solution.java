/**
 * 解题思路：
 * 右上角的元素具有性质：
 * 1. 比它大的数都在下面
 * 2. 比它小的数都在左边
 * 利用这个性质从右上角开始搜索。
 */
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) return false;
        int row = 0, col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target)
                return true;
            if (matrix[row][col] > target) {
                --col;
            } else {
                ++row;
            }
        }
        return false;
    }
}
