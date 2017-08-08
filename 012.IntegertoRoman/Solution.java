import java.util.HashMap;
import java.util.Map;

/**
 * 解题思路：
 * 当为9，4时，处于特殊情况，小数在大数左边，如IX，IV
 * 其他情况直接相加。
 */
public class Solution {

    private static final Map<Integer, Character> map = new HashMap<Integer, Character>() {
        {
            put(1, 'I'); put(5, 'V'); put(10, 'X'); put(50, 'L'); put(100, 'C'); put(500, 'D'); put(1000, 'M');
        }
    };

    public String intToRoman(int num) {

        StringBuilder result = new StringBuilder();
        int divisor = 1000;
        int quotient = num / 1000;
        while (quotient > 0) {
            result.append(map.get(divisor));
            quotient--;
        }

        num = num % divisor;
        divisor /= 10;
        int remainder = 0;

        while (true) {
            if (num == 0) break;

            remainder = num / divisor;

            if (remainder == 9) {
                result.append(map.get(divisor));
                result.append(map.get(divisor*10));
                num = num % divisor;
                divisor /= 10;
                continue;
            }

            if (remainder == 4) {
                result.append(map.get(divisor));
                result.append(map.get(divisor*5));
                num = num % divisor;
                divisor /= 10;
                continue;
            }

            if (remainder >= 5) {
                result.append(map.get(divisor*5));
            }

            remainder = remainder % 5;
            while (remainder > 0) {
                result.append(map.get(divisor));
                remainder--;
            }

            if ((num % (divisor*5)) == 0) break;

            num = num % divisor;
            divisor /= 10;
        }

        return result.toString();
    }
}