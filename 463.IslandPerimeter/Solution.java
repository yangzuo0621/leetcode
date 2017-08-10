/**
 * 解题思路：
 * 计算1的个数 并计算重复边的个数
 */
public class Solution {
    public int islandPerimeter(int[][] grid) {
        if (grid == null) return 0;
        int row = grid.length, col = grid[0].length;

        int cnt = 0, repeat = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 0) continue;
                cnt++;
                if (i != 0 && grid[i-1][j] == 1) repeat++;
                if (j != 0 && grid[i][j-1] == 1) repeat++;
            }
        }
        return cnt * 4 - repeat * 2;
    }
}