/**
 * 解题思路：
 * 利用chars统计每个字符出现的频率。
 * 利用辅助数组，数组下标代表频率，因此辅助数组大小不超过原数组大小，
 * 辅助数组是相同频率字符的连接字符串。
 */
class Solution {
    public String frequencySort(String s) {
        int[] chars = new int[256];
        for (int i = 0; i < s.length(); ++i)
            ++chars[s.charAt(i)];
        String[] mapping = new String[s.length() + 1];
        for (int i = 0; i < 256; ++i) {
            if (mapping[chars[i]] == null) mapping[chars[i]] = "";
            // 在字符串拼接操作过多时，StringBuilder能大幅度提升速度
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < chars[i]; ++j) {
                sb.append((char) i);
            }
            mapping[chars[i]] = mapping[chars[i]] + sb.toString();
        }
        StringBuilder builder = new StringBuilder(s.length());
        for (int i = mapping.length - 1; i >= 0; --i) {
            if (mapping[i] != null) builder.append(mapping[i]);
        }

        return builder.toString();
    }
}
