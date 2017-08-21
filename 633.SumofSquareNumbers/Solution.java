/**
 * 解题思路：
 * 要善用暴力法，不要因为是暴力法就不去解题。
 * 解题后再去思考是否存在优化的空间。
 */
class Solution {
    public boolean judgeSquareSum(int c) {
        int a = 0, b = (int) Math.sqrt(c);
        while (a <= b) {
            int t = a * a + b * b;
            if (t == c) return true;
            if (t < c) ++a;
            else --b;
        }
        return false;
    }
}