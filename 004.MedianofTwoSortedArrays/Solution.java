/**
 * 解题思路：
 * 很明显的二分解法。
 * 一直在思考怎么通过二分法来找到中位数，总是想着用一个计数器来统计小于的数的个数，期望达到总数的一半，
 * 却一直没找到正确的出口。
 * 最后根据提示，进一步抽象，寻找第K个最小值，之后豁然开朗。
 */
public class Solution {
    
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        if (len % 2 == 1) {
            return findKth(nums1, 0, nums2, 0, len/2 + 1);
        } else {
            return (findKth(nums1, 0, nums2, 0, len/2) + findKth(nums1, 0, nums2, 0, len/2+1)) / 2;
        }
    }

    private double findKth(int[] nums1, int i1, int[] nums2, int i2, int k) {
        if (i1 >= nums1.length) return nums2[i2 + k - 1];
        if (i2 >= nums2.length) return nums1[i1 + k - 1];
        if (k == 1) return Math.min(nums1[i1], nums2[i2]);
        int idx1 = i1 + k / 2 - 1;
        int idx2 = i2 + k / 2 - 1;
        int key1 = idx1 >= nums1.length ? Integer.MAX_VALUE : nums1[idx1];
        int key2 = idx2 >= nums2.length ? Integer.MAX_VALUE : nums2[idx2];
        if (key1 < key2) {
            return findKth(nums1, i1 + k/2, nums2, i2, k - k/2);
        } else {
            return findKth(nums1, i1, nums2, i2 + k/2, k - k/2);
        }
    }
}
