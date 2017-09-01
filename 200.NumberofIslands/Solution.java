/**
 * 解题思路：
 * 图的搜索。
 */
class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int count = 0;
        int row = grid.length, col = grid[0].length;
        boolean[][] mark = new boolean[row][col];
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                if (grid[i][j] == '1' && !mark[i][j]) {
                    ++count;
                    dfs(grid, mark, i, j, row, col);
                }
            }
        }
        return count;
    }

    private void dfs(char[][] grid, boolean[][] mark, int i, int j, int row, int col) {
        if (i < 0 || j < 0 || i >= row || j >= col || grid[i][j] == '0' || mark[i][j])
            return;

        mark[i][j] = true;
        dfs(grid, mark, i + 1, j, row, col);
        dfs(grid, mark, i - 1, j, row, col);
        dfs(grid, mark, i, j + 1, row, col);
        dfs(grid, mark, i, j - 1, row, col);
    }
}
