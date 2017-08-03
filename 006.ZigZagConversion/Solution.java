/**
 * 解题思路：
 * 根据行计算每个字符相隔的距离
 * 假设共n行，那么处在第i行上的间隔为
 * step1 = 2 * (n - i + 1) -3
 * step2 = 2 * row - 2
 * 处在第1行和第n行的间隔为 2 * n - 3
 */
public class Solution {

    public String convert(String s, int numRows) {
        if (numRows == 1) return s;

        StringBuilder builder = new StringBuilder();
        int len = s.length();
        for (int row = 1; row <= numRows; row++) {
            int step1 = 2 * numRows - 3;
            int step2 = step1;
            if (row != 1 && row != numRows) {
                step1 = 2 * (numRows - row + 1) - 3;
                step2 = 2 * row - 3;
            }
            boolean flag = true;
            int index = row - 1;
            while (index < len) {
                builder.append(s.charAt(index));
                if (flag) {
                    index += step1 + 1;
                    flag = false;
                } else {
                    index += step2 + 1;
                    flag = true;
                }
            }
        }
        return builder.toString();
    }
}