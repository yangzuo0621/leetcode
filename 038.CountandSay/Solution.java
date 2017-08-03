/**
 * 解题思路：
 * 根据规则，一个一个产生。
 */
public class Solution {

    public String countAndSay(int n) {
        if (n <= 0) return "";

        String result = "1";
        while (n-- > 1) {
            result = generate(result);
        }
        return result;
    }

    private String generate(String s) {
        StringBuilder builder = new StringBuilder();

        char cur = s.charAt(0);
        int cnt = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == cur) cnt++;
            else {
                builder.append(cnt);
                builder.append(cur);
//                builder.append(String.format("%d%c", cnt, cur)); // 这种效率比较低 ？！
                cur = s.charAt(i);
                cnt = 1;
            }
        }
        builder.append(cnt);
        builder.append(cur);
//        builder.append(String.format("%d%c", cnt, cur));

        return builder.toString();
    }
}