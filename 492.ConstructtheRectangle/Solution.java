/**
 * 解题思路：
 * 从area的平方根开始，找寻第一个符合要求的数。
 */
public class Solution {
    public int[] constructRectangle(int area) {
        int w = (int) Math.sqrt(area);
        while (area % w != 0) w--;
        return new int[]{ area / w, w };
    }
}