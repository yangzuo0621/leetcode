/**
 * 解题思路：
 * 分行、列、块分别进行验证。
 */
class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] rowValid = new int[10];
        int[] columnValid = new int[10];
        int[] gridValid = new int[10];

        for (int i = 0; i < 9; ++i) {
            Arrays.fill(rowValid, 0);
            Arrays.fill(columnValid, 0);
            Arrays.fill(gridValid, 0);

            for (int j = 0; j < 9; ++j) {
                if (!check(rowValid, board[i][j]-'0') ||
                    !check(columnValid, board[j][i]-'0') ||
                    !check(gridValid, board[i/3*3+j/3][i%3*3+j%3]-'0')) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean check(int[] valid, int num) {
        if (num < 0) return true;
        if (valid[num] == 1)
            return false;
        valid[num] = 1;
        return true;
    }
}
