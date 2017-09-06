/**
 * 解题思路：
 * 需要考虑很多情况，
 * 1. 长度不同但结果相同的情况，如 "1" 和 "1.0"
 * 2. 考虑前缀0，如 "01"和 "1"
 * 3. 考虑转换溢出
 */
class Solution {
    public int compareVersion(String version1, String version2) {
        int len1 = version1.length(), len2 = version2.length();
        int i = 0, j = 0;
        double d1 = 0.0, d2 = 0.0;
        while (i < len1 || j < len2) {
            while (i < len1 && version1.charAt(i) != '.') {
                d1 = d1 * 10 + version1.charAt(i++) - '0';
            }
            while (j < len2 && version2.charAt(j) != '.') {
                d2 = d2 * 10 + version2.charAt(j++) - '0';
            }
            if (d1 > d2) return 1;
            else if (d1 < d2) return -1;
            d1 = d2 = 0.0;
            ++i;
            ++j;
        }
        return 0;
    }
}
