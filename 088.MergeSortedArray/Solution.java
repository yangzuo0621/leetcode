/**
 * 解题思路：
 * 从后往前进行大小比较。
 */
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m + n - 1;
        while (m > 0 || n > 0) {
            int a = Integer.MIN_VALUE, b = Integer.MIN_VALUE;
            if (m > 0) a = nums1[m-1];
            if (n > 0) b = nums2[n-1];
            if (a > b) {
                nums1[index] = a;
                m--;
            } else {
                nums1[index] = b;
                n--;
            }
            index--;
        }
    }
}