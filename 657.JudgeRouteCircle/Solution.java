/**
 * 解题思路：
 * 利用两个变量，一个表示垂直方向、一个表示水平方向来标识移动情况。
 */
public class Solution {
    public boolean judgeCircle(String moves) {
        if (moves == null) return true;

        int vertical = 0, horizontal = 0;
        char[] chars = moves.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case 'R': horizontal++; break;
                case 'L': horizontal--; break;
                case 'U': vertical++;   break;
                case 'D': vertical--;   break;
            }
        }

        return (vertical == 0 && horizontal == 0);
    }
}