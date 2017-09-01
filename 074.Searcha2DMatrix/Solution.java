/**
 * 解题思路：
 * 二分查找法。
 */
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;
        int row = matrix.length, col = matrix[0].length;
        int up = 0, down = row - 1;
        while (up < down) {
            int mid = up + (down - up) / 2;
            if (matrix[mid][col-1] < target) {
                up = mid + 1;
            } else {
                down = mid;
            }
        }
        return binarySearch(matrix[up], target);

        // for (; i < row; ++i) {
        //     if (target <= matrix[i][col-1]) {
        //         return binarySearch(matrix[i], target);
        //     }
        // }
        // return false;
    }

    private boolean binarySearch(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target)
                return true;
            if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
}
