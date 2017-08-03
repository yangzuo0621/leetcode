import java.util.HashMap;
import java.util.Map;

/**
 * 解题思路：
 * 利用一个map来保存罗马字母与十进制的映射关系，应用罗马数字与十进制的关系进行转换。
 */
public class Solution {

    private static final Map<Character, Integer> mapping = new HashMap<Character, Integer>() {
        {
            put('I', 1); put('V', 5); put('X', 10); put('L', 50); put('C', 100); put('D', 500); put('M', 1000);
        }
    };

    public int romanToInt(String s) {
        int len = s.length();
        if (len == 1) return mapping.get(s.charAt(0));

        int cnt = 0;
        int i = 0;
        for (; i < len - 1; i++) {
            int num1 = mapping.get(s.charAt(i));
            int num2 = mapping.get(s.charAt(i + 1));
            if (num1 < num2) {
                cnt += (num2 - num1);
                i++;
            } else {
                cnt += num1;
            }
        }
        if (i == len- 1) {
            cnt += mapping.get(s.charAt(len-1));
        }
        return cnt;
    }

}