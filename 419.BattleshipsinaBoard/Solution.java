/**
 * 解题思路：
 * DFS
 */
public class Solution {
    public int countBattleships(char[][] board) {
        if (board == null) return 0;
        int row = board.length;
        int col = board[0].length;
        boolean[][] visited = new boolean[row][col];

        int count = 0;
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                if (board[i][j] == 'X' && !visited[i][j]) {
                    ++count;
                    dfs(visited, board, i, j, row, col);
                }
            }
        }
        return count;
    }

    private void dfs(boolean[][] visited, char[][] board, int i, int j, int row, int col) {
        if (i < 0 || i >= row || j < 0 || j >= col || board[i][j] == '.' || visited[i][j])
            return ;

        visited[i][j] = true;
        dfs(visited, board, i - 1, j, row, col); // 向左遍历
        dfs(visited, board, i + 1, j, row, col); // 向右遍历
        dfs(visited, board, i, j + 1, row, col); // 向下遍历
        dfs(visited, board, i, j - 1, row, col); // 向上遍历
    }
}
